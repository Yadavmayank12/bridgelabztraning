package com.hi;

import java.util.*;

class NumberUtil {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for(Number n : list) sum += n.doubleValue();
        return sum;
    }
}

public class Numericsum {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4);
        List<Double> doubles = Arrays.asList(1.5,2.5,3.5);
        System.out.println(NumberUtil.sumNumbers(ints));
        System.out.println(NumberUtil.sumNumbers(doubles));
    }
}
