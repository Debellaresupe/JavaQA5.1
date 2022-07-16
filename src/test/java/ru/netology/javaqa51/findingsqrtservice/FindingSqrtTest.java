package ru.netology.javaqa51.findingsqrtservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FindingSqrtTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/InitialParameters.csv")
    public void testFindingSqrt(int expected, int roundA, int roundB) {

        FindingSqrtTest service = new FindingSqrtTest();

        int actual = FindingSqrtService.calculate(roundA, roundB);

        Assertions.assertEquals(expected, actual);
    }

}
