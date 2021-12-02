/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KyThuat88
 */
public class Bao extends TaiLieu{
    private Date ngayPhatHanh;

    public Bao(Date ngayPhatHanh, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        this.ngayPhatHanh = null;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter check-in date (dd/MM/yyyy):");
        String cinput = input.nextLine();
        if(null != cinput && cinput.trim().length() > 0){
            try {
                this.ngayPhatHanh = format.parse(cinput);
            } catch (ParseException ex) {
                Logger.getLogger(Bao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ngày phát hành: "+convertDateToString(this.ngayPhatHanh));
    }
    
    private String convertDateToString(Date ngayPhatHanh) {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngayPhatHanh);
    }
    
//    public static void main(String[] args) {
//        Bao bao = new Bao();
//        bao.input();
//        bao.display();
//    }
    
    
    
    
    
}
