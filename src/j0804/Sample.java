package j0804;

class Calculator {
	int result = 0;

    int add(int num) {
        result += num;
        return result;
}
    int sub(int num) {
        result -= num;
        return result;
    }


/*
class Calculator1 {
	static int result = 0;       //result는 지역변수, 멤버변수
	
	static int add(int num) {    //반환하는거 int로 했는데 왜 반환안해줘? ->에러뜸. void(반환값x)로 해도 ok
		result +=num;
		return result;
	}
}

class Calculator2 {
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
	}*/

}
public class Sample {                              //public class는 하나만 가능!

	public static void main(String[] args) {
		// 점프 투 자바 - 객체 지향 프로그래밍이란?
		
		Calculator cal1 = new Calculator();        //cal1=>객체(독립적)
		Calculator cal2 = new Calculator();        //cal2=>객체(독립적)
		
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		
		System.out.println(cal2.add(3));
		System.out.println(cal2.add(4));
		
		System.out.println(cal1.sub(5));
		System.out.println(cal1.sub(4));
		
		System.out.println(cal2.sub(6));
		System.out.println(cal2.sub(4));
		
		
		
		/*
		System.out.println(Calculator1.add(3));    //ctrl+f11: 실행
		System.out.println(Calculator1.add(4));    //static이기때문에 3+4로 7이 아웃풋됨!
		
		System.out.println(Calculator2.add(3));
		System.out.println(Calculator2.add(3));
        */
	}

}
