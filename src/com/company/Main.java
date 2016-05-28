package com.company;

class Main {

    public static void main(String[] args) {
	// write your code here

        permutation();
    }

    private static void permutation() {
        permutation("hello", "");
    }

    private static void permutation(String str, String prefix) {
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
