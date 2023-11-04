package hw8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {

	public static void main(String[] args) {

		Train tr1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train tr2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train tr3 = new Train(118, "自強", "高雄", "台北", 500);
		Train tr4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train tr5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train tr6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train tr7 = new Train(1254, "區間", "屏東", "基隆", 700);

//		Set<Train> set1 = new HashSet<>();
//		set1.add(tr1);
//		set1.add(tr2);
//		set1.add(tr3);
//		set1.add(tr4);
//		set1.add(tr5);
//		set1.add(tr6);
//		set1.add(tr7);

//		Iterator it1 = set1.iterator();
//		while (it1.hasNext()) {
//			System.out.println(it1.next());
//		}

//		for (Train train : set1) {
//			System.out.println(train);
//		}
//-------------------------------------------------------------

//		List<Train> set2 = new ArrayList<>();
//		set2.add(tr1);
//		set2.add(tr2);
//		set2.add(tr3);
//		set2.add(tr4);
//		set2.add(tr5);
//		set2.add(tr6);
//		set2.add(tr7);
//
//		Collections.sort(set2);

//		for (Train train : set2) {
//			System.out.println(train);
//		}

//		Iterator it2 = set2.iterator();
//		while (it2.hasNext()) {
//			System.out.println(it2.next());
//		}

//		for (int i = 0; i < set2.size(); i++) {
//			System.out.println(set2.get(i));
//		}

//-------------------------------------------------------------

		Set<Train> set3 = new TreeSet<>();
		set3.add(tr1);
		set3.add(tr2);
		set3.add(tr3);
		set3.add(tr4);
		set3.add(tr5);
		set3.add(tr6);
		set3.add(tr7);

		Iterator it3 = set3.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}

		for (Train train : set3) {
			System.out.println(train);
		}

//-------------------------------------------------------------

	}

}
