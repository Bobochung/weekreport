package com.rimi.report.entity;

public class Classes {
	
	private int classes_id;
	private String classes;
	

	public int getClasses_id() {
		return classes_id;
	}
	public void setClasses_id(int classes_id) {
		this.classes_id = classes_id;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	
	@Override
	public String toString() {
		return "Classes [id=" + classes_id + ", classes=" + classes + "]";
	}
	
	

}
