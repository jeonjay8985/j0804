package j0804;

class Sample1 {
	int sum(int a, int b) {
		return a+b;
	}
}

public class exam03 {

	public static void main(String[] args) {
		// 점프 투 자바 - 매서드 더 살펴보기
		int a =3;
		int b =4;
		
		Sample1 smp = new Sample1();     //자기 자신의 객체를 생성
		int c =smp.sum(a, b);            //return했기 때문에 값을 돌려줌!
		
		System.out.println(c);

	}

}
