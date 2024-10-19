package com.micu.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTest {
    // @Test là 1 phần annotation framework biến cái hàm của ta thành main
    // để run. hàm bth chỉ có thể trong main() để chạy
    // @Test biến hàm bất kì thành MAIN()

    // Kĩ thuật DDT -- data driven testing: là kĩ thuật tách bộ data kiểm thử ra
    // Khỏi các lệnh kiểm thử, mục đích giúp dev nhìn nhanh đc xem
    // b test case còn thiếu nào k
    // kĩ thuat nay dc goi ten khác là tham so hoa bo data kiemr thử

    public static Object[][] initTestData(){
        return new Object[][]
                       {{0, 1},
                        {1, 1},
                        {2, 2},
                        {3, 6},
                        {4, 24},
                        {5, 120},
                        {6, 7200},
                        };
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    void testFacrorialGivenRightArguement5RunsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    public static  Integer[] initDataforCheckingException(){
        return new Integer[] {-1, -2, -3, -4, 21, 22, 100};
    }
    @ParameterizedTest
    @MethodSource("initDataforCheckingException")
    void testFacrorialGivenWrongArguementThrowException(int n){
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(n));
    }


}