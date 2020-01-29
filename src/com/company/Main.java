package com.company;

public class Main {

    private static int a = 5;

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphaNumeric = "abcDeeeF12Ghhiiiijkl";
        System.out.println(alphaNumeric.replaceAll(".", "Y"));
        System.out.println(alphaNumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphaNumeric.matches("^hello"));
        System.out.println(alphaNumeric.matches("^abcDeee"));
        System.out.println(alphaNumeric.matches("^abcDeeeF12Ghhiiiijkl"));


    }



}
