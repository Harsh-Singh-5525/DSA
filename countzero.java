package JAVA_DSA;

public class countzero {
   // Stack building void
        public static void main(String[] args) {
            System.out.println("No. of zero's are :");
       zero(10890,0);

    }
    static void zero(int num,int count)
    {
        if(num/10==0)
        {
            if(num%10==0)
    {
        count++;
        System.out.println(count);
        return ;
    }
    else {
        System.out.println(count);
    }}
    else {
        if(num%10==0){
            count++;
        }
        zero(num/10,count);
    }
    }}

//    //Stack Falling return type
//    public static void main(String[] args) {
//    }
//    }




