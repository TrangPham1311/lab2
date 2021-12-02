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
public class Sach extends TaiLieu{
    private String tenTacGia;
    private String tenSach;
    private int soTrang;

    public Sach(String tenTacGia, String tenSach, int soTrang, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public Sach() {
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        this.tenTacGia = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        this.tenSach = sc.nextLine();
        System.out.println("Nhập số trang");
        this.soTrang = sc.nextInt();
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tên tác giả: "+this.tenTacGia);
        System.out.println("Tên sách: "+this.tenSach);
        System.out.println("Số trang: "+this.soTrang);
    }
    
    
    
    
}
