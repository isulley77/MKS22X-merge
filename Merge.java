import java.util.*;
import java.io.*;



public class Merge{

  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
  
  
  
  
  
  
  }



/* PSEUDOCODE
mergesort(data,lo,hi):
  if lo >= hi : 
    return 
  mergesort left side
  mergesort right side
  merge
*/
  
  
  
  public void insertionsort(int[] arr){
    int iter, holder, iter2;
    
    for(iter = 1;iter < arr.length; iter++){
        holder = arr[iter];
        iter2 = iter - 1;
        
        while(iter2 >= 0 && arr[iter2] > holder){
            arr[iter2 + 1] = arr[iter2];
            iter2--;
        }
        arr[iter2 + 1] = holder;
    }
  }  




}
