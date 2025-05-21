package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<People> musicals = new ArrayList<>();

        musicals.add(new People("Hamilton", "Lin-Manuel", 2015));
        musicals.add(new People("Rent", "JonathanLarson", 1996));
        musicals.add(new People("Memphis", "BryanFenkart", 2009));
        musicals.add(new People("TheAddamsFamily", "AndrewLippa", 2010));
        musicals.add(new People("WestSideStory", "LeonardBernstein", 1957));
        musicals.add(new People("TheLastFiveYears", "JasonRobertBrown", 2001));

        Collections.sort(People);
    }
}
