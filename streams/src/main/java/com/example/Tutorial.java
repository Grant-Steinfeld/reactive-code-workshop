
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
    
    System.out.println("Distinct??? No");
    //how to implement those - add more lines if you want
  }

  private void findDistinctSmallestStreams(int[] numbers){
      System.out.println("add code here")

      //hints use:
      //  distinct()
      //  sorted()
      //  limit()
      //  forEach()
      // pass printline function rather than call it

  }

  private void createIntStreams(int[] numbers){
    System.out.println("add code here")

    //hints use:
    //  of()   // from param numbers array
    //  range()
    
}

private void createStreamsOther(){
    Stream<String> streamEmpty = Stream.empty();

    Collection<String> collection = Arrays.asList("a", "b", "c");
    Stream<String> streamOfCollection = collection.stream();
    
}
  
private void processIntStreams(int[] numbers){
    System.out.println("add code here")

    //hints use:
    //  3 functions from findDistinctSmallestStreams() 
    // skip() 
    // filter()   // only evens; pass in lambda
    // map()      // double each num; pass in lambda
    
}


  private void run(){
    int[] numbers = {4, 100, 13, 90, 4, 16, 2, 89};
  
    findDistinctSmallestOldWay(numbers);
    findDistinctSmallestStreams(numbers);
    createIntStreams();
    createStreamsOther();
    processIntStreams();

    
    

  }

  public static void main(String args[]) 
  { 
    Tutorial app = new Tutorial();
    app.run();
   
  } 
} 