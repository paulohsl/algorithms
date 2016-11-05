package br.com.paulo.challenges;

import java.util.Arrays;

/**
 * Created by paulohsl on 05/11/16.
 */
public class ChristmasTree {


    public static void main(String[] args) {

        int treeLength = 10;


        long start = System.currentTimeMillis();
        //createTree(treeLength);
        loopTree(treeLength);
        long end = System.currentTimeMillis();

        System.out.println(end - start);


        long start2 = System.currentTimeMillis();
        //createTree2(treeLength);
        long end2 = System.currentTimeMillis();

        System.out.println(end2 - start2);

    }


    public static void loopTree(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++)
                System.out.print(" ");

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void createTree2(int length) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {

            int spaceSize = length - i;

            int starSize = 2 * i + 1;

            sb.append(String.format("%" + spaceSize + "s", "")).append(String.format("%" + starSize + "s", "").replace(' ', '*')).append("\n");

        }

        System.out.println(sb.toString());


    }


    public static void createTree(int length) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {

            int spaceSize = length - i;

            int starSize = 2 * i + 1;

            sb.append(String.format("%" + spaceSize + "s", "")).append(getStars(i)).append("\n");

        }

        System.out.println(sb.toString());


    }


    public static char[] getStars(int n) {
        int starSize = 2 * n + 1;
        char[] stars = new char[starSize];
        Arrays.fill(stars, '*');

        return stars;
    }


}
