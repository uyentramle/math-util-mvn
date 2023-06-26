
package com.utl.mathutil.core.test;

import com.utl.mathutlil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author uyent
 */
public class MathUtilityDDTTest {

    public static Object[][] initTestData() {
        Integer testData[][] = {{0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {5, 120}};
                            //   n   expected
                            //   c0, c1
        return testData;
    }

    // nhồi data ở trên vào trong hàm assertEquals(expected-cột 1, getF(cột 0)
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
