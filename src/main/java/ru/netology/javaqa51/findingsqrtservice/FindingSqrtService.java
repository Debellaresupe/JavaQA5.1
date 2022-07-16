package ru.netology.javaqa51.findingsqrtservice;

public class FindingSqrtService {
    public static int calculate(int roundA, int roundB) {
        int numberSqrt = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= roundA & i * i <= roundB) {
                numberSqrt++;
            }
        }
        return numberSqrt;
    }

}
