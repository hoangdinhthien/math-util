/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author dinht
 */
//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP CÁI TIỆN ÍCH CHO NƠI KHÁC XÀI 
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÀI GÌ 
//CHO RIÊNG TA, HÀM STATIC GIÚP FLAFM ĐIỀU NÀY
public class MathUtil {

    //n! =1.2.3.4.5.6....n
    //quy ước: 0! = 1! = 1
    //ko tính giai thừa cho số âm 
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm, 21 giai thừa, ta éo tính, ta đập vào mặt ai xài hàm 
    // một ngoại lệ, chửi éo tính được
    //
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        }
        //hàm dùng liền éo cần return 

        //xuống tới đây là n= 0 tới 20 òi 
        if (n == 0 || n == 1) {
            return 1; //dừng ngay khi n đặc biệt 
        }
        //xuống tới dây, n = 2...20 òi 
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất, ốc bu dồn thịt
        //i = 2, i = 3, i = 4, i = 5, i = n nhồi liên tục i vào tích
        long product = 1; //tích khởi đầu là 1, nhồi 2 3 4 5 6 7 8 ... n
        for (int i = 2; i <= n; i++) {
            product *= i; //product = product  đang có nhân i, đập ngược trở lại
            //product = product * i; // nhồi liên tục product
            //nhân từ 2 đến 
        }
        return product;
    }
}
