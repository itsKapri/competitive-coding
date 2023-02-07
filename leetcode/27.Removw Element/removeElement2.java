//with O(N)
//https://leetcode.com/problems/remove-element/


import java.util.*;
public class Main
{
public static int remove(int arr[],int val){
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=val){
            arr[j]=arr[i];
            j++;
        }
    }
    return j;
}
	public static void main(String[] args) {
		int a[]={1,3,4,3,5};
		int val=3;
		int j=remove(a,val);
		for (int i=0;i<j; i++ ){
		    System.out.print(a[i]+"  ");
		} 
	}
}
