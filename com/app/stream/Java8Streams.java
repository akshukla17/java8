package com.app.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Java8Streams {

   public static void main(String args[]) {
       System.out.println("Hello java 8");
       
        // Count empty strings
      List<String> strs = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
      
      System.out.println("Count empty Strings \n"+
      strs.stream()
             .filter(string -> string.isEmpty())
             .count());
             
       System.out.println("print non empty strings");
            strs.stream()
                 .filter(p -> !p.isEmpty())
                 .forEach(System.out::println);
        
        List<Integer> numbers= Arrays.asList(1,2,4,1,5,2,3,3,4);
        System.out.println("get list of distinct numbers");
        
      //  distinct(numbers);
      System.out.println(
                numbers.stream()
                       .collect(Collectors.toSet()));
        
       System.out.println("Highest number in List : \n"+
            numbers.stream()
                    .max((a,b) -> a>b?1:-1));
       
        System.out.println("Lowest number in List : \n"+
            numbers.stream()
                    .min((a,b) -> a>b?1:-1));
      /*  System.out.println("Sum of all numbers : \n"+
            numbers.stream()
                    .sum());
        */
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) ->x).summaryStatistics();
        System.out.println(stats);
    }
    
    public static void distinct(List<Integer> numbers){
        Set<Integer> s=new HashSet<Integer>(numbers);
       System.out.println(s);
        
    }
}