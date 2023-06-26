package JAVA_DSA;

import java.util.ArrayList;
import java.util.List;

public class generateparentheses {

        public static List<String> Parentheses(int n) {
            List<String> result = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            generateBrackets(result, n, 0, 0, sb);
            return result;
        }

        private static void generateBrackets(List<String> result, int n, int opening, int closing, StringBuilder output){
            // Termination Case
            if(output.length() == n*2){
                result.add(output.toString());
                return ;
            }
            // Can i Place Opening
            if(opening<n){
                output.append("("); // Place Opening
                generateBrackets(result, n, opening+1, closing, output);
                // Stack Fall
                output.deleteCharAt(output.length()-1); // Undo
            }
            // Can i Place Closing
            if(closing<opening){
                output.append(")"); // Place Closing
                generateBrackets(result, n, opening, closing+1, output);
                // Stack Fall
                output.deleteCharAt(output.length()-1);

            }
        }

    public static void main(String[] args) {
        int n = 3;

        generateparentheses solution = new generateparentheses();
        List<String> answer = solution.Parentheses(n);

        System.out.println("Generated Parentheses:\n"+answer);

    }
    }
