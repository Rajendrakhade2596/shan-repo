package com.basics;

public class Test extends A {
	public void m2() {
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		A aa = new A();
		aa.m1();
		A aa1 = new Test();
		aa1.m1();
		//aa1.m2();
		Test test = new Test();
		test.m1();
		test.m2();
	}

}
