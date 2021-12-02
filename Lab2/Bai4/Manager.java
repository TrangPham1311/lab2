/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai4;

import Lab2.Bai3.UnetiBook;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class Manager {
    
    public static void main(String[] args) {
        int n = 0;
        Car car =new Car();
        Mobile mobile = new Mobile();
        Car[] cara = null;
        Mobile[] moba = null;
        do {
            menu();
            System.out.println("Nhập lựa chọn :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.println("Nhập số lượng điện thoại :");
                    m = Integer.parseInt(sc.nextLine());
                    moba = new Mobile[m];
                    for (int i = 0; i < m; i++) {
                        System.out.println("Nhập thông tin điện thoại thứ: "+i);
                        moba[i] = new Mobile();
                        moba[i].input();
                    }
                    break;
                }
                case 2: {
                    int p;
                    System.out.println("Nhập số lượng ô tô :");
                    p = Integer.parseInt(sc.nextLine());
                    cara = new Car[p];
                    for (int i = 0; i < p; i++) {
                        System.out.println("Nhập thông tin ô tô thứ: "+i+1);
                        cara[i] = new Car();
                        cara[i].input();
                    }
                    
                    break;
                }
                case 3: {
                    System.out.println("Thông tin danh sách ô tô");
                    for (int i = 0; i < cara.length; i++) {
                        System.out.println("Thông tin ô tô thứ: "+i);
                        cara[i].display();
                    }
                    System.out.println("---------------------------------");
                    System.out.println("Thông tin danh sách điện thoại");
                    for (int i = 0; i < moba.length; i++) {
                        System.out.println("Thông tin điện thoại thứ: "+i);
                        moba[i].display();
                    }
                    System.out.println("---------------------------------");
                    break;
                }
                case 4: {
                    searchNameManufacture(cara,moba);
                    break;
                }
                case 5: {
                    break;
                }
                default:{
                    System.out.println("Không có lựa chọn ");
                    break;
                }
            }
        } while (n != 5);
    }

    public static void menu(){
        System.out.println("1 Nhập thông tin n điện thoại ");
        System.out.println("2 Nhập thông tin n ô tô");
        System.out.println("3 Hiển thị thông tin ô tô và điện thoại");
        System.out.println("4 Tìm kiếm theo nhà sản xuất");
        System.out.println("5 Thoát ");
    }   
    
    public static void searchNameManufacture(Car[] cara, Mobile[] moba){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên nhà sản xuất");
        String nameManu =sc.nextLine();
        int dem=0;
        int dem2 = 0;
        System.out.println("Danh sách tìm kiếm:");
        for (int i = 0; i < cara.length; i++) {
            if(cara[i].getManufacture().equals(nameManu)){
                cara[i].display();
                dem++;
            }
            if(moba[i].getManufacture().equals(nameManu)){
                moba[i].display();
                dem++;
            }
        }   
        if(dem==0){
            System.out.println("Không tồn tại");
        }   
    }
}
