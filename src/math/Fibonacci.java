package math;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args){
            int fibbi[] = new int[40];

            for (int i = 0; i < 40; i++) {
                if (i < 2) {
                    fibbi[i] = i;
                } else {
                    fibbi[i] = fibbi[i - 2] + fibbi[i - 1];
                }  // end if
            }//end for
            System.out.println(Arrays.toString(fibbi));
        } // end main

    }

