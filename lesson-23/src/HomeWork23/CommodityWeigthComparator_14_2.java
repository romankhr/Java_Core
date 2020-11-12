package HomeWork23;

import java.util.Comparator;

public class CommodityWeigthComparator_14_2 implements Comparator<Commodity_14_2> {

	@Override
	public int compare(Commodity_14_2 o1, Commodity_14_2 o2) {
		
		return o1.getWeight()>o2.getWeight()?1:-1;
	}

}
