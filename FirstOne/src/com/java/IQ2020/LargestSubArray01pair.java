package com.java.IQ2020;

public class LargestSubArray01pair {
     		// This function Prints the starting and ending 
			// indexes of the largest subarray with equal 
			// number of 0s and 1s. Also returns the size 
			// of such subarray. 

			int findSubArray(int arr[], int n) 
			{ 
				int sum = 0; 
				int maxsize = -1, startindex = 0; 
				int endindex = 0; 

				// Pick a starting point as i 

				for (int i = 0; i < n - 1; i++) 
				{ 
					sum = (arr[i] == 0) ? -1 : 1; 

					// Consider all subarrays starting from i 

					for (int j = i + 1; j < n; j++) 
					{ 
						if(arr[j] == 0) 
							sum += -1; 
						else
							sum += 1; 

						// If this is a 0 sum subarray, then 
						// compare it with maximum size subarray 
						// calculated so far 

						if (sum == 0 && maxsize < j - i + 1) 
						{ 
							maxsize = j - i + 1; 
							startindex = i; 
						} 
					} 
				} 
				endindex = startindex+maxsize-1; 
				if (maxsize == -1) 
					System.out.println("No such subarray"); 
				else
					System.out.println(startindex+" to "+endindex); 

				return maxsize; 
			} 

			/* Driver program to test the above functions */

			public static void main(String[] args) {
				
				LargestSubArray01pair sub = new LargestSubArray01pair(); 
				
				/*int arr[] = {1, 0, 0, 1, 0, 1, 1}; */
				
				int arr[] = {0, 1, 0, 0, 0, 1, 0,0,0,1,1,0};
				
				int size = arr.length; 

				sub.findSubArray(arr, size); 
			} } 

/*Time Complexity: O(n^2)   ,Auxiliary Space: O(1)  -- VIP point asked by Interview HUawai */

/*Theory:- Method 1 (Simple)
A simple method is to use two nested loops. The outer loop picks a starting point i. The inner loop considers all subarrays starting from i. 
If size of a subarray is greater than maximum size so far, then update the maximum size.In the below code, 0s are considered as 
-1 and sum of all values from i to j is calculated. If sum becomes 0, then size of this subarray is compared with largest size so 
far.*/