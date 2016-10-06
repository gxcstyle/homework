package com.gxc.test;

//·ÖÖÎËã·¨
public class Test2 {
	public static void main(String[] args)
	{
		float[] array = {-2,11,-4,13,-5,-2};
		float Max = showMax(array,0,array.length-1);
		System.out.println(Max);
	}
	public static float showMax(float[] array,int leftIndex,int rightIndex)
	{
		float sum =0;
		float leftHalfMax=0;
		float rightHalfMax=0;
		
		if (rightIndex==leftIndex)
		{
			return array[rightIndex];
		}
		else
		{
			int center =(leftIndex+rightIndex)/2;
			float maxLeft =showMax(array,leftIndex,center);
			float maxRight=showMax(array,center+1,rightIndex);
			
			for (int i =center;i>=leftIndex;i--)
			{
				sum+=array[i];
				if(sum>leftHalfMax)
				{
					leftHalfMax = sum;
				}
			}
			
			sum =0;
			for (int i = center+1;i<=rightIndex;i++)
			{
				sum+=array[i];
				if (sum>rightHalfMax)
				{
					rightHalfMax=sum;
				}
			}
			return max(maxLeft,maxRight,leftHalfMax+rightHalfMax);			
		}
	}
	public static float max(float a,float b,float c)
	{
		return (a>b?(a>c?a:c):(b>c?b:c));
	}
}
