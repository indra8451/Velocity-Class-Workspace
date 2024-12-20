package Pattern;

import java.util.Arrays;

public class DeepCopy implements Cloneable {
	
	private int arr[];
	public int a=5;
	public DeepCopy(int arr[])
	{
		this.arr=arr;
	}
	
	public DeepCopy deepclone() throws CloneNotSupportedException {
		
		DeepCopy deepcopy= new DeepCopy(arr);// shallow copy
		
		    Object clone  = deepcopy.clone();
		    DeepCopy  Deepcopy2 = (DeepCopy) clone;
		    
		    Deepcopy2.arr=this.arr.clone();
		    
		    
		return Deepcopy2;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		int arr[]= {1,2,3};
		DeepCopy deepcopy= new DeepCopy(arr);
		DeepCopy  deepcopy2 =deepcopy.deepclone();
		DeepCopy  deepcopy3 =deepcopy.deepclone();
		
		deepcopy2.arr[0]=500;
		
		System.out.println("original"+Arrays.toString(deepcopy.arr));
		System.out.println("original :"+deepcopy.a);
		System.out.println("clone 1"+Arrays.toString(deepcopy2.arr));
		System.out.println("clone 1:"+deepcopy2.a);
		System.out.println("clone 2"+Arrays.toString(deepcopy3.arr));
		System.out.println("clone 2:"+deepcopy3.a);
		
		
		
	}

}
