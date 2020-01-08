package com.customCollection.CustomHashSet;

import static org.mockito.Mockito.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomHashSetTest {
	@Test
	public void newHashSet_should_initialize_as() {
		NewHashSet<?> newHashSet = new NewHashSet<String>();
		assertEquals(0, newHashSet.size());
	}
	
	@Test
	public void newHashSet_should_add() {
		NewHashSet<Integer> newHashSet = new NewHashSet<Integer>();
		newHashSet.add(1);
		assertEquals(true, newHashSet.contains(1));
	}

	@Test
	public void customArraylist_should_remove() {
		NewHashSet<Integer> newHashSet = new NewHashSet<Integer>();
		newHashSet.add(1);
		newHashSet.remove(1);
		assertEquals(false, newHashSet.contains(1));
	}
	
	@Test
	public void newHashSet_should_return_correct_size(){
		NewHashSet<Integer> newHashSet = new NewHashSet<Integer>();
		newHashSet.add(1);
		assertEquals(1, newHashSet.size());
	}
}
