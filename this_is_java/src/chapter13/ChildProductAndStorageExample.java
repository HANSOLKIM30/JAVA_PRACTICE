package chapter13;
// 제네릭 사용 타입 클래스
public class ChildProductAndStorageExample {
	 public static void main(String[] args) {
		 
		ChildProduct<TV, String, String> product = new ChildProduct<TV, String, String>();
		product.setKind(new TV());
		product.setModel("smartTV");
		product.setCompany("Samsung");
		
		Storage<TV> storage = new StorageImpl<TV>(100);
		storage.add(new TV(), 0);
		TV tv = storage.get(0);
	}
}
