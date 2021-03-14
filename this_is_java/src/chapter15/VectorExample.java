package chapter15;

import java.util.*;

/* 
 * Board 객체를 저장하는 Vector
 * ArrayList와 동일하지만, thread-Safe하다.
 * 순서 O, 중복 O
 */
public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		// Board 객체를 저장
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		// 2번 인덱스 객체 삭제(내용3)
		list.remove(2);
		// 3번 인덱스 객체 삭제(내용5)
		list.remove(3);
		
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
			
		}
		
	}
}
