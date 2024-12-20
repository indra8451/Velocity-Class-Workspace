package com.interview.OnNumber.practice.program;


public class Counter {
	
	
    private static int count = 8;

    public  void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }


  public static void main(String args[])
  {
	  Counter cn=new Counter();
	  
	// Calling static methods to access shared data
	  cn.increment();
	  int currentCount = Counter.getCount();
	  System.out.println(currentCount);

  }
}