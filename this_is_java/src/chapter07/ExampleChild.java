package chapter07;

public class ExampleChild extends ExampleParent {
	private String name;
	
	public ExampleChild() {
		this("홍길동");
		System.out.println("Child Call()");
	}
	
	public ExampleChild(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}	
}
