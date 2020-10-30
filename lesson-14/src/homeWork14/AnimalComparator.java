package homeWork14;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
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
