
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
    
    int min = IntStream.of( numbers )
                        .min()
                        .getAsInt();

    System.out.println("Min by stream API is " + min);

    // note will throw exception if min cannot be found if empty []

  }

  private void findMinStreamsNoExp(int[] numbers) {
    
    //introductin lamda
    IntStream.of( numbers )
              .min()
              .ifPresent(min -> System.out.println(min));
              
  }

  private void run(){
    int[] numbers = {4, 100, 13, 90, 16, 2, 88};
    int[] emptyList = {};
    int[] numbers = { 3, 5, 8, 13, 6765, 1};
    
    findMinOldWay(numbers);
    findMinStreams(numbers);

    try {
      findMinStreams(emptyList);
    } catch (Exception ex) {
      System.out.println(ex)
    }

    findMinStreamsNoExp(emptyList);  //prints nothing
    findMinStreamsNoExp(numbers2);

  }

  public static void main(String args[]) 
  { 
    FindMin app = new FindMin();
    app.run();
   
  } 
} 