package j0804;

class Animal {                       //클래스가 있어야지 (빈 껍데기일 뿐이라도) 객체 사용이 가능!
	String name;                     //클래스에 선언된 변수를 객체 변수(instance variable), 인스턴스 변수, 멤버 변수, 속성


public void setName(String name) {    //값만 넣으면 되니까 리턴값 없는 void method씀!
	this.name=name;                   //cat.name = "야옹이"
 }
}

public class exam02 {

	public static void main(String[] args) {
		// 점프 투 자바 - 클래스와 객체
		
		 Animal cat = new Animal();   //new는 객체 생성 키워드! cat은 객체 & Animal 클래스에 의해 만들어진 인스턴스!
		 Animal dog = new Animal();
		 Animal horse = new Animal();
		 
		 cat.name = "야옹이";
		 cat.setName("야옹이");         //메서드 호출. method call
		 dog.setName("해피");
		 horse.setName("홀스");  
		 
		 System.out.println(cat.name); //null은 값이 할당되어 있지 않은 상태
		 System.out.println(dog.name);
		 System.out.println(horse.name);
	}

}
