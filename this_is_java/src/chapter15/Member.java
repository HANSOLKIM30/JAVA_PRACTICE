package chapter15;

public class Member {
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// name과 age 값이 같으면 true를 리턴
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(this.name) && (member.age == this.age);
		} else {
			return false;
		}
	}
	
	// name과 age 값이 같으면 동일한 hashcode가 리턴됨
	@Override
	public int hashCode() {
		// String의 haseCode 이용
		return name.hashCode() + age;
	}
}
