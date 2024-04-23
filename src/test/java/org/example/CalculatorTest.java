/*
STUDENT NUMBER : B221202558
STUDENT NAME   : OBADA SMAISEM
YAZILIM DOĞRULAMA VE ONAYLAMA DERS
HomeWork - Parameterized Test
GitHub Link :  https://github.com/obadasm/SoftwareVerificationAndValidationHM1.git
 */
package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

class CalculatorTest {

    @ParameterizedTest
    @MethodSource("divisionTestData")
    void testDivision(float expected, float a, float b) {
        assertEquals(expected, Calculator.divide(a, b));
    }

    // Define a static method to provide test data
    static Stream<Arguments> divisionTestData() {
        return Stream.of(
                Arguments.of(5, 10, 2),    // Test case 1
                Arguments.of(2.5f, 10, 4),  // Test case 2
                Arguments.of(5, 12.5f, 2.5f), // Test case 3
                Arguments.of(4, 10, 2.5f), // Test case 4
                Arguments.of(2.5f, 12.5f, 5)  // Test case 5
        );
    }
}
