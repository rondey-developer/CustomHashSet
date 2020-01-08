package com.customCollection.CustomHashSet;

public interface SetBucket<E> {
	public void add(E e);
	public void remove(E e);
	public int size();
    public boolean isEmpty();
    public boolean contains(Object o);
}
