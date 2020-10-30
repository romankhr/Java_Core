package homeWork14;

import java.util.Comparator;

public class CommodityLenghtComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		return o1.getLendht()>o2.getLendht()?1:-1;
	}

}
