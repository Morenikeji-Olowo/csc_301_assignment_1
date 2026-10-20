package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Product_of_array_except_itself {

    public int[] productExceptSelf(int[] numbers) {
        int length_of_array = numbers.length;
        int[] result = new int[length_of_array];

        for (int k = 0; k < length_of_array; k++) {
            result[k] = 1;
        }

        int left = 1;
        int right = 1;

        for (int i = 0; i < length_of_array; i++) {
            int j = length_of_array - 1 - i;

            result[i] = result[i] * left;
            left = left * numbers[i];

            result[j] = result[j] * right;
            right = right * numbers[j];
        }

        return result;
    }
    public static void main(String[] args) {
        Product_of_array_except_itself solver = new Product_of_array_except_itself();

        int[] test1 = {1, 2, 3, 4};
        int[] output1 = solver.productExceptSelf(test1);
        System.out.println(Arrays.toString(output1));

        int[] test2 = {-1, 1, 0, -3, 3};
        int[] output2 = solver.productExceptSelf(test2);
        System.out.println(Arrays.toString(output2));
    }
}
