package com.customCollection.CustomHashSet;

public class BucketArray<E> implements SetBucket<E> {
	private CustomArrayList setArrayList = new CustomArrayList(0);

	public void add(Object e) {
		if (setArrayList.duplicates(e)) {
		} else {
			setArrayList.add(e);
		}
	}

	public void remove(Object o) {
		setArrayList.remove(o);
	}

	public int size() {
		return setArrayList.size();
	}

	public boolean isEmpty() {
		if (setArrayList.size() == 0)
			return true;
		else
			return false;
	}

	public boolean contains(Object o) {
		return setArrayList.contain(o);
	}

	public String toString() {
		if (this.isEmpty()) {
			return "";
		} else
			return setArrayList.toString().replace("[", "").replace("]", "");
	}
}
