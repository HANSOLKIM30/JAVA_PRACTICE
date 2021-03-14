package chapter15;

import java.util.Stack;

// Stack을 이용한 동전케이스
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 동전을 끼움 - LIFO
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); // push, pop, peek
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
	}
}
