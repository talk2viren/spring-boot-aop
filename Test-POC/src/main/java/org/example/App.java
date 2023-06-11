package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    private static void printString(int columnNumber)
    {
        // To store result (Excel column name)
        StringBuilder columnName = new StringBuilder();

        while (columnNumber > 0) {
            // Find remainder
            int rem = columnNumber % 26;

            // If remainder is 0, then a
            // 'Z' must be there in output
            if (rem == 0) {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            }
            else // If remainder is non-zero
            {
                columnName.append((char)((rem - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }

        // Reverse the string and print result
        System.out.println(columnName.reverse());
    }
    public static void main( String[] args )
    {

        printString(26);
        printString(51);
        printString(52);
        printString(80);
        printString(676);
        printString(702);
        printString(705);
//        int[] array = {1, 2, 3, 5, 6, 7, 8};
//
//        List<Integer> list = Arrays.stream(array).boxed().toList();
//
//        for(int i=0;i<list.size();i++){
//            return !(list.contains(i))?
//        }

//        new StringBuilder().append("abc").reverse().toString()

//        Collections.sort(list);

//        int n = array.length + 1; // The array length is missing one number
//        int expectedSum = n * (n + 1) / 2;
//
//        int actualSum = 0;
//        for (int num : array) {
//            actualSum += num;
//        }
//
//        int missingNumber = expectedSum - actualSum;
//        System.out.println("Missing number: " + missingNumber);
    }
}
