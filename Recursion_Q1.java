//Write a recursive function that takes a list of numbers as an input and return product of all numbers in list 

CODE: 
public class Product { 
 
    static int productNums(int Arr [] , int index){      
     if(index < 0){       
      return 1; 
        } 
 
        int subResult = inputArr[index]*(productNums(Arr, index -1));   
     return subResult; 
    } 
 
    public static void main(String[] args) {  
     int  [] inputArr = {9, 5 , 2 , 1 , 3}; 
        System.out.println("Product is : "+productNums(InputArr, inputArr-1)); 
    } 
} 
