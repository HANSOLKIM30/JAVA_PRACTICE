package chapter15;

// hashCode()와 equal() 재정의
public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// 같은 객체인지 hashCode -> equal을 통해 검사하므로 반드시 오버라이딩 필요
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (this.sno == student.sno && this.name.equals(student.name));
		} else {
			return false;
		}
	}
}
