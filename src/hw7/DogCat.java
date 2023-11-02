package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DogCat {

//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注意
//物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		File data = new File("C:\\data");
//		data.mkdir();

//		Dog[] dogs = new Dog[2];
//		Cat[] cats = new Cat[2];
//		
//		dogs[0] = new Dog("smalldog");
//		dogs[1] = new Dog("bigdog");
//		cats[0] = new Cat("smallcat");
//		cats[1] = new Cat("bigcat");
//		
//		FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		for(int i = 0; i < dogs.length; i++) {
//			oos.writeObject(dogs[i]);
//		}
//		
//		for(int i = 0; i < cats.length; i++) {
//			oos.writeObject(cats[i]);
//		}
//		
//		oos.close();
//		fos.close();

//承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計

		FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				Object obj = ois.readObject();

				if (obj instanceof Dog)
					((Dog)obj).speak();
				else
					((Cat)obj).speak();

			}
		} catch (EOFException e) {
		}
	}

}