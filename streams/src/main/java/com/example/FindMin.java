
package com.example;

//a simple program to demonstrate the use of stream in java 
import java.util.*; 
import java.util.stream.*; 
  
public class FindMin 
{ 

  private void findMinOldWay(int[] numbers){
    
    int min = numbers[0];
    for (int i=1; i < numbers.length; i++){
        if (min > numbers[i]){
            min = numbers[i];
        }
    }

    System.out.println("Min is " + min);
  }

  private void findMinStreams(int[] numbers) {
    System.out.println("With Java 8 Streams");

  }

  private void run(){
    int[] numbers = {4, 1, 13, 90, 16, 2, 0};

    findMinOldWay(numbers);
    findMinStreams(numbers);

  }

  public static void main(String args[]) 
  { 
    FindMin app = new FindMin();
    app.run();
   
  } 
} 