package JAVA_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class PerfectNumber {
    public ArrayList<Integer> perfect(int n) {

        ArrayList<Integer> perfectNumbers = new ArrayList<>();

           for (int i = 1; i <= n; i++) {

            if (isPerfectNumber(i)) {

                perfectNumbers.add(i);

            }

        }
           return perfectNumbers;

    }
    private boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }}
        return sum == num;
    }
}

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine().trim();

        int n = Integer.parseInt(str);
        PerfectNumber solution = new PerfectNumber();
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
        bufferedReader.close();
    }

}

