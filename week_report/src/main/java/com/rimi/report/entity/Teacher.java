package com.rimi.report.entity;

public class Teacher {
	private int id;
	private String teacher_name;
	private String teacher_password;
	private int part_id;
	private int classes_id;
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
	public int getPart_id() {
		return part_id;
	}
	public void setPart_id(int part_id) {
		this.part_id = part_id;
	}
	public int getClasses_id() {
		return classes_id;
	}
	public void setClasses_id(int classes_id) {
		this.classes_id = classes_id;
	}
	public String getTeacher_tel() {
		return teacher_tel;
	}
	public void setTeacher_tel(String teacher_tel) {
		this.teacher_tel = teacher_tel;
	}
	
	

}
