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
public class ProductMenu {
    public static void main(String[] args) {
        int n = 0;
        Product a = new Product();
        Product[] product = null;
        do {
            menu();
            System.out.println("Nhap vao lua chon cua ban :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.println("Nhap vao n :");
                    m = Integer.parseInt(sc.nextLine());
                    product = new Product[m];
                    for (int i = 0; i < m; i++) {
                        product[i] = new Product();
                        product[i].input();
                    }
                break;
                }
                case 2: {
                    if (product == null) {
                        System.out.println("ban chua nhap du lieu");
                    } else {
                        System.out.println("du lieu ban vua nhap la :");
                        for (int i = 0; i < product.length; i++) {
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            product[i].output();
                        }
                    }
                break;
            }
            case 3: {
                if (product == null) {
                    System.out.println("ban chua nhap du lieu");
                } else {
                    a.sort(product);
                    System.out.println("du lieu sau khi sap xep la :");
                    for (int i = 0; i < product.length; i++) {
                        System.out.println("thong tin hang hoa thu " + (i + 1));
                        product[i].output();
                    }
                }
                break;
            }
            case 4:
                break;
            default: {
                System.out.println("khong co lua chon cua ban ");
                break;
                }
            }
        } while (n != 4);
    }
    
    public static void menu(){
        System.out.println("1: Nhập sản phẩm");
        System.out.println("2: Xuất sản phẩm");
        System.out.println("3: Sắp xếp sản phẩm");
        System.out.println("4: Thoát");
    }
}
