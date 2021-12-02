/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestProduct
{
    public static void main(String[] args) {
        int n = 0;
        Product[] product = null;
        ArrayList<Product> productList = new ArrayList<>();
            System.out.println("Nhap n :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= n; i++) {
                Product pro = new Product();
                System.out.println("Nhập thông tin hàng hóa thứ "+i);
                pro.input();
                productList.add(pro);
            } 
            float max = 0;
            for (Product pr : productList) {
                if (max < pr.getGia1SP()) {
                    max = pr.getGia1SP();
                }
            }
            System.out.println("----------------------------------------");
            System.out.println("Thông tin mặt hàng có giá trị cao  nhất :");
            for (Product pr : productList) {
                if (pr.getGia1SP() == max) {
                    pr.display();
                }
            }    
            
            Collections.sort(productList, (Product p1, Product p2) -> {
                if (p1.getGia1SP() < p2.getGia1SP()) {
                    return 1;
                } else {
                    if (p1.getGia1SP() == p2.getGia1SP()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
        });
        System.out.println("----------------------------------------");
        System.out.println("Danh sách được sắp xếp giảm dần theo giá là:");
        int i=1;
        for (Product pr : productList) {
            System.out.println("San pham thu :"+(i));
            pr.display();
            i++;
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Sản phẩm tên sữa là: ");
        productList.forEach((pr) -> { 
            if (pr.getTenHH().equals("sữa") || pr.getTenHH().equals("SỮA")){
                pr.display();
            }else{  
            }
        });  
        
    }  
    
}
