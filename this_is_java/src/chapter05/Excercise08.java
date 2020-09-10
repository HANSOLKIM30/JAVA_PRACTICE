package chapter05;

public class Excercise08 {
	public static void main(String[] args) {
		int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 97, 87, 88}};
		
		int sum = 0;
		double avg = 0.0;
		
		int cnt = 0;
		//double cnt = 0.0 → int, double 계산 시, int가 double로 캐스팅.		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		avg = (double) sum / cnt;	//int, int 계산은 int형으로 계산되고, 그 결과가 dobuble로 바뀌는 것. 처음부터 double의 결과값을 얻고 싶다면, (double)로 강제캐스팅.
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
