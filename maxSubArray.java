package com.gxc.test;


public class Test1 {
	public static void main(String[] args)
	{
		float[] array = {-2,11,-4,13,-5,-2};
		float max = maxSubSumCubic(array);
		System.out.println(max);
	}
	public static float maxSubSumCubic(float[] array)
	{
		float Max=0;
		for (int start =0;start<array.length;start++)
		{
			float submax = 0;
			for (int end = start;end<array.length;end++)
			{
				submax+=array[end];
				if(submax>Max)
				{
					Max = submax;
				}
			}
		}
		return Max;
	}
}
