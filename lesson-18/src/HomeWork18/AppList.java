package HomeWork18;


import java.util.ArrayList;

public class AppList {

	public static void main(String[] args) {

		
		ArrayList<String> list = new ArrayList();
		list.add("Java");
		list.add("C++");
		list.add("Phyton");
		System.out.println("----ArrayList<String>-----");
		System.out.println(list);
		ArrayList<Integer> data = new ArrayList(list);
		System.out.println("\n----ArrayList<Integer>-----");
		System.out.println(data);
		
		
	}

}
