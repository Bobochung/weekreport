package com.rimi.report.entity;

public class Content {
	private int cid;
	private String content;
	private String type;
	private String date;
	private Part part;
	private Classes classes;	
	private Teacher teacher;
	
	//SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日");
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
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
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Content [cid=" + cid + ", content=" + content + ", type=" + type + ", date=" + date + ", part=" + part
				+ ", classes=" + classes + ", teacher=" + teacher + ", toString()=" + super.toString() + "]";
	}
	

}
