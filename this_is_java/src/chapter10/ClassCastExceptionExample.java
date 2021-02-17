package chapter10;

public class ClassCastExceptionExample {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
	}
	
	public static void changeDog(Animal animal) {	// 자동형변환: Animal animal = new Dog();
		
		// 강제 타입 변환
		//Dog dog = (Dog) animal;	ClassCastException 발생
		
		if(animal instanceof Dog) {	// 타입 변환이 가능한지 체크
			Dog dog = (Dog) animal;
		}
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
