package com.callor.hello.method;

public class MethodB {
	
	// int add() : return type 이 int 인 add() method
	public static int add() {
		int num1 = 30;
		int num2 = 40;
		System.out.println(num1 + num2);
		
		return 0;
	}
	
	public static void main(String[] args) {
		/*
		 * return type 이 void 가 아닌 method 는
		 * 무엇인가 값을  return(피드백)할 것이고
		 * 그 return 한 값은 다른 변수에 할당 할수 있다.
		 * 단, return type 과 변수의 type 이 같아야 된다.
		 */
		int result = add();
	}
	
	

}
