/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package com.lad19.mathutil.core;

import junit.framework.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilityDDTTest extends TestCase {
    
   // ta tách bộ data kiểm thử ra khỏi câu lệnh so sánh
    // kỹ thuật này gọi là DDT - Data Driven Testing
    // kiểm thử hàm, app mà tách riêng bộ data ra 1 chỗ để dex kiểm
    // soát sự thiếu đủ các test case, các test data
    // data test ta để riêng ra 1 chỗ, thường là mảng, hay file Exel
    // hoặc table
    // 0! -> 1
    // 1! -> 1
    // 2! -> 2
    // 3! -> 6
    // 4! -> 24
    // 5! -> 120
    // thấy mùi của mảng 2 chiều
    
    public static Object[][] initData(){
//        int [] a = {phần thử của mảng 1 chiều cách nhau dấu phẩy 5, 10, 15};
            
        Object[][] testData = {{0,1}, 
                               {1,1},
                               {2,2},
                               {4,24},
                               {5,120}};
                             // n  expected
        return testData;
    }
    // kỹ thuật tham số hóa (DDT)
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRighArgumentReturnsOk(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
