
package com.example;

//a simple program to demonstrate the use of stream in java 
import java.util.*; 
import java.util.stream.*; 
  
public class Tutorial 
{ 

  private void findDistinctSmallestOldWay(int[] numbers){

    //clone - avoid mutation orig array
    int[] copy = Arrays.copyOf( numbers, numbers.length);

    //sort
    Arrays.sort(copy);

    //pick first 3 
    for (int i=0; i<3; i++){
        System.out.println(copy[i]);
    }
    
  }

  


  private void run(){
    int[] numbers = {4, 100, 13, 90, 4, 16, 2, 88};
  
    findDistinctSmallestOldWay(numbers);
    
    
    

  }

  public static void main(String args[]) 
  { 
    Tutorial app = new Tutorial();
    app.run();
   
  } 
} 