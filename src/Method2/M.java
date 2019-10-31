package Method2;

import java.util.ArrayList;

public class M {
	int j;
	int k;
	ArrayList<Integer> listM = new ArrayList<Integer>();
	ArrayList<Integer> returnList = new ArrayList<Integer>();

	public M(int j, ArrayList<Integer> listM, int k) {
		this.j = j;
		this.k = k;
		this.listM = listM;
	}

	public ArrayList<Integer> getDevideList() {
		for (int i = 0; i < listM.size(); i++) {
			if (listM.get(i) % (k + 1) == j) {
				returnList.add(listM.get(i));
			}
		}
		return returnList;
	}

}
