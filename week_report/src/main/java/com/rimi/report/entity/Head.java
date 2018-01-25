package com.rimi.report.entity;

public class Head {
	private int hid;
	private String head_name;
	private String head_password;
	private String head_tel;
	private Part part;
	
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHead_name() {
		return head_name;
	}
	public void setHead_name(String head_name) {
		this.head_name = head_name;
	}
	public String getHead_password() {
		return head_password;
	}
	public void setHead_password(String head_password) {
		this.head_password = head_password;
	}
	
	public String getHead_tel() {
		return head_tel;
	}
	public void setHead_tel(String head_tel) {
		this.head_tel = head_tel;
	}
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	@Override
	public String toString() {
		return "Head [id=" + hid + ", head_name=" + head_name + ", head_password=" + head_password + ", part=" + part
				+ ", head_tel=" + head_tel + "]";
	}
	
	

}
