package chapter11;

import java.util.Comparator;

import chapter11.CompareExample.Student;

// 학생 번호 비교자
public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		
		if(a.sno < b.sno) {
			return -1;
		} else if(a.sno == b.sno) {
			return 0;
		} else {
			return 1;
		}
	}

}
