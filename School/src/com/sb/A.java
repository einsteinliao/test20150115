package com.sb;

import com.sa.Student;
import com.sa.Student2;

/**
 * @version 1.0
 * @author student-000
 */
public class A extends Student implements Student2 {

	private int chi;
	
	/**
	 * 
	 * @param name 姓名
	 * @param chi 中文分數
	 */
	public A(String name,int chi) {
		super(name);
		this.chi = chi;
	}

	/**
	 * 
	 * @return 中文分數
	 */
	public int getChi() {
		return chi;
	}

	/** 
	 * 
	 * @param chi  中文分數
	 */
	public void setChi(int chi) {
		this.chi = chi;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return super.show()+ " chi:"+chi;
	}

	@Override
	public void skill() {
		System.out.println("A skill");
		
	}

}
