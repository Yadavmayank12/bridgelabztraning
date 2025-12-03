package com.hi;

class CompareUtil {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }
}

public class Compare {
    public static void main(String[] args) {
        System.out.println(CompareUtil.isEqual(10, 10));
        System.out.println(CompareUtil.isEqual("Hello", "World"));
    }
}

