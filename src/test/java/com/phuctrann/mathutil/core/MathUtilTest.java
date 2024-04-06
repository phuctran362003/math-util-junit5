/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phuctrann.mathutil.core;

import static com.phuctrann.math.util.core.MathUtil.*;

//import static là dành riêng cho hàm static
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author phuctrann
 */
public class MathUtilTest {

    //chơi DDT, tách data khỏi câu lệnh kiểm thử, tham số hóa data này vào kiểm thử
    //chuẩn bị bộ data
    public static Object[][] initData() {
        return new Integer[][]{
            {1, 1},
            {2, 2},
            {5, 120},
            {5, 720}
        };
    }

    @ParameterizedTest
    @MethodSource(value = "initData") //tên hàm cung cấp data, ngầm định thứ tự của phần tử
    //map vào tham số hàm
    public void testGetFactorialGivenRightArgReturnsWell(int input, int expected) {
        assertEquals(expected, getFactorial(input));
    }

    // Bắt ngoại lệ khi đưa data cà chớn!!!
    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }

//    @Test
//    public void testGetFactorialGivenRightArgReturnsWell() {
//        assertEquals(24, getFactorial(4));
//    }
//    public void testGetFactorialGivenWrongArgThrowException() {
//        //xài lamda expression
//        //hàm nhận tham số thứ 2 là 1 cái object có code implement cái function
//        //tên là Excutable - có 1 hàm duy nhất ko code
//        //tên là execute()
//        
//        //chơi chậm: 
////        Executable exObj = new Executable() {
////            @Override
////            public void execute() throws Throwable {
////                getFactorial(-5);
////            }
////        };
////        assertThrows(IllegalArgumentException.class, exObj);
//
//        //chơi chậm hơn: 
////        Executable exObj = ()-> getFactorial(-5);
////        assertThrows(IllegalArgumentException.class, exObj);
//
//        // bố đời nhất: 
//        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
//    }
}
