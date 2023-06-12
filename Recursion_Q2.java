/* Write recursive function that takes an array of words and returns an array containing all words capitalized
i/p : ["foo", "bar", "world"] o/p : ["FOO", "BAR", "WORLD"] */

import java.util.Arrays;
public class  Recursion_Q2 {
  static String [] wordsCapatilised(String inputArr [] , int index){ if(index < 0){         
    return new String[inputArr.length];
  }
String [] subResult = wordsCapatilised(inputArr, index -1); 
subResult[index] = inputArr[index].toUpperCase();         
return subResult;   
} 
  static String [] wordsCapatilised(String inputArr []){   
    return wordsCapatilised(inputArr , inputArr.length -1); }
  public static void main(String[] args) 
  { 
    String [] inputArr = {"alice", "in" ,"wonderland"}; 
    System.out.println(Arrays.toString(wordsCapatilised(inputArr))); } 
} 
