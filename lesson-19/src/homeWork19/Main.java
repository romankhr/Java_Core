package homeWork19;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee("Vasya", 33, 23);
		Employee emp1 = new Employee("Nina", 2, 34);
		Employee emp2 = new Employee("Vova", 4, 30);
		List ls=new ArrayList<>();
		ls.add(emp);
		ls.add(emp1);
		ls.add(emp2);
		
		File file = new File("Emploee.txt");
		Methods met= new Methods();
		met.writeFileSerialize(file, (Serializable) ls);
		System.out.println("-----------Input DATA--------------\n");
		System.out.println(ls);
		
		System.out.println("\n-----------Read DATA from file--------------\n");
		System.out.println(met.readFileSerialize(file));
		

	}

}
