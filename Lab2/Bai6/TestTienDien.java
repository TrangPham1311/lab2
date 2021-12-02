/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai6;

import static Lab2.Bai5.QuanLyTL.menu;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class TestTienDien {
    KhachNuocNgoai khnn = new KhachNuocNgoai();
    KhachVietNam khvn = new KhachVietNam();
    
    KhachNuocNgoai[] arrnn= null;
    KhachVietNam[] arrvn = null;
    
    
    public static  void menu(){
        System.out.println("1: Nhập danh sách khách Việt Nam");
        System.out.println("2: Nhập danh sách khách nước ngoài");
        System.out.println("3: Kết thúc");
    }
    
    public void nhapDanhSachKhachHang(){
        Scanner sc = new Scanner(System.in);
        int selectedValue;
        do {
            menu();
            System.out.println("Bạn chọn: ");
            selectedValue = Integer.parseInt(sc.nextLine());
            switch(selectedValue){
            case 1:
                System.out.println("Nhập số lượng khách Việt Nam");
                int m = sc.nextInt();
                arrvn = new KhachVietNam[m];
                for (int i = 0; i < arrvn.length; i++) {
                    System.out.println("Nhập thông tin khách hàng thứ: "+i);
                    arrvn[i].input();
                }
                break;
            case 2:
                System.out.println("Nhập số lượng khách ngước ngoài");
                int p = sc.nextInt();
                arrnn = new KhachNuocNgoai[p];
                for (int i = 0; i < arrnn.length; i++) {
                    System.out.println("Nhập thông tin khách hàng thứ: "+i);
                    arrnn[i].input();
                }
                break;
            case 3:
                
                break;
        }
       } while (selectedValue!=4);
    }
    
    public void tinhTong(KhachNuocNgoai[] arrnn, KhachVietNam[] arrvn){
        double tongnn = 0;
        double tongvn = 0;
        for (int i = 0; i < arrnn.length; i++) {
            tongnn += arrnn[i].getSoLuong();
        }
        System.out.println("Tông số lượng điện tiêu thụ khách nước ngoài: "+tongnn);
        for (int i = 0; i < arrvn.length; i++) {
            tongvn += arrvn[i].getSoLuong();
        }
        System.out.println("Tông số lượng điện tiêu thụ khách Việt Nam: "+tongvn);
    }
    
    public void trungBinhThanhTien(KhachNuocNgoai[] arrnn){
        double max = arrnn.length; 
        double tong = 0;
        for (int i = 0; i < this.arrnn.length; i++) {
            tong += arrnn[i].getThanhtien();
        }
        System.out.println("Trung bình cộng thành tiền khách nước ngoài: "+(tong/max));
    }
    
}
