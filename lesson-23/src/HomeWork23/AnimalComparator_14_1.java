package HomeWork23;

import java.util.Comparator;

public class AnimalComparator_14_1 implements Comparator<Animal_14_1>{

	@Override
	public int compare(Animal_14_1 o1, Animal_14_1 o2) {
		if(o1.getName().compareTo(o2.getName())>0) {
			return 1;
		}else if(o1.getName().compareTo(o2.getName())<0) {
			return -1;
		}else if(o1.getWight()>o2.getWight()) {
			return 1;
		}else if(o1.getWight()<o2.getWight()) {
			return -1;
		}
		
		return 0;
	
	
	}

}
