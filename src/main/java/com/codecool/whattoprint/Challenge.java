package com.codecool.whattoprint;

class Challenge {
    public static String decideAndSay(String[] words, int number) {
        return ((number % 3 == 0) ? words[0] : "") + ((number % 7 == 0) ? words[1] : "");
    }
}
