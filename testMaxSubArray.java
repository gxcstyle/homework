package com.gxc.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 * ±©¡¶À„∑®
 * @author star
 *
 */
@RunWith(Parameterized.class)
public class TestDemo1 {

		float expected =0;
		float[] input={};
		
		public TestDemo1(float expected,float[] input)
		{
			this.expected = expected;
			this.input =input;
		}
		
		@Parameters
		public static Collection<Object[]> t()
		{
			float[] arr1={-2,11,-4,13,-5,-6};
			float[] arr2={1,-2,3,5,-1,2};
			float[] arr3={2,4,-7,5,2,-1,2,-4,3};
			return Arrays.asList(
					new Object[][]{
						{20,arr1},
						{9,arr2},
						{8,arr3}
						});
		}
		
		@Test
		public void testShowMax()
		{
			assertEquals(expected,Test1.maxSubSumCubic(input),0.0);
		}
}
