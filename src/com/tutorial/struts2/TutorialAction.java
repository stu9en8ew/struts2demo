package com.tutorial.struts2;

public class TutorialAction {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() throws Exception {
		return "success";
	}

}
