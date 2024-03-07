package com.example.fn;

public class SampleFunction {

    public String sampleMethod(String input) {
        String name = (input == null || input.isEmpty()) ? "world"  : input;
        System.out.println("Inside SampleFunction function");
        return "GoodMorning, " + name + "!";
    }

}
~      