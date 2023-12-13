package j0804;

class Sample3 {
	int a;
	
	void varTest(Sample3 smp) {
		smp.a++;          //this.a++; 로도 가능!
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// 점프 투 자바 - 메서드 더 살펴보기
		
		Sample3 smp = new Sample3();
		smp.a = 1;
		smp.varTest(smp);
		System.out.println(smp.a);

	}

}
