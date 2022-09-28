package net.htlgkr.pos2.KeiserPatrice2.Number3;

import net.htlgkr.pos2.KeiserPatrice2.Number3.NumberTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester implements NumberTest {
    private String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromTester;


    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTeseter) {
        this.oddTester = oddTeseter;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromTester = palindromTester;
    }

    public void testFile() {
        String line;
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {

                line = scanner.nextLine();
                String[] strings = line.split(" ");
                if (strings.length == 1) {

                } else {
                   boolean erg = testNumber(Integer.parseInt(strings[0] + strings[1]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean testNumber(int number) { //sehr dumme methode(Ich verstehe nicht weswegen er boolean ausgiebt und nicht einfach(NOPRIME) oder (PRIME) meiner Meinung kein Sinn dahinter
        final boolean[] erg = {false};
        char[] numberChars = Integer.toString(number).toCharArray();
        if (numberChars[0] == '3') {
            setPalindromeTester((palT) -> { // ICH VERSTEHE DIESEN PARAMETER NICHT
                char[] chars = Integer.toString(palT).toCharArray();
                int counter = 0;

                for (int i = 0; i < chars.length; i++) {

                    if (chars[i] == chars[chars.length - (i + 1)]) {
                        counter++;
                    }
                }
                if (counter == chars.length) {
                    System.out.println("PALINDROME");
                    erg[0] = true;
                    return true;
                } else {
                    System.out.println("NO PALINDROME");
                    erg[0] = false;
                    return false;
                }
            });

        } else if (numberChars[0] == '2') {
            setPrimeTester((primeT) -> { // ICH VERSTEHE DIESEN PARAMETER NICHT
                if ((primeT / 2) == 0 && (primeT / 3) == 0) {
                    System.out.println("PRIME");
                    erg[0] = true;
                    return true;
                } else {
                    System.out.println("NO PRIME");
                    erg[0] = false;
                    return false;
                }

            });
            System.out.println("PRIME");
        } else if (numberChars[0] == '1') {
            setOddEvenTester((oddT) -> { // ICH VERSTEHE DIESEN PARAMETER NICHT

                if (oddT % 2 == 0) {
                    System.out.println("EVEN");
                    erg[0] = true;
                    return true;
                } else {
                    System.out.println("ODD");
                    erg[0] = false;
                    return false;
                }
            });
        }
        return erg[0];
    }
}
