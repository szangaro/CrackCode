package com.scosec.crackcode;

public class Permutation {

    static int count = 0;
    public static void main(String[] args) {
        // write your code here

        //permutation();
        System.out.println(Fib.fib(5));
        System.out.println(count);
    }

    private static void permutation() {
        permutation("heo", "");
    }

    private static void permutation(String str, String prefix) {
        count++;
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i=0;i<str.length(); i++){
                String rem = str.substring(0,i) + str.substring(i+1);
                permutation(rem, prefix + str.charAt(i));
            }
        }

    }
}
