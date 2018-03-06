package com.app.leet;
/*
 * Need to print index of the number whose sum is equal to the target value
 * 
 */
public class TwoSum {

	public static void main(String[] args) {
		int []a= {3,2,4};
		int target=6;
		int []found=twoSum(a, target);
		if(found.length==2) {
			System.out.println("elements are at "+found[0]+ " and "+found[1]);
		}else {
			System.out.println("There is no such combination in the array");
		}

	}
	
	public static int[] twoSum(int[] nums, int target) {
		int x[] = null;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    x=new int[2];
                    x[0]=i;
                    x[1]=j;
                    return x;
                }
            }
        }
        return x;
	}
}
