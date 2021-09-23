package com.javarush.HW2;

import java.util.Arrays;
import java.util.Collections;


public class HW2 {

    public static void main(String[] args) {
        Integer[] n1 = {2, 3, 1, 7, 11};
        Arrays.sort(n1, Collections.reverseOrder());
        System.out.println(Arrays.toString(n1));
    }

    public static class sum {
        public static void main(String[] args) {
            int[] n2 = {-7, 6, -17, 33, -21, 15, -3, 9, -13, 12};
            int sum = 0;
            for (int a : n2) {
                if (a > 0) {
                    sum = sum + a;
                }
            }
            System.out.println(sum);
        }
    }

    public static class Avg {
        public static void main(String[] args) {
            int[] n3 = {1, 2, 4, 1};
            double avg;
            double s = 0;
            for (int a : n3) {
                s += a;
            }
            avg = s / n3.length;
            System.out.println(avg);
        }
    }

    public static class RAD {
        public static void main(String[] args) {
            int[] n4 = {3, 2, 3, 1, 4, 2, 8, 3};
            for (int a = 0; a < n4.length; a++) {
                for (int b = a + 1; b < n4.length; b++) {
                    if (n4[a] == n4[b]) {
                        n4[b] = 0;
                    }
                }
            }
            System.out.println(Arrays.toString(n4));
        }

    }
}