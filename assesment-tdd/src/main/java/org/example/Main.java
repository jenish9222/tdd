package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<Integer> filterInput(String input) {
        List<String> values = new ArrayList<>(Arrays.asList(input.split("\", \"")));

        List<String> finalVal = new ArrayList<>();
        for(String val:values) {
            if(!val.isEmpty() && val.equals("\"")) {
                finalVal.add("0");
            } else if(!val.isEmpty()) {
                finalVal.add(val.split("\"")[0]);
            }
        }
        return finalVal.stream().map(Main::add).collect(Collectors.toList());
    }


    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] numArray = numbers.split("[,\n]");

        int sum = 0;

        for (String num : numArray) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }

    public static void main(String[] args) {
        String input = "\"\", \"1\", \"1\n5\"";

        System.out.println(filterInput(input));

    }

}