package chapter15;

import java.util.LinkedList;
import java.util.Queue;

/*
 *  Queue를 이용한 메세지 큐
 *  Queue를 이용한 다른 컬렉션: LinkedList(Queue와 List를 동시 구현함.)
 *  Queue -> LinkedList: Queue<E> queue = new LinkedList<E>();
 */
public class QueueExample {
	public static void main(String[] args) {
		
		// Queue는 인터페이스이기 때문에 Queue를 구현한 LinkedList로 객체 생성
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메세지 저장
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		// 메세지 큐가 비어있는지 확인
		while(!messageQueue.isEmpty()) {
			//
			Message message = messageQueue.poll();	// offer, pool, peek <-> push, pop, peek
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
			
		}
	}
}
