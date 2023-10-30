package com.ll;

public class Main {
    public static void main(String[] args) {
        Calc.run("3*1");
    }
}

class Calc {
    void run(String num) {
        Stirng[] mut = num.split("*", 2);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        num1 = Integer.valueOf(mut[0]);
        num2 = Integer.valueOf(mut[1]);

    }
}