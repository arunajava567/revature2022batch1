package com.revature.servlets;

public class Course {
	private Integer courseId;
	private String name;
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course(Integer courseId, String name) {
		super();
		this.courseId = courseId;
		this.name = name;
	}
	
	

}
