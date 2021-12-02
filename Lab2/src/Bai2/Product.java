/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Product {
     private String maHH;
    private String tenHH;
    private float soLuong;
    private float gia1SP;

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public Product() {
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hàng hóa: ");
        this.maHH = sc.nextLine();
        System.out.println("Nhập tên hàng hóa: ");
        this.tenHH = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        this.soLuong = sc.nextFloat();
        System.out.println("Nhập giá 1 Sp: ");
        this.gia1SP = sc.nextFloat();
    }
    
    public void display(){
        System.out.println("Mã hàng hóa: "+this.maHH);
        System.out.println("Tên hàng hóa: "+this.tenHH);
        System.out.println("Số lượng hàng hóa: "+this.soLuong);
        System.out.println("Giá 1 Sp: "+this.gia1SP);
    }
}
