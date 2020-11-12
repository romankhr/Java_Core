package HomeWork23;

import java.util.Comparator;

public class CommodityWidthComparator_14_2 implements Comparator<Commodity_14_2>{

	@Override
	public int compare(Commodity_14_2 o1, Commodity_14_2 o2) {
		
		return o1.getWidth()>o2.getWidth()?1:-1;
	}

}
