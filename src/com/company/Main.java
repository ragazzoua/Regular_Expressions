package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static int a = 5;

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphaNumeric.replaceAll(".", "Y"));
        System.out.println(alphaNumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphaNumeric.matches("^hello"));
        System.out.println(alphaNumeric.matches("^abcDeee"));
        System.out.println(alphaNumeric.matches("^abcDeeeF12Ghhiiiijkl"));

        System.out.println(alphaNumeric.replaceAll("ijkl99z", "The END"));
        System.out.println(alphaNumeric.replaceAll("[aei]", "X"));
        System.out.println(alphaNumeric.replaceAll("[aei][Fj]", "Y"));

        System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphaNumeric.replaceAll("[^ej]", "X"));

        System.out.println(newAlphaNumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[a-f3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\D", "X"));

        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "X"));
        System.out.println(hasWhitespace.replaceAll("\\S", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\b", "<tab>"));


        String thirdAlphaNumeric = "abcDeeeF12Ghhiiiijkl99z";

        System.out.println(thirdAlphaNumeric.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphaNumeric.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphaNumeric.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphaNumeric.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphaNumeric.replaceAll("^h+i*", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub Heading</h2>");
        htmlText.append("<p>This is paragraph about something</p>");
        htmlText.append("<p>This is another paragraph about something</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is summary</p>");

        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());


        matcher.reset();

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("" + count + " : " + matcher.start() + " to " + matcher.end());
        }


        String h2GroupPattern = "(<h2>.*?<h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("occurance " + groupMatcher.group(1));
        }

        System.out.println("-----------------------------------");
        String challange1 = "I want a bike.";
        System.out.println(challange1.matches("I want a bike"));

        String regExp = "I want a \\w+.";
        System.out.println(challange1.matches(regExp));

        String challange2 = "I want a ball.";

        System.out.println(challange2.matches(regExp));

        String regExp1 = "I want a (bike|ball).";
        System.out.println(challange1.matches(regExp1));
        System.out.println(challange2.matches(regExp1));

        String regExp3 = "I want a \\w+.";
        Pattern pattern1 = Pattern.compile(regExp3);
        Matcher matcher1 = pattern1.matcher(challange1);
        System.out.println(matcher1.matches());

        matcher1 = pattern1.matcher(challange2);
        System.out.println(matcher1.matches());

        String challange4 = "Replace all blanks with underscores";

        System.out.println(challange4.replaceAll(" ", "_"));
        System.out.println(challange4.replaceAll("\\s", "_"));
    }

}
