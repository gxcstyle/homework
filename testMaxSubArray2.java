package com.gxc.test;

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;

public class MyTest2 {

	@DataPoint 
	public static  float[] array1 ={-2,11,-4,13,-5,-6};
	@DataPoint 
	public static  float[] array2 ={1,-2,3,5,-1,2};
	@DataPoint 
	public static  float[] array3 ={2,4,-7,5,2,-1,2,-4,3};
	
	@Before
	public void setUp() throws Exception {
	}

	@Theory
	@Test
	public void testShowMax() {
		Test2 t2 = new Test2();
		
		assertEquals(20,Test2.showMax(array1,0,array1.length-1),0.0);
		assertEquals(9,Test2.showMax(array2,0,array2.length-1),0.0);
		assertEquals(8,Test2.showMax(array3,0,array3.length-1),0.0);
	}

}
