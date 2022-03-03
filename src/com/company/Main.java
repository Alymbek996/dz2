package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(dod(20, 10));
        System.out.println(dod(25, 11));
        System.out.println(dod(23, 12));
        System.out.println(dod(45, 13));
        System.out.println(dod(30, 14));

    }

    public static String dod(int ageOfMan, int temp) {
        String toy1 = "Можно идти гулять ";
        String toy2 = "Оставайтесь дома ";
        if (ageOfMan >= 20 && ageOfMan <= 45 && temp >= -20 && temp <= 30) {
            return toy1;
        } else if (ageOfMan < 20 && temp >= 0 && temp <= 28) {
            return toy1;
        } else {
            return toy2;
        }
    }
}
