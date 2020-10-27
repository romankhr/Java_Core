package HomeWork11MyArrayList;

public class ApplicationMyArrayList {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		list.add("d");
		list.add("w");
		list.add("3");
		list.add("g");
		list.add("d");
		list.add("w");
		list.add("3");
		list.add("g");
		System.out.println("Element   "+ list.get(0));
		System.out.println("Element   "+ list.get(3));
		System.out.println("Element   "+ list.get(5));
		System.out.println("Element   "+ list.get(6));
		list.add("6");
		list.add("rr");
		list.add("n");
		list.add("z");
		System.out.println("Element   "+ list.get(7));
		System.out.println("Element   "+ list.get(9));
		System.out.println("Element   "+ list.get(11));
		System.out.println("Element   "+ list.get(10));
		System.out.println("      Before remove   "+ list.get(5));
		System.out.println("Element   "+ list.get(5));
		list.remove(5);
		System.out.println("    After remove   "+ list.get(5));

	}

}
