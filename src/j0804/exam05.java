package j0804;

class Updater {
	 void update(Counter counter) {
	        counter.count++;
	    }
	
    /*void update(int count) {
        count++;
    }*/
}

       //int a =1; 처럼
       //Counter counter = myCounter 이런뜻임!

class Counter {
    int count = 0;  // 객체변수
}

public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter myCounter = new Counter();
        System.out.println("before update: "+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update: "+myCounter.count);
		
		
		/*
	        Counter myCounter = new Counter();
	        System.out.println("before update: "+myCounter.count);
	        Updater myUpdater = new Updater();
	        myUpdater.update(myCounter.count);
	        System.out.println("after update: "+myCounter.count);
	    }*/
	}

}	


