package chapter13;

// 제네릭 클래스: 멀티 타입 파라미터
// 부모 제네릭 클래스
public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() { return this.kind;}
	public M getModel() { return this.model;}
	
	public void setKind(T kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;} 
}
