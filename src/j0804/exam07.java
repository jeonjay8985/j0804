package j0804;

//에러있음
class Animal5 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog1 extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
	
	 HouseDog(String name) {
	        this.setName(name);
	    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class exam07 {

	public static void main(String[] args) {
		// 점프 투 자바 - 생성자 ex.클래스의 멤버변수 A, B, C, D, E의 값을 한번에 넣을 수 있음!
		             //객체 변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제할수 있는 방법이 생성자를 이용하는 것
	                 //클래스명과 메서드명이 같다. 리턴 타입을 정의하지 않는다(void도 사용하지 않는다.)
	   //생성자는 객체가 생성될 때 호출된다. 즉, 생성자는 다음과 같이 new 키워드가 사용될 때 호출된다.
	   //생성자가 선언된 경우 생성자의 규칙대로만 객체를 생성해야된다. ex.HouseDog dog = new HouseDog(); 이거 안 됨!
         
		/*
		  HouseDog houseDog = new HouseDog();
		  houseDog.setName("happy");
		  houseDog.sleep();
		  houseDog.sleep(3); 
		
        HouseDog dog = new HouseDog();
        System.out.println(dog.name);*/
		
        HouseDog dog = new HouseDog("happy");
        System.out.println(dog.name);
        
 
	   }
	}

