package com.thirdPartyApi.model;

public class User {
	private String name;
	private String job;
	private int id;
	private String createAt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", job=" + job + ", id=" + id + ", createAt=" + createAt + "]";
	}
	
	

}
