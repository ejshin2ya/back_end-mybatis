package com.ssafy.board.model.dto;

public class Board {
	private int id;
	private String name;
	private int age;
	private int deptno;
	private String deptname;
	private String location;
	
	public Board() {
		
	}

	public Board(String name, int age, int deptno, String deptname, String location) {
		super();
		this.name = name;
		this.age = age;
		this.deptno =deptno;
		this.deptname = deptname;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", name=" + name + ", age=" + age + ", deptno=" + deptno + ", deptname=" + deptname
				+ ", location=" + location + "]";
	}


	
	
	

}
