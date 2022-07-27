package ru.netology.javaqa51.findingsqrtservice;

public class FindingSqrtService {
    public static int calculate(int borderA, int borderB) {
        int numberSqrt = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= borderA & i * i <= borderB) {
                numberSqrt++;
            }
        }
        return numberSqrt;
    }

}
