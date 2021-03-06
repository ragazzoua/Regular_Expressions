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

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.replaceAll("a{3}bc{8}d{3}ef{3}g$", "REPLACED"));

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));

        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()) {
            System.out.println(matcher8.group(1));
        }

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";

        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while (matcher9.find()) {
            System.out.println(matcher9.group(1));
        }

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";

        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge9);
        while (matcher10.find()) {
            System.out.println("start " + matcher10.start() + " end " + (matcher10.end() - 1));
        }

        String challenge11 = "{0,2},{0,5}, {1,3}, {2,4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()) {
            System.out.println("occurence " + matcher11.group(1));
        }
        System.out.println("-------------------");

        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4} {x, y}, {6, 34}, {11, 12}";
        Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while (matcher11a.find()) {
            System.out.println("occurence " + matcher11a.group(1));
        }

        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));


        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));
    }

}
