package JAVA_DSA;

public class isarraysorted {
    static boolean sortedarray(int []arr,int index){
        if(arr.length-1==index){
            return true;
        }
        if (arr[index]>arr[index+1]){
            return false;

        }
            return sortedarray(arr,index+1);

    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,5};
        System.out.println(sortedarray(arr,0)?"array is sorted":"array is not sorted");


    }

}
