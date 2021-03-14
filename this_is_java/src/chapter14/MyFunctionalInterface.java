package chapter14;

// 함수적 인터페이스: 하나의 추상 메소드만 있는 인터페이스 -> 람다식을 사용하여 구현 객체 생성 가능
@FunctionalInterface // 람다식을 통한 익명 구현 객체를 생성하기 위해, 추상 메서드가 하나만 있는지 체킹해주는 어노테이션
public interface MyFunctionalInterface {
	public void method();
}
