package practice_que_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Th_safe {
	
	 public static void main(String[] args) {
	        // Example with Vector (Thread-safe)
	        List<Integer> vectorList = new Vector<>();
	        Runnable vectorRunnable = () -> {
	            for (int i = 0; i < 5; i++) {
	                vectorList.add(i);
	                System.out.println("Vector - Thread: " + Thread.currentThread().getId() + ", Value: " + i);
	            }
	        };

	        // Example with ArrayList (Not thread-safe)
	        List<Integer> arrayList = new ArrayList<>();
	        Runnable arrayListRunnable = () -> {
	            for (int i = 0; i < 5; i++) {
	                arrayList.add(i);
	                System.out.println("ArrayList - Thread: " + Thread.currentThread().getId() + ", Value: " + i);
	            }
	        };

	        // Creating threads for both Vector and ArrayList
	        Thread vectorThread1 = new Thread(vectorRunnable);
	        Thread vectorThread2 = new Thread(vectorRunnable);

	        Thread arrayListThread1 = new Thread(arrayListRunnable);
	        Thread arrayListThread2 = new Thread(arrayListRunnable);

	        // Starting threads
	        vectorThread1.start();
	        vectorThread2.start();

	        arrayListThread1.start();
	        arrayListThread2.start();
	    }

}
