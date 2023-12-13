package j0804;

interface Predator {
	 String getFood();
	 

     default void printFood() {
	   System.out.printf("my food is %s\n", getFood());
	    }
}

class Animal4 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

     class Tiger extends Animal implements Predator{ //내가 설정한 인터페이스를 구현하겠다! =>implements
	   public String getFood() {
	   return "apple";
}
     class Lion extends Animal implements Predator{
	   public String getFood() {
	   return "banana";
}
	 class ZooKeeper {
		 void feed(Predator predator) {
		      System.out.println("feed "+predator.getFood());
		    }


/*
class ZooKeeper {
	 public void feed(Predator predator) {
	  System.out.println("feed apple");  // 항상 feed apple 만을 출력한다.
	}
	
	
    void feed(Predator predator) {       // 호랑이가 오면 사과를 던져 준다. 내용다름:메서드 오버로딩
        System.out.println("feed apple");
    }

    void feed(Lion lion) {               // 사자가 오면 바나나를 던져준다. 내용다름:메서드 오버로딩
        System.out.println("feed banana");
    }*/
	 
}
          public class exam08 {

        	public void main(String[] args) {
		    // 점프 투 자바 - 인터페이스
        	//인터페이스의 메서드는 메서드의 이름과 입출력에 대한 정의만 있고 그 내용은 없다

		        ZooKeeper zooKeeper = new ZooKeeper();
		        Tiger tiger = new Tiger();
		        Lion lion = new Lion();
		        /*
		        zooKeeper.feed(tiger);  // feed apple 출력
		        zooKeeper.feed(lion);  // feed banana 출력
		    }*/
		
          }

	    }
     }
 }
