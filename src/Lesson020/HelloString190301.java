package Lesson020;

/**
 * FirstProject
 * 5/20/20 12: 56
 */
public class HelloString190301 {
    public static void main(String[] args) {
        System.out.println(helloName("Bob")); // "Hello Bob!"
        System.out.println(helloName("Alice")); //"Hello Alice!"
        System.out.println(helloName("X")); // "Hello X!"

        System.out.println(makeOutWord("<<>>", "Yay"));// → "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));// → "[[word]]"

        System.out.println(firstHalf("WooHoo")); // "Woo"
        System.out.println(firstHalf("HelloThere")); // "Hello"
        System.out.println(firstHalf("abcdef")); // "abc"

        System.out.println(nonStart("Hello", "There")); //"ellohere"
        System.out.println(nonStart("java", "code")); //"avaode"
        System.out.println(nonStart("shotl", "java")); //"hotlava"

        System.out.println(theEnd("Hello", true));// → "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"

        System.out.println(endsLy("oddly")); //true
        System.out.println(endsLy("y")); //false
        System.out.println(endsLy("oddy")); //false

        System.out.println(middleThree("Candy")); // → "and"
        System.out.println(middleThree("and"));// → "and"
        System.out.println(middleThree("solving"));// → "lvi"

        System.out.println(lastChars("last", "chars"));// → "ls"
        System.out.println(lastChars("yo", "java"));// → "ya"
        System.out.println(lastChars("hi", "")); // → "h@"

        System.out.println(seeColor("redxx"));// → "red"
        System.out.println(seeColor("xxred"));// → ""
        System.out.println(seeColor("blueTimes"));// → "blue"

        System.out.println(extraFront("Hello"));// → "HeHeHe"
        System.out.println(extraFront("ab"));// → "ababab"
        System.out.println(extraFront("H"));// → "HHH"

        System.out.println(startWord("hippo", "hi"));// → "hi"
        System.out.println(startWord("hippo", "xip"));// → "hip"
        System.out.println(startWord("hippo", "i"));// → "h"

        System.out.println(startWord("hippo", "hi"));// → "hi"
        System.out.println(startWord("hippo", "xip"));// → "hip"
        System.out.println(startWord("hippo", "i"));// → "h"

        System.out.println(makeAbba("Hi", "Bye"));// → "HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice"));// → "YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up"));// → "WhatUpUpWhat"

        System.out.println(extraEnd("Hello"));// → "lololo"
        System.out.println(extraEnd("ab"));// → "ababab"
        System.out.println(extraEnd("Hi"));// → "HiHiHi"

        System.out.println(withoutEnd("Hello"));// → "ell"
        System.out.println(withoutEnd("java"));// → "av"
        System.out.println(withoutEnd("coding"));// → "odin"

        System.out.println(left2("Hello"));//→ "lloHe"
        System.out.println(left2("java"));// → "vaja"
        System.out.println(left2("Hi"));// → "Hi"

        System.out.println(withoutEnd2("Hello"));// → "ell"
        System.out.println(withoutEnd2("abc"));// → "b"
        System.out.println(withoutEnd2("ab")); //→ ""

        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"

        System.out.println(hasBad("badxx"));// → true
        System.out.println(hasBad("xbadxx"));// → true
        System.out.println(hasBad("xxbadxx"));// → false

        System.out.println(conCat("abc", "cat"));// → "abcat"
        System.out.println(conCat("dog", "cat"));// → "dogcat"
        System.out.println(conCat("abc", ""));// → "abc"

        System.out.println(frontAgain("edited"));// → true
        System.out.println(frontAgain("edit"));// → false
        System.out.println(frontAgain("ed"));// → true

        //System.out.println(HelloString190301.makeTags("i", "Yay")); //"<i>Yay</i>"
//        System.out.println(HelloString190301.makeTags("i", "Hello")); //"<i>Hello</i>"
//        System.out.println(HelloString190301.makeTags("cite", "Yay")); //"<cite>Yay</cite>"

    }

    // 19.01 Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!"
    public static String helloName(String first) {
        String start = "Hello";
        return start + first;
    }

    // 19.02 Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the
    // middle of the out string, e.g. "<>". Note: use str.substring(i, j) to extract the String starting at index i and
    // going up to but not including index j.
    public static String makeOutWord(String first, String word) {
        return first.substring(0, 2) + word + first.substring(2, 4);
    }

    // 19.03 Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    public static String firstHalf(String first) {
        String result = "";
        if (first.length() % 2 == 0) {
            result = first.substring(0, (first.length() / 2));
        } else {
            result = "Mistake, impossible to find half String";
        }
        return result;
    }

    // 19.04 Given 2 strings, return their concatenation, except omit the first char of each.
    // The strings will be at least length 1.
    public static String nonStart(String first, String second) {
        return first.substring(1, first.length()) + second.substring(1, second.length());
    }

    // 19.05 Given a string, return a string length 1 from its front, unless front is false, in which case return a
    // string length 1 from its back. The string will be non-empty.
    public static String theEnd(String first, boolean front) {
        if (front) return first.substring(0, 1);
        return first.substring(first.length() - 1);
    }

    // 19.06 Given a string, return true if it ends in "ly".
    public static boolean endsLy(String first) {
        String second = "ly";
        if (first.length() < second.length()) {
            return false;
        } else if ((first.substring(first.length() - 2, first.length())).equals(second)) {
            return true;
        }
        return false;
    }

    // 19.07 Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    // The string length will be at least 3.
    public static String middleThree(String first) {
        String second = "";
        int midle = (first.length() - 1) / 2;
        if (first.length() == 3) {
            second = first;
        } else {
            second = first.substring(midle - 1, midle + 2);
        }
        return second;
    }

    //19.8 Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo"
    // and "java" yields "ya". If either string is length 0, use '@' for its missing char.
    public static String lastChars(String a, String b) {
        String result;
        char firstA;
        char lastB;
        firstA = a.charAt(0);
        if (b.length() == 0) {
            lastB = 0;
        } else {
            lastB = b.charAt(b.length() - 1); // -1 because score from 0
        }
        String start = String.valueOf(firstA);
        String end = String.valueOf(lastB);
        String add = "@";

        if (a.length() == 0 & b.length() == 0) {
            result = add + add;
        } else if (a.length() == 0 & b.length() >= 2) {
            result = add + end;
        } else if (a.length() >= 2 & b.length() <= 0) {
            result = start + add;
        } else {
            result = start + end;
        }

        return result;
    }

    // 19.09 Given a string, if the string begins with "red" or "blue" return that color string,
    // otherwise return the empty string
    public static String seeColor(String first) {
        String red = "red";
        String blue = "blue";
        String empty = "-";
        String result = "";
        if (first.length() > 2 & first.substring(0, 3).equals(red)) {
            result = red;
        } else if (first.length() > 3 & first.substring(0, 4).equals(blue)) {
            result = blue;
        } else {
            result = empty;
        }
        return result;
    }

    // 19.10 Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    // The string may be any length. If there are fewer than 2 chars, use whatever is there.
    public static String extraFront(String first) {
        String result = "";
        if (first.length() == 1) {
            result = String.valueOf(first.charAt(0)) + String.valueOf(first.charAt(0)) + String.valueOf(first.charAt(0));
        } else {
            result = first.substring(0, 2) + first.substring(0, 2) + first.substring(0, 2);
        }
        return result;
    }

    // 19.11 Given a string and a second "word" string, we'll say that the word matches the string if it appears at the
    // front of the string, except its first char does not need to match exactly. On a match, return the front of the
    // string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip"
    // returns "hip". The word will be at least length 1.
    public static String startWord(String first, String word) {
        int lengthWord = word.length();
        if (first.substring(0, lengthWord).equals(word))
            return first.substring(0, lengthWord);
        else if (first.substring(1, lengthWord).equals(word.substring(1, lengthWord)))
            return first.substring(0, lengthWord);
        return "";
    }

    // 19.12 Given two strings, a and b, return the result of putting them together in the order abba, e.g.
    // "Hi" and "Bye" returns "HiByeByeHi".
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    // 19.13 Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    // The string length will be at least 2.
    public static String extraEnd(String first) {
        String last = first.substring(first.length() - 2, first.length());
        return last + last + last;
    }

    // 19.14 Given a string, return a version without the first and last char, so "Hello" yields "ell".
    // The string length will be at least 2.
    public static String withoutEnd(String first) {
        if (first.length() > 2) return first.substring(1, first.length() - 1);
        return "";
    }

    // 19.15 Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    // The string length will be at least 2.
    public static String left2(String first) {
        if (first.length() > 2) return first.substring(2, first.length()) + first.substring(0, 2);
        return first;
    }

    // 19.16 Given a string, return a version without both the first and last char of the string.
    // The string may be any length, including 0.
    public static String withoutEnd2(String first) {
        if (first.length() > 2) return first.substring(1, first.length() - 1);
        return "";
    }

    // 19.17 Given a string and an int n, return a string made of the first and last n chars from the string.
    // The string length will be at least n.
    public static String nTwice(String first, int n) {
        if (first.length() > n) return first.substring(0, n) + first.substring(first.length() - n, first.length());
        return first;
    }

    // 19.18 Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
    // with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
    // Note: use .equals() to compare 2 strings.
    public static boolean hasBad(String first) {
        boolean result;
        if (first.length() < 3) {
            result = false;
        } else if (first.length() >= 3 & first.substring(0, 3) == "bad") {
            result = true;
        } else if (first.length() >= 4 & first.substring(1, 4) == "bad") {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //19.19 Given two strings, append them together (known as "concatenation") and return the result. However,
    // if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
    public static String conCat(String first, String second) {
        String result = first + second;
        if (first.length() > 0 & second.length() > 0) {
            if (first.charAt(first.length() - 1) == second.charAt(0)) {
                result = first + second.substring(1, second.length());
            }
        }
        return result;
    }

    // 19.20 Given a string, return true if the first 2 chars in the string also appear at the end of the string,
    // such as with "edited".
    public static boolean frontAgain(String first) {
        if (first.length()>=4)
            if (first.substring(0,2).equals(first.substring(first.length()-2,first.length()))) return true;
        return false;
    }

    //23 The web is built with HTML strings like "Yay" which draws Yay as italic text. In this example, the "i" tag makes
    // and which surround the word "Yay". Given tag and word strings, create the HTML string with tags around
    // the word, e.g. "Yay".
    public static String makeTags(String htmlTag, String content) {
        char startTag = '<';
        char slashTag = '/';
        char endTag = '>';
        String startHtmlTag = startTag + htmlTag + endTag;
        String endHtmlTag = startTag + htmlTag + slashTag + endTag;
        String result = startHtmlTag + content + endHtmlTag;
        //String result = "" + startTag + htmlTag + endTag + content + startTag + htmlTag + slashTag + endTag;
        return result;
    }

}
