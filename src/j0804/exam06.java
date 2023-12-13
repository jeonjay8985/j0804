package j0804;

class Animal2 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal2 {  // Animal2 클래스를 상속한다.
	 void sleep() {
	        System.out.println(this.name+" zzz");  
	    }
}

class HouseDog extends Dog {
	 void sleep() {
	 System.out.println(this.name + " zzz in house"); //오버라이딩은 덮어쓰기=안의 내용 같음
        }
	 void sleep(int hour) {                           //오버로딩은 재정의 = int hour을 추가하여 다시 정의
	        System.out.println(this.name + " zzz in house for " + hour + " hours");
	    }
	 
}

public class exam06 {

	public static void main(String[] args) {
		// 점프 투 자바 - 상속

		  Dog dog = new Dog();
		  dog.setName("poppy");
		  System.out.println(dog.name);
		  dog.sleep();
		  
		  HouseDog houseDog = new HouseDog();
	      houseDog.setName("happy");
	      houseDog.sleep(); 
	      houseDog.sleep(3);
		}

	}


