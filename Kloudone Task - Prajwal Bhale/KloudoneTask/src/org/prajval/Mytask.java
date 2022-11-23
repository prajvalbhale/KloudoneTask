package org.prajval;
public class Mytask {	
	public void MaxReptEle(int [] arr)
	{
		 int maxCounter = 0;
		 int element=0;		 
		 for (int i = 0; i <arr.length ; i++) 
		 {
			 int counter =1;
			 for (int j = i+1; j <arr.length ; j++) 
			 {
				 if(arr[i]==arr[j])
				 {
				 counter++;
				 }
			 }
			 if(maxCounter<counter)
			 {
				 maxCounter=counter;
				 element = arr[i];
			 } 
		 }
		 System.out.println("["+ element + "] is Repeating Maximum, for " + 
		 "["+ maxCounter +"] Time's"); 		 
	}
	
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 3, 3, 2, 2, 2, 4, 3, 3, 3};
		 Mytask m = new Mytask();
		 m.MaxReptEle(arr);
		 }
	}
/*
 * OUTPUT:-
 * 
 * [3] is Repeating Maximum, for [6] Time's
 * 
 * */






