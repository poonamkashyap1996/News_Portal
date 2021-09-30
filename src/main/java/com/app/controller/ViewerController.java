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

import com.app.pojos.User;
import com.app.pojos.Feedback;
import com.app.pojos.Roles;
import com.app.service.INewsService;
import com.app.service.IUserService;

@Controller // mandatory
@RequestMapping("/viewer") // optional
public class ViewerController {
	// dependency : service layer i/f
	@Autowired
	private IUserService userService;
	@Autowired
	private INewsService newsService;
	public ViewerController() {
		System.out.println("in ctor of " + getClass().getName());
	}

	// add req handling method (to service GET) : to show login form
	@GetMapping("/login")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/viewer/login";// Handler(UserController) --> LVN --> D.S
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
			if (user.getRole().equals(Roles.VIEWER))
				return "/viewer/welcome";//AVN : /WEB-INF/views/admin/add_tut_form.jsp
		//	return "/customer/topics";// LVN : /customer/topics
			return "redirect:/viewer/login";
			//UserController ---> redirect view name --> D.S -->
			//response.sendRedirect(response.encodeRedirectURL("customer/topics")
			//WC --sends temp redirect resp SC 302 | Header : location : customer/topics;jsessionId=fhgsf453624
			//Clnt browser sends next req : http://host:port/day16_spring_boot_mvc/customer/topics 

		} catch (RuntimeException e) {
			System.out.println("err in user controller " + e);
			map.addAttribute("message", "Invalid Login , Please retry !!!!!!");
			return "/viewer/login";// Actual View Name(AVN) : /WEB-INF/views/user/login.jsp
		}

	}
	
	@GetMapping("/politics")
	//@RequestMapping("/manageusers")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String managepolitics(Model map){
		System.out.println("in show user list");
		map.addAttribute("listpolitics", newsService.listPolitics());
		return "/viewer/politics";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	
	@GetMapping("/entertainment")
	//@RequestMapping("/manageusers")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String manageentertainment(Model map){
		System.out.println("in show user list");
		map.addAttribute("listentertainment", newsService.listEntertainment());
		return "/viewer/entertainment";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	
	@GetMapping("/education")
	//@RequestMapping("/manageusers")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String manageeducation(Model map){
		System.out.println("in show user list");
		map.addAttribute("listeducation", newsService.listEducation());
		return "/viewer/education";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	

	@GetMapping("/sports")
	//@RequestMapping("/manageusers")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String managesports(Model map){
		System.out.println("in show user list");
		map.addAttribute("listsports", newsService.listSports());
		return "/viewer/sports";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	

	@GetMapping("/health")
	//@RequestMapping("/manageusers")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String managehealth(Model map){
		System.out.println("in show user list");
		map.addAttribute("listhealth", newsService.listHealth());
		return "/viewer/health";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	

	@GetMapping("/industry")
	//@RequestMapping("/manageusers")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String manageindustry(Model map){
		System.out.println("in show user list");
		map.addAttribute("listindustry", newsService.listIndustry());
		return "/viewer/industry";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	

	@GetMapping("/economy")
	//@RequestMapping("/manageusers")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String manageeconomy(Model map){
		System.out.println("in show user list");
		map.addAttribute("listeconomy", newsService.listEconomy());
		return "/viewer/economy";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	
	@GetMapping("/welcome")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String welcome() {
		System.out.println("in show login form");
		return "/viewer/welcome";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	
	
	@GetMapping("/register")
	// In HandlerMapping bean :
	// key : /user/login+method=GET
	// value : com.app.controller.UserController.showLoginForm
	public String showRegisterForm(Model model) {
		System.out.println("in show login form");
		return "/viewer/register";// Handler(UserController) --> LVN --> D.S
		// V.R : AVN : /WEB-INF/views/user/login.jsp
	}
	
	@PostMapping(path="/register" , consumes="application/x-www-form-urlencoded")
	public String processAdmitForm(final User u,Model map) {
	//	System.out.println("in process form " + u);
		//userDao.registerUser(u);
		userService.saveUser(u);
		map.addAttribute("message", "Registration is Successfull");
		return "/viewer/register";
	}
	
	@GetMapping("/feedback")
	public String showFeedbackForm(Model model) {
		return "/viewer/feedback";
	}

	@PostMapping(path="/feedback" , consumes="application/x-www-form-urlencoded")
	public String processFeedbackForm(final Feedback u,Model map) {
	//	System.out.println("in process form " + u);
		//userDao.registerUser(u);
		userService.saveFeedback(u);
		map.addAttribute("message", "Thanks for giving valuable feedback....");
		
		return "/viewer/feedback";
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
		return "/viewer/logout";//AVN : /WEB-INF/views/user/logout.jsp
	}
}
