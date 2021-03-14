package chapter11;

public class Member {

	private String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}	
}
