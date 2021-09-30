package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.CategoryDetails;
import com.app.pojos.Roles;
import com.app.pojos.User;
import com.app.service.INewsService;
import com.app.service.IUserService;

@Controller // mandatory
@RequestMapping("/reporter") // optional
public class ReporterController {
	// dependency : service layer i/f
	@Autowired
	private IUserService userService;
	private INewsService newsService;


	public ReporterController() {
		System.out.println("in ctor of " + getClass().getName());
	}

	// add req handling method (to service GET) : to show login form
	@GetMapping("/login")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/reporter/login";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}

	// add req handling method(to service POST) : to process the form
	@PostMapping("/login")
	// In HandlerMapping bean :
	// key : /user/login+method=POST
	// value : com.app.controller.UserController.processLoginForm
	// Which req params will be sent from the clnt ? email n pwd
	public String processLoginForm(@RequestParam String email, 
			@RequestParam(name = "password") String pwd, Model map,HttpSession session)
	// SC : String email=request.getParameter("email");
	// String pwd=request.getParameter("password");
	// RECO : Match req param names with method arg names!
	{
		System.out.println("in process login form " + email + " " + pwd);
		try {
			// invoke service layer method for user validation
			User user = userService.validateUser(email, pwd);
			// => valid login
			//add validated user details under model map , as model attribute --so that D.S will store it auto 
			//under request scope.
			session.setAttribute("user_details", user);
			// role checking
			if (user.getRole().equals(Roles.REPORTER))
				return "/reporter/welcome";//AVN : /WEB-INF/views/admin/add_tut_form.jsp
		//	return "/customer/topics";// LVN : /customer/topics
			return "redirect:/reporter/login";
			//UserController ---> redirect view name --> D.S -->
			//response.sendRedirect(response.encodeRedirectURL("customer/topics")
			//WC --sends temp redirect resp SC 302 | Header : location : customer/topics;jsessionId=fhgsf453624
			//Clnt browser sends next req : http://host:port/day16_spring_boot_mvc/customer/topics 

		} catch (RuntimeException e) {
			System.out.println("err in user controller " + e);
			map.addAttribute("message", "Invalid Login , Please retry !!!!!!");
			return "/reporter/login";// Actual View Name(AVN) : /WEB-INF/views/user/login.jsp
		}

	}
	
	@GetMapping("/register")
	public String showRegisterForm(Model model) {
		return "/reporter/register";
	}

	@PostMapping(path="/register" , consumes="application/x-www-form-urlencoded")
	public String processAdmitForm(final User u,Model map) {
	//	System.out.println("in process form " + u);
		//userDao.registerUser(u);
		userService.saveUser(u);
		map.addAttribute("message", "Registration is Successfull");
		
		return "/reporter/register";
	}
	
	@GetMapping("/addnews")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String addNewsForm(Model model) {
		System.out.println("in show login form");
		return "/reporter/addnews";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	
	@PostMapping(path="/addnews" , consumes="application/x-www-form-urlencoded")
	public String processAdmitForm(final CategoryDetails n) {
		System.out.println("in process form " + n);
		//userDao.registerUser(u);
		userService.saveNews(n);
		return "/reporter/addnews";
	}
	
	@GetMapping("/managenews")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String managenews(Model map) {
		System.out.println("in show login form");
		map.addAttribute("listnews", userService.listNews());
		return "/reporter/managenews";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	
	//add req handling method to show update form
	@GetMapping("/updatenews")
	public String showNewsUpdateForm(@RequestParam int vid,Model map)
	{
		System.out.println("in show update form "+vid+" "+map);
		//invoke service layer method , get detached POJO from service layer n bind it to form data
		map.addAttribute("user",newsService.getDetails(vid));
		return "/reporter/updatenews";
	}
	//add req handling method for processing update form
	@PostMapping("/updatenews")
	public String processNewsForm(CategoryDetails user,RedirectAttributes flashMap)
	{
		System.out.println("process update form "+user);//vendor : DETACHED POJO containing updated state
		flashMap.addFlashAttribute("message", newsService.updateDetails(user));
		return "redirect:/reporter/managenews";
	}
	
	// add req handling method to delete vendor details
	@GetMapping("/deletenews")
	public String deleteNewsDetails(@RequestParam int vid, RedirectAttributes flashMap) {
		System.out.println("in del vendor dtls " + vid + " " + flashMap);
		// invoke service layer method , get the result(mesg) n add it under flash scope
		flashMap.addFlashAttribute("message", newsService.deleteDetails(vid));
		return "redirect:/admin/managenews";

	}
	
	
	//add request handling method to log out user
	@GetMapping("/logout")
	public String logOut(HttpSession session,Model map,HttpServletResponse resp,HttpServletRequest request)
	{
		System.out.println("in user logout");
		//retrieve user details from session n add it under request scope(=model attribute)
		map.addAttribute("user_dtls", session.getAttribute("user_details"));
		//How to navigate the clnt auto to the next pager after some dly ?
		//set resp header : refresh value : 10;url=home page
		resp.setHeader("refresh", "5;url="+request.getContextPath());// : /day16_spring_boot_mvc
		//invalidate session
		session.invalidate();
		return "/reporter/logout";//AVN : /WEB-INF/views/user/logout.jsp
	}
	
	@GetMapping("/welcome")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String welcome() {
		System.out.println("in show login form");
		return "/reporter/welcome";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
}
