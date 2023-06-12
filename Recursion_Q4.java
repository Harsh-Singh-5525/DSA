/*Given is an Array of Employee Salary, add the tax 10% in each salary and return the new array which contains (salary + tax).*/

import java.util.Arrays;
public class  Recursion_Q4 {         
  static double [] taxation(int inputArr [] , int index){ if(index < 0){
  return new double [inputArr.length]; 
  } 
double [] subResult = taxation(inputArr, index -1);     
subResult[index] = inputArr[index] + (0.01 * inputArr[index]);       
return subResult;   } 
static double [] taxation(int arr[]){       
return taxation(arr, arr.length -1);    
  } 
public static void main(String[] args) { 
    int [] inputArr = {450000 , 50000, 42000 , 53000};
    System.out.println(); System.out.println("Old amount before taxation is "+Arrays.toString(inputArr));    
    System.out.println("New amount after taxation is "+Arrays.toString(taxation(inputArr)));
  } } 
