package test.sub02;
//access 기준 외부 package 상속 class
import test.sub01.access;

public class teest1 extends access{

	public static void main(String[] args) {
		access ac = new access();
		ac.a = 10;
        ac.name2 = "이름2";
		//ac.name1 = "이름1"; -> 오류 발생.
		
		
		
	}

}