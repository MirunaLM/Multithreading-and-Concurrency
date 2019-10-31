package Method2;

import java.util.ArrayList;

public class MyThread extends Thread {

	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	int j;

	public MyThread(ArrayList<Integer> list, int j) {
		this.list = list;
		this.j = j;
	}

	public void run() {
		int contor;
		for (int i = 0; i < list.size(); i++) {
			contor = 0;
			for (int k = 1; k < 8; k++) {
				if (list.get(i) % (k + 1) == 0) {
					contor++;
				}
			}
			if(contor == 0) {
				System.out.println(list.get(i) + " is prime in thread " + j);
				primeNumbers.add(list.get(i));
			}
		}
	}

}
