package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="feedback")
public class Feedback extends BaseEntity{
	@Enumerated(EnumType.STRING)
	@Column(length=20)
	private FeedbackCategory feedbacktype;
	@Column(length=50)
	private String title;
	@Column(length=300)
	private String description;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	public Feedback() {
		super();
	}
	public Feedback(FeedbackCategory feedbacktype, String title, String description, LocalDate date) {
		super();
		this.feedbacktype = feedbacktype;
		this.title = title;
		this.description = description;
		this.date = date;
	}
	public FeedbackCategory getFeedbacktype() {
		return feedbacktype;
	}
	public void setFeedbacktype(FeedbackCategory feedbacktype) {
		this.feedbacktype = feedbacktype;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	@Override
	public String toString() {
		return "Feedback [feedbacktype=" + feedbacktype + ", title=" + title + ", description=" + description
				+ ", date=" + date + "]";
	} 
	
}
