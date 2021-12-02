/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai1;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class Product {
    private String tenHangHoa;
    private String nhaSanXuat;
    private float giaBan;

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public Product(String tenHangHoa, String nhaSanXuat, float giaBan) {
        this.tenHangHoa = tenHangHoa;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" + "tenHangHoa=" + tenHangHoa + ", nhaSanXuat=" + nhaSanXuat + ", giaBan=" + giaBan + '}';
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên hàng hóa: ");
        this.tenHangHoa = sc.nextLine();
        System.out.println("Nhập nhà sản xuất: ");
        this.nhaSanXuat = sc.nextLine();
        System.out.println("Nhập giá bán: ");
        this.giaBan = sc.nextFloat();
    }
    
    
    public void output(){
        System.out.println("----------------------------------");
        System.out.println("Tên hàng hóa: "+ this.tenHangHoa);
        System.out.println("Tên nhà sản xuất: "+ this.nhaSanXuat);
        System.out.println("Giá bán: "+ this.giaBan);
    }
    
    public void sort(Product[] product){
        for (int i = 0; i < product.length - 1; i++) {
            for (int j = i + 1; j < product.length; j++) {
                if (product[i].giaBan > product[j].giaBan) {
                    Product tem = product[i];
                    product[i] = product[j];
                    product[j] = tem;
                }
            }
        }
    }
}
