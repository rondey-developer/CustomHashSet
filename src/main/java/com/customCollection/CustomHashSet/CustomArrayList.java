package com.customCollection.CustomHashSet;

import java.util.Arrays;

public class CustomArrayList {
	private Object[] myStore;
	private int actSize = 0;

	public CustomArrayList(int size){
            myStore = new Object[size];
    }
	
	public Object get(int index) {
		if (index < actSize) {
			return myStore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public void add(Object obj) {
		if (myStore.length - actSize < 2) {
			increaseSize();
			myStore[actSize++] = obj;
		} else {
			myStore[actSize++] = obj;
		}
	}
	
	private void increaseSize() {
		myStore = Arrays.copyOf(myStore, myStore.length+1);
	}
	
	public void remove(Object obj){
		myStore = Arrays.stream(myStore)
			    .filter(e -> !e.equals(obj))
			    .toArray(Object[]::new);
		actSize--;
	}
	
	public int size() {
		return actSize;
	}
	
	public boolean duplicates(Object input)
	{
		boolean duplicates=false;
		for (int j=0;j<myStore.length;j++)
		    if (myStore[j] == input)
		      duplicates=true;
		return duplicates;
	}
	
	public boolean contain(Object obj){
		 return Arrays.stream(myStore).anyMatch(obj::equals);
	}
	
	public Object[] getMyStore() {
		return myStore;
	}

	public void setMyStore(Object[] myStore) {
		this.myStore = myStore;
	}
	
	@Override
	public String toString() {
		if(myStore.length != 0)
			return Arrays.toString(myStore);
		else return "";
	}

}
