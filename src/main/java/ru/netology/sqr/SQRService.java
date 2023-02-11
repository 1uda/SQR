package ru.netology.sqr;

public class SQRService {
    public int calc(int min, int max) {
        int quantity = 0;


        for (int i = 10; i <= 99 ; i++) {
            int SQRi = i*i;
            if (SQRi >= min && SQRi <= max) {
                quantity++;
            }
        }
       return quantity;
    }
}