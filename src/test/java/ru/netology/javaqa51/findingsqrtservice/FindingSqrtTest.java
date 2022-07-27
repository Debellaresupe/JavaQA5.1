package ru.netology.javaqa51.findingsqrtservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FindingSqrtTest {
    @Test
    public void threeSqrWithinTheBorders200_300() {

        FindingSqrtTest service = new FindingSqrtTest();

        int actual = FindingSqrtService.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void zeroSqrWithinTheBorders20_30() {

        FindingSqrtTest service = new FindingSqrtTest();

        int actual = FindingSqrtService.calculate(20, 30);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneSqrWithinTheBorders100_100() {

        FindingSqrtTest service = new FindingSqrtTest();

        int actual = FindingSqrtService.calculate(100, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

}
