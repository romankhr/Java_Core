package HomeWork11MyArrayList;

import java.util.Arrays;

public class MyArrayList {
private String[] arrayList;
private int size=0;
private int index=0;

public MyArrayList() {
	
	arrayList = new String[10];
}
public MyArrayList(int capacity) {
	arrayList = new String[capacity];
}

public void add(String element) {
	if(index==arrayList.length) {
		growArrayList();
	}
	arrayList[index] = element;
	index++;
	size++;
}

private void growArrayList() {
    String[] newArray = new String[arrayList.length * 2];
    System.arraycopy(arrayList, 0, newArray, 0, index - 1);
    arrayList = newArray;
}

public String get(int index) {
    checkIndex(index);
    return arrayList[index];
}

private void checkIndex(int index) {
    if (index < 0 || index >= this.index)
        throw new IllegalArgumentException();
}

public boolean remove(int index) {
    checkIndex(index);
    System.arraycopy(arrayList, index + 1, arrayList, index, this.index - index);
    size--;
    this.index--;
    
    return true;
}
@Override
public String toString() {
	return "MyArrayList [arrayList=" + Arrays.toString(arrayList) + ", size=" + size + ", index=" + index + "]";
}

}
