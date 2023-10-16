
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lad19.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    public static final double PI = 3.14;
    
    // tối ưu code, thay ruột của cái hàm để chạy ngon hơn
        // nhanh hơn, hoặc viết code viết đẹp hơn
        // hoặc fix bug thì phải sửa code
        // dù bạn sửa code vì lí do gì, thì code phải được test lại 
        // và test lại để đảm ảo rằng nó vẫn xanh như lần trước 
        // nếu ta viết code đi kèm test script thì việc test lại cái 
        // hàm sẽ cực nahnh, ko cần dùng mắt để dò từng dòng lệnh đúng
        // sai, mà chỉ nhìn màu xanh là đủ - vì hàm trả về như expected
        // test lại những gì đã từng test - regression test
        // kiểm thử hồi quy
        // kiểm thử lại hàm lúc này cực nhanh, vì github actions lo giùm
        // ta chỉ cần màu xanh, hoặc nhận mail chửi vì code đỏ
        
        
        // 5! = 1.2.3.4   5
        // 5! = 4! x 5 = 5 x 4!
        // 4!= 1.2.3.4 
        // 4!= 3! x 4 = 4 x 3!
        // 3!=  3 x 2!
        // 2!= 2 x 1!
        // N! = N x (N - 1)!
        public static long getFactorial (int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n, n must be 0.....20");
        
        if(n == 0 || n == 1)
            return 1; // nếu đặc biệt, ta return sớm luôn
        
        return n * getFactorial(n -1);

}

//    public static long getFactorial (int n){
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n, n must be 0.....20");
//        
//        if(n == 0 || n == 1)
//            return 1;
//        
//        long result = 1;
//        
//        for(int i = 2; i <= n; i++)
//            result *= i;
//        
//        return result;
//    }
}

