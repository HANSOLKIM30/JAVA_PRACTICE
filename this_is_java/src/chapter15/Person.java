package chapter15;

public class Person implements Comparable<Person>{
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	// Comparable 인터페이스에서 지정한 타입이 매개 변수로 쓰임.
	public int compareTo(Person o) {
		if(this.age < o.age) {
			return -1; 
		} else if(this.age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}
	
}
