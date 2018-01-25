package com.rimi.report.entity;

public class Part {
	
	private int pid;
	private String part_name;
	

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPart_name() {
		return part_name;
	}
	public void setPart_name(String part_name) {
		this.part_name = part_name;
	}
	
	@Override
	public String toString() {
		return "Part [id=" + pid + ", part_name=" + part_name + "]";
	}
	

}
