package JAVA_DSA;

public class powerofno {

            //Stack building void
    //public static void main(String[] args) {

//        power(5,1);
//
//    }
//    static void power(int n,int prod){
//        if(n==0)
//        {
//            System.out.println(prod);
//            return;
//        }
//
//          prod=prod*2;
//          n--;
//          power(n,prod);

        //Stack Falling return type
        public static void main(String[] args) {
        int res = printn(5 );
        System.out.println(res);
        }
    static int printn( int n )
    {
        if(n==0) {
        return 1 ;
    }
    else{
        n--;
        return (2 * printn(n));
    }

    }
}
