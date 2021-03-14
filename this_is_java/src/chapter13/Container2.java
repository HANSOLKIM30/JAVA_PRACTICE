package chapter13;

public class Container2<K, V> {

	private K k;
	private V v;
	
	public K getKey() {
		return this.k;
	}
	public V getValue() {
		return this.v;
	}
	
	public void set(K k, V v) {
		this.k = k;
		this.v = v;
	}
}
