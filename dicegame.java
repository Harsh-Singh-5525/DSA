package JAVA_DSA;
import java.util.ArrayList;
import java.util.List;
public class dicegame {
//    static ArrayList<String> a(int currentvalue, int endvalue){
//
//        if(currentvalue==10){
//            return ; }
//
//        a(currentvalue+1,endvalue+2);
//
//        return null;
//
//
//
//
//    }
//public static void main(String[] args) {
//
//    ArrayList<String> result= a(0,10);
//    System.out.println(result);
//
//    }
//    }
//
//

    public static List<List<Integer>> diceGame(int targetSum, int numRolls, int diceRange) {

        if (numRolls == 0) {
            List<List<Integer>> result = new ArrayList<>();
            if (targetSum == 0) {
                result.add(new ArrayList<>());
            }
            return result;
        }

        if (diceRange * numRolls < targetSum || numRolls > targetSum) {
            return new ArrayList<>();
        }

        List<List<Integer>> sequences = new ArrayList<>();

        for (int i = 1; i <= diceRange; i++) {
            List<List<Integer>> nextSequences = diceGame(targetSum - i, numRolls - 1, diceRange);

            for (List<Integer> sequence : nextSequences) {
                List<Integer> newSequence = new ArrayList<>(sequence);
                newSequence.add(0, i);
                sequences.add(newSequence);
            }
        }

        return sequences;
    }

    public static void main(String[] args) {
        int targetSum = 10;
        int diceRange = 6;

        for (int numRolls = 1; numRolls <= 6; numRolls++) {
            List<List<Integer>> sequences = diceGame(targetSum, numRolls, diceRange);
            System.out.println("Number of sequences for " + numRolls + " roll(s): " + sequences.size());
            for (List<Integer> sequence : sequences) {
                System.out.println(sequence);
            }
            System.out.println();}}}