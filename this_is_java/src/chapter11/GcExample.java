package chapter11;

// gc 메소드
public class GcExample {

	public static void main(String[] args) {
		
		Employee emp;
		
		emp = new Employee(1);
		emp = null;	// Employee(1)이 참조객체가 아니게 됨으로서 쓰레기로 만듦.
		emp = new Employee(2);
		emp = new Employee(3); // Employee(2)가 참조객체가 아니게 됨으로서 쓰레기로 만듦.
		
		System.out.print("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc();	// 쓰레기 수집기 실행 요청
	}
}

class Employee{
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ")가 메모리에 생성됨.");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee(" + eno + ")가 메모리에 제거됨.");
	}
	
	
}
