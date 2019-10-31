package Method2;

import java.util.ArrayList;
import java.util.Enumeration;

public class Main {

	public static void main(String[] args) {

		int n = 20;
		int k = 5;

		Thread[] thread = new Thread[k + 1];
		M[] mList = new M[k + 1];

		for (int i = 0; i < thread.length; i++) {
			mList[i] = new M(i, getFinalM(n, k + 1), k);
			ArrayList<Integer> listM = new ArrayList<Integer>();
			listM = mList[i].getDivideList();
			System.out.println(listM + "; j = " + i);
			thread[i] = new MyThread(listM, i);
		}
		for (int j = 0; j < thread.length; j++) {
			thread[j].start();
		}

	}

	// The getFinalM method return an array with numbers between 1 and n without the multiples of k + 1 greater than k + 1
	static ArrayList<Integer> getFinalM(int n, int k) {
		ArrayList<Integer> bigM = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			bigM.add(i);
		}

		for (int i = 0; i < bigM.size(); i++) {
			if (bigM.get(i) % k == 0 && bigM.get(i) > k + 1) {
				bigM.remove(i);
			}
		}
		return bigM;
	}

}
