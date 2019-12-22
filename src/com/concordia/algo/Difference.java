package com.concordia.algo;

import java.util.*;

public class Difference {
	
	public static void main(String[] args) {
		Difference difference = new Difference();
		int[] intArray = {2,3,5,1,4};
		int diff = 2;
		int value =difference.pairs(diff, intArray);
	System.out.println(value);	
	}
		
	
	static int pairs(int k, int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<arr.length;i++){ 
            for(int j=i;j<arr.length;j++){
            if(k == (arr[j]-arr[i])){
            count++;
            break;
            // }else if(k > (arr[i]-arr[j])){
            //     break;
            // }
            }
        }
        }
        return count;

    }

}
