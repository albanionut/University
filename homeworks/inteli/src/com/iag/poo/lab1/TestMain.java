package com.iag.poo.lab1;

import com.iag.poo.lab1.Students.Students;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students[] student = new Students[]{new Students("Alban", "Ionut", 19),
                new Students("Alban", "Bogdan", 16)};
//        Students student = new Students("Alban", "Ionut", 19);
        for (int i = 0; i < student.length; i++) {
            student[1].setPrenume("Valentin");
            System.out.println(student[i].toString());
        }

    }
}
