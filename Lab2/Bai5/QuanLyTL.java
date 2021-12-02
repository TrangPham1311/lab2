/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KyThuat88
 */
public class QuanLyTL {
    private ArrayList<TaiLieu> taiLieus;
    private Scanner reader;
    
    
    public QuanLyTL() {
        taiLieus = new ArrayList<>();
        reader = new Scanner(System.in);
    }
    
    public Sach taoMoiSach(){
        Sach s = new Sach();
        s.input();
        return s;
    }
    
    
    public TapChi taoMoiTapChi(){
        TapChi tapChi = new TapChi();
        tapChi.input();
        return tapChi;
    }
    
    public Bao taoMoiBao(){
        Bao bao = new Bao();
        bao.input();
        return bao;
    }
    
    
    
    public void nhapDanhSachTaiLieu(){
        
        int selectedValue;
        do {
            menu();
            System.out.println("Bạn chọn: ");
            selectedValue = Integer.parseInt(reader.nextLine());
            switch(selectedValue){
            case 1:
                taiLieus.add(taoMoiSach());
                break;
            case 2:
                taiLieus.add(taoMoiTapChi());
                break;
            case 3:
                taiLieus.add(taoMoiBao());
                break;
        }
       } while (selectedValue!=4);
    }
    
    
    public static  void menu(){
//        System.out.println("1: Nhập thông tin tài liệu");
//        System.out.println("2: Hiển thị thông tin các tài liệu");
//        System.out.println("3: Tìm kiếm tài liệu theo loại");
//        System.out.println("4: Tìm kiếm sách theo tên tác giá");
//        System.out.println("5: Tìm kiếm theo tên tác giả gần đúng");
//        System.out.println("6: Hiển thị danh sách theo chỉ định của người dùng");
        System.out.println("Nhập 1 - Tạo mới sách");
        System.out.println("Nhập 2 - Tạo mới tạp chí");
        System.out.println("Nhập 3 - Tạo mới báo");
        System.out.println("Nhập 4 - Kết thúc");
    }
    
    private void xuatThongTin(TaiLieu taiLieu){
        
        if (taiLieu instanceof Sach) {
            Sach sach = (Sach) taiLieu;
            sach.display();
        }
        else{
            if (taiLieu instanceof TapChi) {
                TapChi tapChi = (TapChi) taiLieu;
                tapChi.display();
            }else{
                Bao bao = (Bao)taiLieu;
                bao.display();
            }
        }
    }
    

    
    
    public void xuatDanhSachTaiLieu(){
        for (TaiLieu taiLieu : taiLieus) {
            xuatThongTin(taiLieu);
            System.out.println("---------------------");
        }
    }
    
    
    public void timTheoLoai(String loai){
        if (loai.equalsIgnoreCase("Sách")) {
            for (TaiLieu taiLieu : taiLieus) {
                if (taiLieu instanceof Sach) {
                    xuatThongTin(taiLieu);
                }
            }
        }else if (loai.equalsIgnoreCase("Tạp Chí")) {
            for (TaiLieu taiLieu : taiLieus) {
                if (taiLieu instanceof TapChi) {
                    xuatThongTin(taiLieu);
                }
            }
        }else if (loai.equalsIgnoreCase("Báo")) {
            for (TaiLieu taiLieu : taiLieus) {
                if (taiLieu instanceof Bao) {
                    xuatThongTin(taiLieu);
                }
            }
        }
    }
    
    
    public void timGanDungTheoTenSach(String str){
        for (TaiLieu taiLieu : taiLieus) {
            if (taiLieu instanceof Sach) {
                Sach sach = (Sach) taiLieu;
                if (sach.getTenSach().indexOf(str)!=-1) {
                    xuatThongTin(taiLieu);
                }
            }
        }   
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QuanLyTL QuanLyTL = new QuanLyTL();
        QuanLyTL.nhapDanhSachTaiLieu();
        QuanLyTL.xuatDanhSachTaiLieu();
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Nhập loại bạn muốn tìm: ");
        QuanLyTL.timTheoLoai(input.nextLine());
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Tìm gần đúng theo tên sách");
        System.out.println("Nhập tên sách bạn muốn tìm: ");
        QuanLyTL.timGanDungTheoTenSach(input.nextLine());
    }
}
