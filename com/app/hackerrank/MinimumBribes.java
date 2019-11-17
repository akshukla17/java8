package com.app.hackerrank;

public class MinimumBribes {

	public static void main(String[] args) throws ClassNotFoundException {
		int a[]= {1,2,5,3,7,8,6,4};
		minimumBribesSimple(a);
	}
	
	static void minimum(int a[]) {
		int count =0;
		for(int i=0;i<a.length;i++) {
			
			int conI = a[i];
			if(conI -(i+1) > 3) {
				System.out.println("Too chaotic");
				return;
			}
			int j= Math.max(0, conI-2);
			for(; j< i;j++) {
				
				int consJ = a[j];
				if(consJ > conI) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	//********************simple**************************
	static void minimumBribesSimple(int [] q) {
	    int totalBribes = 0;
	    
	    int expectedFirst = 1;
	    int expectedSecond = 2;
	    int expectedThird = 3;
	    
	    for (int i = 0; i < q.length; ++i) {
	        if (q[i] == expectedFirst) {
	            expectedFirst = expectedSecond;
	            expectedSecond = expectedThird;
	            ++expectedThird;
	        } else if (q[i] == expectedSecond) {
	            ++totalBribes;
	            expectedSecond = expectedThird;
	            ++expectedThird;
	        } else if (q[i] == expectedThird) {
	            totalBribes += 2;
	            ++expectedThird;
	        } else {
	            System.out.println("Too chaotic");
	            return;
	        }
	    }
	    
	    System.out.println(totalBribes);
	}
	// Complete the minimumBribes function below. ****** NOT much clear
    static void minimumBribes(int[] q) {
        
        int count = 0 ;
    
        //always keep track of min three vlaues observed
        //Compare currently seeing value with this three values.
        int midOfThree = Integer.MAX_VALUE;
        int maxOfThree =  Integer.MAX_VALUE;
        int minOfThree =  Integer.MAX_VALUE ;
        
        //iterating from left to right
        for(int i=q.length-1 ; i >= 0 ; i--){
            //person has no way to move more than two positions -> wrong
            int curData = q[i];
			if((curData-i) > 3 ) {
                System.out.println("Too chaotic");
                return;
            }
            else{
                //means current value has passed at least 3 values -> wrong
                if(curData > maxOfThree){
                     System.out.println("Too chaotic");
                     return;
                }
                else if(curData > midOfThree){ //means -> current value has bribed 2 ppl
                    count=count+2;
                }
                else if(curData > minOfThree){ //means-> current value has bribed 1 person.
                    count=count+1;
                }
                
                //Now adjust minThree values comparing, taking the current vlaue to account
                if(curData<minOfThree){
                    maxOfThree=midOfThree;
                    midOfThree=minOfThree;
                    minOfThree = curData;
                }
                else if(curData<midOfThree){
                    maxOfThree=midOfThree;
                    midOfThree = curData;
                }
                else if(curData<maxOfThree){
                    maxOfThree = curData;
                }
            }
        }
        System.out.println(count);
    }
}
