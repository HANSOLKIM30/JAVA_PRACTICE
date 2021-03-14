package chapter12;
// 1부터 100까지의 합을 계산하는 스레드
public class SumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return  sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
	}
}
