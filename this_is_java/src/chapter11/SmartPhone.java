package chapter11;

// 객체의 문자정보(toSting() 메소드)
public class SmartPhone {

	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	public String toString() {
		return company + ", " + os;
	}
}
