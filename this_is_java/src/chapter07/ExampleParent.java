package chapter07;

public class ExampleParent {

	public String nation;
	
	public ExampleParent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public ExampleParent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
