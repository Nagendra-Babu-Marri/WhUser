package com.appp;

public class Sample {
	
	private Long sno;
	private String name;
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Sample [sno=" + sno + ", name=" + name + "]";
	}
}