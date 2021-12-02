/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai5;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(int soPhatHanh, int thangPhatHanh, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phát hành: ");
        this.soPhatHanh = sc.nextInt();
        System.out.println("Nhập tháng phát hành: ");
        this.thangPhatHanh = sc.nextInt();
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Số phát hành: "+this.soPhatHanh);
        System.out.println("Thánh phát hành: "+this.thangPhatHanh);
    }
    
    
    
    
}
