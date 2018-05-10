package com.appp;

public class Sample {

	private int sid;
	private String sname;
	private double smarks;
	
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Long getSmarks() {
		return smarks;
	}
	public void setSmarks(Long smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "Sample [sid=" + sid + ", sname=" + sname + ", smarks="+ smarks +"]";
	}
	
 
}
