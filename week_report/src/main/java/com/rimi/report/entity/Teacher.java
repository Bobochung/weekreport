package com.rimi.report.entity;

public class Teacher {
	private int id;
	private String teacher_name;
	private String teacher_password;
	private Part part;
	private Classes classes;
	private String teacher_tel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_password() {
		return teacher_password;
	}
	public void setTeacher_password(String teacher_password) {
		this.teacher_password = teacher_password;
	}

	public String getTeacher_tel() {
		return teacher_tel;
	}
	public void setTeacher_tel(String teacher_tel) {
		this.teacher_tel = teacher_tel;
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
		return "Teacher [id=" + id + ", teacher_name=" + teacher_name + ", teacher_password=" + teacher_password
				+ ", part=" + part + ", classes=" + classes + ", teacher_tel=" + teacher_tel + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
