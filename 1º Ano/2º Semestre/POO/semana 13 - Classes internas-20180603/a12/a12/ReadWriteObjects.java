package a12;

import java.io.*;

public class ReadWriteObjects {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objetos"));
		for(int i = 0 ; i < 10 ; i++){
			Coisas x = new Coisas(i * 5, i * 10, "POO" + i);
			System.out.println("write " + x);
			oos.writeObject(x);
		}
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objetos"));
		for(int i = 0 ; i < 10 ; i++){
			Coisas y = (Coisas)ois.readObject();
			System.out.println("read  " + y);
		}
		
		ois.close();
	}

}
