package JAVA_DSA;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
        public class octatohexadecimal {
            public String convertOctalToHexadecimal(int octalNumber) {
                // Converting octal to decimal
                int decimalNumber = 0;
                int base = 1;
                while (octalNumber != 0) {
                    int remainder = octalNumber % 10;
                    decimalNumber += remainder * base;
                    base *= 8;
                    octalNumber /= 10;
                }
                // Converting decimal to hexadecimal
                StringBuilder hexadecimalNumber = new StringBuilder();
                while (decimalNumber != 0) {
                    int remainder = decimalNumber % 16;
                    if (remainder < 10) {
                        hexadecimalNumber.insert(0, remainder);
                    } else {
                        char hexDigit = (char) ('A' + (remainder - 10));
                        hexadecimalNumber.insert(0, hexDigit);
                    }
                    decimalNumber /= 16;
                }
                return hexadecimalNumber.toString();
            }
            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                // Reading octal number
                String octalString = bufferedReader.readLine().trim();
                int octalNumber = Integer.parseInt(octalString);
                octatohexadecimal solution = new octatohexadecimal();
                String hexadecimalResult = solution.convertOctalToHexadecimal(octalNumber);
                System.out.println(hexadecimalResult);
                bufferedReader.close();
            }
        }

