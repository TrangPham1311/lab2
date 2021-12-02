/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class Mobile extends Engine{
    private String country;

    public Mobile() {
    }

    public Mobile(String country, String engineId, String engineName, String manufacture, int yearMaking, float price) {
        super(engineId, engineName, manufacture, yearMaking, price);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nước sản xuất");
        this.country = sc.nextLine();
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nước sản xuất: "+this.country);
    }
    
    
    
    
}
