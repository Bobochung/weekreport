package com.rimi.report.entity;

import java.util.Date;

public class Content {
	private int id;
	private String content;
	private String type;
	private Date date;
	private Part part;
	private Classes classes;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	@Override
	public String toString() {
		return "Content [id=" + id + ", content=" + content + ", type=" + type + ", date=" + date + ", part=" + part
				+ ", classes=" + classes + "]";
	}
	
	

}
