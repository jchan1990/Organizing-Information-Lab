/**
 * Created by Qube on 6/27/16.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Add code here to test your solutions
        int[] ints = {18, 21, 35, 19, 7};
        printArray(findLargestAndSmallest(ints));


        List<Integer> testList = new ArrayList<>();
        testList.add(168);
        testList.add(1337);
        testList.add(888);
        testList.add(88);
        System.out.println(sumOfTwoLargest(testList));

        testList.add(10);
        testList.add(35);
        testList.add(35);
        testList.add(1337);
        System.out.println(removeDuplicatesFromList(testList));

    }

    public static void printArray(int[] anyArray) {
        for (int i = 0; i < anyArray.length; i++) {
            System.out.println(anyArray[i]);
        }
    }

    /**
     * Question 1: Find the smallest and largest numbers in an array
     * <p>
     * You are given an array of integers, with at least two values.
     * Find the smallest and largest numbers in the array, and pass them back in an array containing two values,
     * the smallest and the largest.
     *
     * @param array An array of integers with at least two values
     * @return An array of integers with two elements, the largest and smallest from the method parameter
     */
    public static int[] findLargestAndSmallest(int[] array) {

        int smallest = array[0];
        int largest = array[0];
        int[] smallestAndLargest = new int[2];


        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
            if (largest < array[i]) {
                largest = array[i];
            }
            smallestAndLargest[0] = smallest;
            smallestAndLargest[1] = largest;
        }
        return smallestAndLargest;
    }

    /**
     * Questions 2
     * <p>
     * Given a List of Integers, return the sum of the two largest values.
     * <p>
     * If the array is empty, return 0.
     * If the array has one value, return that value.
     *
     * @param intList A List of integers of any size.
     * @return Sum of the two largest values
     */
    public static int sumOfTwoLargest(List intList) {
        if (intList.size() <= 0) {
            return 0;
        }
        if (intList.size() == 1) {
            return (int) intList.get(0);
        }
        int[] largestValues = new int[2];
        int n1 = (int) intList.get(0);
        int n2 = (int) intList.get(1);
        if (n1 > n2) {
            largestValues[0] = n2;
            largestValues[1] = n1;

        }
        else {
            largestValues[0] = n1;
            largestValues[1] = n2;
        }
        for (int i = 2; i < intList.size(); i++) {
            int x = (int) intList.get(i);
            if (x > largestValues[0] && x > largestValues[1]) {
                largestValues[0] = largestValues[1];
                largestValues[1] = x;
            }
            else if (x > largestValues[0]) {
                largestValues[0] = x;
            }
        }
        return largestValues[0] + largestValues[1];

    }


    /**
     * Question3: Remove duplicates from a List
     * <p>
     * You are given a List of Integers that might have duplicates. You must remove any duplicates from the List,
     * and return a List that doesn't contain duplicates. The order of the elements in the original List
     * does not need to be kept the same.
     * You MAY use any collections types you wish, but the method must return a List.
     * <p>
     * Example: [1,4,3,2,1] would return, in any order, [1,2,3,4]
     *
     * @param intList A List of Integers that may or may not include duplicates
     * @return A List of Integers that doesn't contain duplicates.
     */
    public static List removeDuplicatesFromList(List intList) {
        List<Integer> newList = new LinkedList<>();
        Collections.sort(intList);
        newList.add((int) intList.get(0));
        for (int i = 1; i < intList.size(); i++) {
            if ((int) intList.get(i) == (int) intList.get(i - 1)) {
                continue;
            }
            newList.add((int) intList.get(i));
        }
        return newList;
    }


    //BONUS QUESTION IS BELOW

    /**
     * BONUS:
     * <p>
     * Given two sorted arrays of integers, return a sorted array of the two original arrays merged together.
     * All valid numbers in these arrays are greater than 0.
     * <p>
     * array1 has enough empty space (represented by the value 0) to hold all valid values from the original two arrays
     * combined. The returned array must be array1 with the new values merged in.
     * <p>
     * For example:
     * array1 = [1,4,7,9,0,0,0]
     * array2 = [1,5,11]
     * returned array = [1,1,4,5,7,9,11]
     * <p>
     * No test cases are provided for this method, you will need to test it on your own.
     *
     * @param array1 Array of sorted integers
     * @param array2 Array of sorted integers
     * @return Array of sorted integers, merged from array1 and array2
     */
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        return null;
    }
}