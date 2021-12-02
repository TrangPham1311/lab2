/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai3;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class TestBook {
    public static void main(String[] args) {
        int n = 0;
        UnetiBook ab =new UnetiBook();
        UnetiBook[] ab1=null;
        do {
            menu();
            System.out.println("Nhập lựa chọn :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.println("Nhập số lượng sách :");
                    m = Integer.parseInt(sc.nextLine());
                    ab1 = new UnetiBook[m];
                    for (int i = 0; i < m; i++) {
                        System.out.println("Nhập thông tin sách thứ: "+i+1);
                        ab1[i] = new UnetiBook();
                        ab1[i].input();
                    }
                    break;
                }
                case 2: {
                    if (ab1 == null) {
                        System.out.println("Bạn chưa nhập dữ liệu");
                    } else {
                        System.out.println("Danh sách vừa nhập :");
                        for (int i = 0; i < ab1.length; i++) {
                            System.out.println("Thông tin sách thứ: " + (i + 1));
                            ab1[i].output();
                        }
                    }
                    break;
                }
                case 3: {
                    if (ab1 == null) {
                        System.out.println("Bạn chưa nhập dữ liệu");
                    } else {
                        sort(ab1);
                        System.out.println("Danh sách sau khi sắp xếp :");
                        for (int i = 0; i < ab1.length; i++) {
                            System.out.println("Thông tin sách thứ: " + (i + 1));
                            ab1[i].output();
                        }
                    }
                    break;
                }
                case 4: {
                    searchNameBook(ab1);
                    break;
                }
                case 5: {
                    searchNameBook(ab1);
                    break;
                }
                case 6:
                    break;
                default:{
                    System.out.println("Không có lựa chọn ");
                    break;
                }
            }
        } while (n != 6);
    }
    
    
    public static void menu(){
        System.out.println("1 Nhập thông tin n sách ");
        System.out.println("2 Hiển thị thông tin vừa nhập");
        System.out.println("3 Sắp xếp giảm dần của năm xuất bản");
        System.out.println("4 Tìm kiếm theo tên sách");
        System.out.println("5 Tìm kiếm theo tên tác giả ");
        System.out.println("6 Thoát");
    }
    
    public static void searchNameBook(UnetiBook[] b){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên sách");
        String nameBook=sc.nextLine();
        int dem=0;
        System.out.println("Sách bạn muốn tìm là:");
        for (int i = 0; i < b.length; i++) {
            if(b[i].getBookName().equals(nameBook)){
                b[i].output();
                dem++;
            }
        }   
        if(dem==0){
            System.out.println("Không tồn tại");
        }   
    }
    
    public static void searchNameAuthor(UnetiBook[] b){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên tác giả:");
        String nameAuthor =sc.nextLine();
        int dem=0;
        System.out.println("Sách bạn muốn tìm là:");
        for (int i = 0; i < b.length; i++) {
            if(b[i].getBookAuthor().equals(nameAuthor)){
                b[i].output();
                dem++;
            }
        }   
        if(dem==0){
            System.out.println("Không tồn tại");
        }   
    }
    
    public static void sort(UnetiBook[] b){
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i].getYearPublishing() < b[j].getYearPublishing()){
                    UnetiBook tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
        }
    }
}
