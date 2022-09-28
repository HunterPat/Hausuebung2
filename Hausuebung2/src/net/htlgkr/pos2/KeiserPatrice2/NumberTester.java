package net.htlgkr.pos2.KeiserPatrice2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester implements NumberTest{
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
                    testNumber(Integer.parseInt(strings[0] + strings[1]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean testNumber(int number) {
        char[] numberChars = Integer.toString(number).toCharArray();

        if (numberChars[0] == 3) {
                setPalindromeTester((palT) -> {
                    char[] chars = Integer.toString(palT).toCharArray();
                    int counter = 0;
                    for (int i = 0; i < chars.length; i++) {

                        if (chars[i] == chars[chars.length - (i + 1)]) {
                            counter++;
                        }
                    }
                    if (counter == chars.length) {
                        System.out.println("PALINDROME");
                        return true;
                    } else {
                        System.out.println("NO PALINDROME");
                        return false;
                    }
                });

        } else if (numberChars[0] == 2) {
            setPrimeTester((primeT) -> {
                if ((primeT / 2) == 0 && (primeT / 3) == 0) {
                    System.out.println("PRIME");
                    return true;
                } else {
                    System.out.println("NO PRIME");
                    return false;
                }

            });
            System.out.println("PRIME");
        } else if (numberChars[0] == 1) {
            setOddEvenTester((oddT) -> {
                if (oddT % 2 == 0) {
                    System.out.println("EVEN");
                    return true;
                } else {
                    System.out.println("ODD");
                    return false;
                }
            });
        }
    }
}
