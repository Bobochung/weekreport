package com.rimi.report.entity;

public class Part {
	
	private int id;
	private String part_name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPart_name() {
		return part_name;
	}
	public void setPart_name(String part_name) {
		this.part_name = part_name;
	}
	
	@Override
	public String toString() {
		return "Part [id=" + id + ", part_name=" + part_name + "]";
	}
	

}
