package com.sunmengjie.entity;

public class Sun {

	private String c1;
	
	private String c2;
	
	private String sortName;

	public Sun(String c1, String c2, String sortName) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		this.sortName = sortName;
	}

	public Sun() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	@Override
	public String toString() {
		return "Sun [c1=" + c1 + ", c2=" + c2 + ", sortName=" + sortName + "]";
	}
	
	
}
