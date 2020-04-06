package com.tddtask.tdd;

import org.junit.Test;

import junit.framework.TestCase;

public class DeleteTest extends TestCase 
{
	
	
	@Test
	public void test1() {
		assertEquals("BCD",Delete.del("ABCD"));
	}
	@Test
	public void test2() {
		assertEquals("CD",Delete.del("AACD"));
	}
	@Test
	public void test3() {
		assertEquals("BCD",Delete.del("BACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",Delete.del("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",Delete.del("AABAA"));
	}
	@Test
	public void test6() {
		assertEquals("",Delete.del(""));
	}
	@Test
	public void test7() {
		assertEquals("",Delete.del("A"));
	}

}
