package com.vivek.chapter2;
import java.util.Scanner;

public class QuickSort{
	public static void sort1(int arr[]) {
		quickSortxyxy(arr,0,arr.length-1);
	}
	/*quickSortxyxy function*/
	public static void quickSortxyxy(int arr[], int low ,int high) {
		int i=low ,j= high;
		int temp;
		int pivot =arr[(low+high)/2];
		
		/*partition*/
		while(i <= j){
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			if(i <= j){
			/*swap	*/
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}}
		/* recursively Sort lower half*/
		if(low<j)
			quickSortxyxy(arr ,low ,j);
		/* recursively Sort lower half*/
		if(i<high)
			quickSortxyxy(arr ,i ,high);
		}

	public static void main(String[] args) {
	int i ,n;
     System.out.println("Quick Sort Test\n");
     int arrx[]={55 ,66 ,44 ,33 ,88 ,22 ,11};
    	sort1(arrx);
    System.out.println("Element array After Sorting\n");
     for(i=0 ; i<arrx.length; i++)
    	 System.out.println(arrx[i]+"");
     System.out.println(); 
    
}
}