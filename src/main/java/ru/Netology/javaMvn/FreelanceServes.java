package ru.Netology.javaMvn;

public class FreelanceServes {


    public int calculateMonthsOfRest(int income, int expenses, int threshold) {
        int money = 0;
        int monthsOfRest = 0;

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                // Отдых
                money -= expenses;
                money /= 3;
                monthsOfRest++;
            } else {
                // Работа
                money += income;
                money -= expenses;
            }
        }

        return monthsOfRest;
    }
}
