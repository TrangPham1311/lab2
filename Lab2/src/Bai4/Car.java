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
public class Car extends Engine{
    private int totalSeat;
    private float speed;

    public Car() {
    }

    public Car(int totalSeat, float speed, String engineId, String engineName, String manufacture, int yearMaking, float price) {
        super(engineId, engineName, manufacture, yearMaking, price);
        this.totalSeat = totalSeat;
        this.speed = speed;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số chỗ ngồi");
        this.totalSeat = sc.nextInt();
        System.out.println("Nhập tốc độ");
        this.speed = sc.nextFloat();
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Số chỗ ngồi: "+this.totalSeat);
        System.out.println("Tốc đọ: "+this.speed);
    }
    
    
    
    
}
