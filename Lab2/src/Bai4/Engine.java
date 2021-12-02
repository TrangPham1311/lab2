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
public class Engine {
    private String engineId;
    private String engineName;
    private String manufacture;
    private int yearMaking;
    private float price;

    public Engine(String engineId, String engineName, String manufacture, int yearMaking, float price) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.manufacture = manufacture;
        this.yearMaking = yearMaking;
        this.price = price;
    }

    public Engine() {
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã máy");
        this.engineId = sc.nextLine();
        System.out.println("Nhập tên máy");
        this.engineName = sc.nextLine();
        System.out.println("Nhập nhà sản xuất");
        this.manufacture = sc.nextLine();
        System.out.println("Nhập năm sản xuất");
        this.yearMaking = sc.nextInt();
        System.out.println("Nhập giá bán");
        this.price = sc.nextFloat();
    }
    
    public void display(){
        System.out.println("Mã máy: "+this.engineId);
        System.out.println("Tên máy: "+this.engineName);
        System.out.println("Nhà sản xuất: "+this.manufacture);
        System.out.println("Năm sản xuất: "+this.yearMaking);
        System.out.println("Giá bán: "+this.price);
        
    }
    
    
}
