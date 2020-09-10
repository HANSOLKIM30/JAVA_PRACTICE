package chapter05;

public class Excercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];	//array[i-1], array[i] 비교할 필요 없이, 그냥 바로 max랑 비교하면 된다.
			}
		}
		
		System.out.println("max: " + max);
	}
}
