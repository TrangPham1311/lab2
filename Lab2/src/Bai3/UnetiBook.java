/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UnetiBook extends Book {
   private String language;
    private int semester;

    public UnetiBook(String language, int semester, String bookName, String bookAuthor, String producer, int yearPublishing, float price)
    {super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }

    public UnetiBook() {
    }
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

   @Override
    public void input() {
        System.out.println("-----------------------------");
        Scanner sc = new Scanner(System.in);
        super.input(); 
        System.out.println("Nhập ngôn ngữ: ");
        this.language = sc.nextLine();
        System.out.println("Nhập học kỳ: ");
        this.semester = sc.nextInt();
    }

   @Override
    public void output() {
        super.output();
        System.out.println("Ngôn ngữ: "+this.language);
        System.out.println("Học kỳ: "+this.semester);
    }
}

