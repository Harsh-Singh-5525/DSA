package JAVA_DSA;

public class numbersequence {
//    //from 1 to N
    public static void main(String[] args) {
        sequence(1);
    }
    public static void sequence(int i){
        if(i==6){
            return;}

        System.out.println(i);
        sequence(i+1);

        }}
//
////        //from N to 1
////        public static void main(String[] args) {
////            sequence(5);
////        }
////    public static void sequence(int i){
////        if(i==0){
////            return;}
////
////        System.out.println(i);
////        sequence(i-1);
////
////    }
