/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai6;

import java.util.Date;

/**
 *
 * @author KyThuat88
 */
public class KhachNuocNgoai extends KhachHang{
    private String quocTich;

    public KhachNuocNgoai(String quocTich, String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, Date ngayHD) {
        super(maKH, hotenKH, soLuong, dongia, thanhtien, ngayHD);
        this.quocTich = quocTich;
    }

    public KhachNuocNgoai() {
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    
    public void thanhTien(KhachNuocNgoai nn){
        System.out.println("Thành tiền: "+ nn.getSoLuong()*nn.getDongia());
    }
}
