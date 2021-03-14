package chapter14;

import java.util.function.IntSupplier;

// Supplier 함수적 인터페이스
public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수: " +  num);
	}
}
