/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public TaiLieu() {
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu");
        this.maTaiLieu = sc.nextLine();
        System.out.println("Nhập tên nhà xuất bản");
        this.tenNhaXuatBan = sc.nextLine();
        System.out.println("Nhập số bản phát hành");
        this.soBanPhatHanh = sc.nextInt();
    }
    
    public void display(){
        System.out.println("Mã tài liệu: "+this.maTaiLieu);
        System.out.println("Tên nhà xuất bản: "+this.tenNhaXuatBan);
        System.out.println("Số bản phát hành: "+this.soBanPhatHanh);
    }
    
}
