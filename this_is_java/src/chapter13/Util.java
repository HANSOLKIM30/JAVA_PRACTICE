package chapter13;

/* 
 * <제네릭 메소드>
 * 
 * 제네릭 메소드란?: 
 * 매개 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드
 * 
 * 선언 방법?
 * 1. 리턴타입 앞에 <타입 파라미터> 기술
 * 2. 매개타입과 리턴타입으로 타입 파라미터를 사용하면 된다.
 * 
 */
public class Util {
	// 제네릭 메서드에 사용되는 타입 파라미터는 지역 변수 처럼 사용 가능하다.
	
	/* 리턴타입을 타입 파라미터로 받는 메서드*/
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	/* 매개변수를 타입 파라미터로 받는 메서드*/
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	/* 제한된 타입 파라미터
	 */
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
	
	// 연습문제 4번
	public static <K, V> V getValue(Pair<K, V> pair, String name){
		if(pair.getKey().equals(name)) {
			return pair.getValue();
		} else {
			return null;
		}
	}
} 
