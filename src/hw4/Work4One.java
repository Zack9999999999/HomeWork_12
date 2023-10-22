package hw4;

public class Work4One {

	int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 }; // 長度10
	int y; // 存x陣列總和

	public void avg() {

		for (int i = 0; i < x.length; i++) { // 走訪陣列
			y += x[i]; // 陣列加總
			if (i == x.length - 1) { // 迴圈跑完後將y除x陣列長度
				y /= x.length;
				System.out.println(y);
			}
		}
		for(int i = 0; i < x.length; i++) {
			if(x[i] > y) // 元素大於總和的話
				System.out.print(x[i] + " ");
		}
		
	}
}
