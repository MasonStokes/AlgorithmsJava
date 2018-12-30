package com.company;

public class Main {

    public static void radixSort(String[] input, int radix, int width)
    {
        for (int i = width - 1; i >= 0; i--)
        {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix)
    {
        int stringItems = input.length;

        int[] countArray = new int[radix];

        for (String value: input)
        {
            countArray[getIndex(position, value)]++;
        }

        for (int j = 1; j < radix; j++){
            countArray[j] += countArray[j-1];
        }

        String[] temp = new String[stringItems];
        for (int tempIndex = stringItems - 1; tempIndex >= 0; tempIndex--)
        {
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < stringItems; tempIndex++)
        {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getIndex(int position, String value)
    {
        return value.charAt(position) - 'a';
    }

    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        // do radix sort
        radixSort(stringsArray, 26, 4);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }
}
