//Find the Highest Element in an Array  
public class HighestElement 
{
  static int highestElement(int arr[] , int index){ 
    if(index == 0){   
      return arr[index]; 
    } 
    int highestElem = highestElement(arr, index -1); 
    if(highestElem < arr[index]){ 
      highestElem = arr[index];
    }
    return highestElem;
  }
  static int highestElement(int arr[]){  
    return highestElement(arr, arr.length -1);
  } 
  public static void main(String[] args) {
    int [] inputArr = {4, 5 , 10 , 2 , 1 ,7}; 
    System.out.println("Highest element in thearray is: "+highestElement(inputArr));    }
} 
