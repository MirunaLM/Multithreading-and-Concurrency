package Method1;

import java.util.Hashtable;

//This class divides an interval from 1 to n in small intervals using an hashtable for the min and max values

public class Intervals {
	//The key in HashTable represents the min value from an interval
	//The value in HashTable represents the max value from an interval
	Hashtable<Integer, Integer> intervals = new Hashtable<Integer, Integer>();
	int n;
	int k;
	
	public Intervals(int n, int k) {
		this.n = n;
		this.k = k;
		divideIntervals();
	}
	//The diviteIntervals() method divides the big interval in k small intervals with a specific formula
	public void divideIntervals() {
		for(int i = 1 ; i <= k ; i++) {
			intervals.put((i - 1) * (n / k) + (n % k) + 1, i * (n / k) + (n % k));
		}
	}

	public Hashtable<Integer, Integer> getIntervals() {
		return intervals;
	}
	
}
