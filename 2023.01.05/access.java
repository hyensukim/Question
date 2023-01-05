package test.sub01;
// 접근 제어자 test
public class access {

	public int a; // 동일 패키지 클래스 내부 ok, 클래스 외부 ok, 다른 패키지 클래스 ok
	protected String name1;// 동일 패키지 클래스 내부, 클래스 외부 ok 외부 패키지 클래스 X
	protected static String name2; // 동일 패키지 클래스 내부 ok, 클래스 외부 ok, 외부 패키지 클래스(상속시) ok
	static double  b;// 동일 패키지 클래스 내부 ok, 클래스 외부 ok 외부 패키지 클래스 X
	private static String address;// 동일 클래스 내부만 ok

	public void method1() {
		a =10;
		name1 ="김서울";
		b = 2.0;
		address = "서울역";

	}
	
	
}
