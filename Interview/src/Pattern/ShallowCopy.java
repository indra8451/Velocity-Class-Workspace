package Pattern;

import java.util.Arrays;

public class ShallowCopy implements Cloneable{
	
	private int arr[];
	public int a=5;
	public ShallowCopy(int arr[])
	{
		this.arr=arr;
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		int arr[]= {1,2,3};
		
		ShallowCopy shallowcopy= new ShallowCopy(arr);
		//ShallowCopy shallowCopy2= (ShallowCopy) shallowcopy.clone();
		
		Object clone=shallowcopy.clone();
		ShallowCopy shallowCopy2=(ShallowCopy)clone;
		
		shallowcopy.a=9;
		shallowcopy.arr[0]=100;
		System.out.println(Arrays.toString(shallowcopy.arr));
		System.out.println(shallowcopy.a);
		
		System.out.println(Arrays.toString(shallowCopy2.arr));
		System.out.println(shallowCopy2.a);
	}

}
