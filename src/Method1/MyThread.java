package Method1;

import java.util.ArrayList;

//MyThread class is represented by an "Interval" with min and max values, and it determines the prime numbers from the inteval

public class MyThread extends Thread {
	int min;
	int max;

	public MyThread(int min, int max) {
		this.min = min;
		this.max = max;
	}
	public void run() {
		System.out.println(getPrimeNumbers());
	}

	//The run method determines the prime numbers between 2 limits
	ArrayList<Integer> getPrimeNumbers() {

		ArrayList<Integer> prime = new ArrayList<Integer>();

		while (min < max) {
			boolean flag = false;
			for (int i = 2; i <= min / 2; ++i) {
				if (min % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				prime.add(min);
			}
			++min;
		}
		return prime;
	}

}
