package chapter13;
// 제네릭 구현클래스
// 제네릭 인터페이스를 구현한 클래스도 제네릭 타입이 된다.
public class StorageImpl<T> implements Storage<T> {
	
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[]) new Object[capacity];
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		return this.array[index];
	}	
}
