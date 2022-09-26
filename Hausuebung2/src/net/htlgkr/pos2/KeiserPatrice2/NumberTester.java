package net.htlgkr.pos2.KeiserPatrice2;

import com.sun.jdi.IntegerType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class NumberTester {
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

    public void setPalindromeTester(NumberTester palindromeTester) {
        this.palindromTester = palindromTester;
    }

    public void testFile() {
        String line;
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine())
            {
               line = scanner.nextLine();
               String[] strings = line.split(" ");
               if()
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
