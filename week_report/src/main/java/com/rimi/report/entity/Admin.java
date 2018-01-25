package com.rimi.report.entity;

public class Admin {
	private int aid;
	private String admin_name;
	private String admin_password;
	private String admin_tel;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getAdmin_tel() {
		return admin_tel;
	}
	public void setAdmin_tel(String admin_tel) {
		this.admin_tel = admin_tel;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [id=" + aid + ", admin_name=" + admin_name + ", admin_password=" + admin_password + ", admin_tel="
				+ admin_tel + "]";
	}
	

}
