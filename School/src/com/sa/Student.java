package com.sa;

/**
 * @author student-999
 * @version 1.0
 * 
 */
public class Student {
	private String name;

	/**
	 * 
	 * @param name 新增姓名
	 */
	public Student(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 * @return 姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name 姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return 個人資料
	 */
	public String show()
	{
		return "名:"+name;
	}
}
