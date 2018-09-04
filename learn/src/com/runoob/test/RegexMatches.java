package com.runoob.test;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    private static final String REGEX = "foooooooooooo";
    private static final String INPUT = "foooooooooooo";
    private static final String INPUT2 = "oooofoooooooo";
    private static Pattern pattern;
    private static Matcher matcher;
    private static Matcher matcher2;
    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        matcher2 = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is: "+REGEX);
        System.out.println("Current INPUT is: "+INPUT);
        System.out.println("Current INPUT2 is: "+INPUT2);

        System.out.println("lookingAt()"+matcher.lookingAt());
        System.out.println("matches()"+matcher.matches());
        System.out.println("lookingAt()"+matcher2.lookingAt());

        //正则替换 replaceFirst replaceAll
        String reges = "a*b";
        String str = "aabfooaabfooabfoobkkk";
        String repalce = "-";
        Pattern p = Pattern.compile(reges);
        Matcher r = p.matcher(str);
        if (r.find()) {
            System.out.println(r.replaceFirst(repalce));
            System.out.println(r.replaceAll(repalce));
        }

    }

}
