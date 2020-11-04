package HomeWork18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyMap<K,V> {
	

	List<MyEntry<K,V>> list;
	
	public MyMap() {
		list=new ArrayList<MyEntry<K,V>>();
	}
	
	public void put(K key,V value) {
		
		MyEntry<K,V> entry =new MyEntry<K,V>(key,value);
		if(!list.contains(entry))
			list.add(entry);
	}
	
	public V get(K key) {
		for (MyEntry<K, V> myEntry : list) {
			if (myEntry.getKey().equals(key)) {
				return myEntry.getValue();
			}
		}
		return null;
	}
	
	
	public void delByKey(K key) {
		Iterator<MyEntry<K, V>> iter =list.iterator();
		while(iter.hasNext()) {
			if (iter.next().getKey().equals(key)) {
				iter.remove();
			}
		}
		
		
	}

	public void delByValue(V value) {
		Iterator<MyEntry<K, V>> iter =list.iterator();
		while(iter.hasNext()) {
			if (iter.next().getValue().equals(value)) {
				iter.remove();
			}
		}
	}
	
	public Set showKeys() {
		Set<K> setKey = new HashSet<>();
		for (MyEntry<K, V> myEntry : list) {
			setKey.add(myEntry.getKey());
		}
		return setKey;
	}
	
	public List showValues() {
		List<V> listValues = new ArrayList<>();
		for (MyEntry<K, V> myEntry : list) {
			listValues.add(myEntry.getValue());
		}
		return listValues;
	}
	
	public void showMyMap() {
		
		for (MyEntry<K, V> myEntry : list) {
			System.out.println(myEntry);
		}
	}
	
}
