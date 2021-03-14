package chapter11;

// finalize() 재정의
public class Counter {

	/*
	* 참조객체를 더 이상 사용하지 않을 경우, Garbage Collecter가 수집, finalize를 사용하여 해당 객체를 Heap 영역에서 제거.
	* 기본적으로 finalize는 아무 내용이 없음.
	* 사용자가 리소스를 닫거나, 제거 전에 추가하고 싶을 내용이 있을 경우 오버라이딩하여 사용.
	*/
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의  finalize()가 실행됨.");
	}
}
