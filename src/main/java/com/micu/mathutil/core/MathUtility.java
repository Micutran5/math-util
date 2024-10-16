package com.micu.mathutil.core;
// tạo bộ thư viện cung cấp các hàm tiện ích liên quan toán học
// vì là độ tiện ích dùng chung, tool nhiều nơi sử dụng => hàm static
public class MathUtility {
    // hàm tính giai thừa n! = 1.2.3....n
    // k có giai thừa số âm
    // 0! = 1
    //20! vua du kieu long, 18 con so 0 k choi 21!
    public static long getFactorial(int n) {

        if(n < 0|| n > 20)
            throw new IllegalArgumentException("Invalid number, n must be between 0 to 20");

        if(n == 0|| n == 1)
            return 1;
        // song toi day n = 2,3,4,5...20
        // vong for nhan don - nguyen ly con heo dat

        long result = 1;
        for(int i = 2; i <= n; i++)
            result *= i;

        return result;
    }
}
