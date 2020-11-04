package HomeWork18;

public class MainMyMap {

	public static void main(String[] args) {
		
		MyMap<String,String> map=new MyMap<>();
		map.put("Roman", "Java");
		map.put("Vova", "C++");
		map.put("Olya", "JavaScript");
		map.put("Vika", "Phyton");
		System.out.println("--------------Show map-----------");
		map.showMyMap();
		System.out.println("--------------Show keys-----------");
		System.out.println(map.showKeys());
		System.out.println("--------------Show values-----------");
		System.out.println(map.showValues());
		System.out.println("--------------Del by key-----------");
		map.delByKey("Vova");
		map.showMyMap();
		System.out.println("--------------Del by value-----------");
		map.delByValue("Phyton");
		map.showMyMap();
		

	}

}
