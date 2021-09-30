package com.app.pojos;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "category_details")
public class CategoryDetails extends BaseEntity {

	@Column(length = 100)
	private String title;
	@Column(length = 1000)
	private String content;
	@Column(length = 500)
	private String description;
	@Column(name = "date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	@Column(length = 20)
	private String editor_name;
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(length = 100)
	private String comment;
	@Lob
	private byte[] image;

	public CategoryDetails(){
		
	}

	public CategoryDetails(String title, String content, String description, LocalDate date, String editor_name,
			Category category, String comment, byte[] image) {
		super();
		this.title = title;
		this.content = content;
		this.description = description;
		this.date = date;
		this.editor_name = editor_name;
		this.category = category;
		this.comment = comment;
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getEditor_name() {
		return editor_name;
	}

	public void setEditor_name(String editor_name) {
		this.editor_name = editor_name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "CategoryDetails [title=" + title + ", content=" + content + ", description=" + description + ", date="
				+ date + ", editor_name=" + editor_name + ", category=" + category + ", comment=" + comment + ", image="
				+ Arrays.toString(image) + "]";
	}
	
	
}
