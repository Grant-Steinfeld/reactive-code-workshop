
package com.example;

//a simple program to demonstrate the use of stream in java 
import java.util.*; 
import java.util.stream.*; 
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
  
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
      System.out.println("add code here");

      //hints use:
      //  distinct()
      //  sorted()
      //  limit()
      //  forEach()
      // pass printline function rather than call it

  }

  private void createIntStreams(int[] numbers){
    System.out.println("add code here");

    //hints use:
    //  of()   // from param numbers array
    //  range()
    
}

private void createStreamsOther(){

    //empty stream
    Stream<String> streamEmpty = Stream.empty();

    //from collections
    Collection<String> collection = Arrays.asList("a", "b", "c");
    Stream<String> streamOfCollection = collection.stream();

    //from Array
    // we know of()
    //They can also be created out of an existing array or of a part of an array:
    String[] arr = new String[]{"a", "b", "c", "x", "y", "z", "x"};
    Stream<String> streamOfArrayFull = Arrays.stream(arr);
    Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

    System.out.println("add code here");
    //from streamOfArrayFull 
        //filter out distinct x char

        //count chars

    Stream<String> streamBuilder =
        Stream.<String>builder().add("a").add("b").add("c").build();

    Stream<String> streamGenerated =
        Stream.generate(() -> "streams-are-cool").limit(10);
    
    IntStream streamOfChars = "abc".chars();

    //from file
    //Every line of the text becomes an element of the stream:
    String mobyPath = "/opt/moby.txt";
    String smallPath = "/opt/small.txt";

    
    //read all lines and remove whitespace (trim)
    //filter empty lines
    //and print result to System.out

    Files.lines(new File(smallPath).toPath())
        .map(s -> s.trim())
        .filter(s -> !s.isEmpty())
        .forEach(System.out::println);

  

    Files.lines(new File(mobyPath).toPath())
        .map(s -> s.trim())
        .filter(s -> !s.matches("yourregularexpression"))
        .forEach(System.out::println);



    //Now set a varialbe 
    //Stream<String> lines 
    //to load stream from large text file - mobyPath
 
    //apply some stream functions here!
        //how many words?
        //how many distinct words?

=



}
  
private void processIntStreams(int[] numbers){
    System.out.println("add code here");

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
    createIntStreams(numbers);
    createStreamsOther();
    processIntStreams(numbers);

    
    

  }

  public static void main(String args[]) 
  { 
    Tutorial app = new Tutorial();
    app.run();
   
  } 
} 