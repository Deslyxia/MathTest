package com.numbers;

/**
 * Created by Deslyxia on 6/27/17.
 */
public class NumberTest {
    public static void main (String[] args) {
        findNextNumber(285,165,144);
    }

    private static void findNextNumber (Integer index_T, Integer index_P, Integer index_H) {
        while (1 == 1) {
            long tri = ((long)index_T * (index_T + 1) / 2);
            long pent = ((long)index_P * ((3 * index_P) - 1) / 2);
            long hex = ((long)index_H * ((2 * index_H) - 1));

            long smallest = Math.min(Math.min(tri,pent),hex);

            if (tri == pent && tri == hex) {
                printResults(index_T, index_P, index_H, tri);
                return;
            }

            if (smallest == tri) {
                index_T += 1;
            }

            if (smallest == pent) {
                index_P += 1;
            }

            if (smallest == hex) {
                index_H += 1;
            }
        }
    }

    private static void printResults (Integer index_T, Integer index_P, Integer index_H, Long result) {
        System.out.println("The next number that is Triangular, Pentagonal, and Hexagonal is : " + result);
        System.out.println("Triangular index : " + index_T);
        System.out.println("Pentagonal index : " + index_P);
        System.out.println("Hexagonal index : " + index_H);
    }
}
