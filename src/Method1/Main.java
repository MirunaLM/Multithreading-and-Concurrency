package Method1;

import java.util.Enumeration;

public class Main {

	public static void main(String[] args) {
		
		int n = 20;
		int k = 5;
		
		Intervals interval = new Intervals(n, k);
		Thread[] thread = new Thread[k];
		//This enumeration contains all the HashTable's keys from Intervals object
		Enumeration<Integer> enumeration = interval.getIntervals().keys();
		int i = 0;
			while(enumeration.hasMoreElements()) {
				 
	            Integer key = enumeration.nextElement();
	            System.out.println("min : "  + key 
	                    + " max : "  + interval.getIntervals().get(key));
	            thread[i] = new MyThread(key, interval.getIntervals().get(key));
	            i++;
	        }
		
		for(int j = 0; j < thread.length; j++) {
			thread[j].start();
		}
		
	}

}
