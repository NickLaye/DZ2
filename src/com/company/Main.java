package com.company;

public class Main {

    public static void main(String[] args) {

    //Задача 1
	byte a = 5;
    System.out.println(a);
    short b = 10;
    System.out.println(b);
    int c = 200;
    System.out.println(c);
    long d = 2000L;
    System.out.println(d);
    float e = 1.6f;
    System.out.println(e);
    double g = 2.9;
    System.out.println(g);
    char i = 33;
    System.out.println(i);
    boolean n = 10 > 5;
    System.out.println(n);

    // Задача 2
    float firstBoxerWeight = 78.2f;
    float secondBoxerWeight = 82.7f;
    float fullWeght = firstBoxerWeight + secondBoxerWeight;
    float weightDifference = (firstBoxerWeight + secondBoxerWeight) % firstBoxerWeight;
    System.out.println("Общий вес двух бойцов = " + fullWeght + " кг!");
    System.out.println("Разница между весами бойцов = " + weightDifference + " кг!");

    //Задача 3

    int bananaWeight = 80;
    int bananaNumber = 5;
    int banana = bananaNumber * bananaWeight;
    float milkWeight = 1.05f;
    float milkNumber = 200f;
    float milk = milkNumber * milkWeight;
    int plombirWeight = 100;
    int plombirNumber = 2;
    int plombir = plombirNumber * plombirWeight;
    int eggWeight = 70;
    int eggNumber = 4;
    int egg = eggNumber * eggWeight;
    float gWeiht = banana + milk + plombir + egg;
    float kgWeight = gWeiht / 1000;
    System.out.println("Вес коктейля = " + gWeiht + " грамм!");
    System.out.println("Вес коктейля = " + kgWeight + " килограмм!");

    // ЗАДАЧА 4

    int garbageWeight = 7000;
    int lost250 = 250;
    int lost500 = 500;
    int days250 = garbageWeight / lost250;
    int days500 = garbageWeight / lost500;
    int middleDays = (days250 + days500) / 2;
    System.out.println(days250 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
    System.out.println(days500 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
    System.out.println(middleDays + " среднее количество дней для похудения");

    // Задание 5

    int mashaOldPayment = 67_760;
    int mashaOldSum = mashaOldPayment * 12;
    int mashaNewPayment = (int) (mashaOldPayment * 1.1);
    int mashaNewSum = mashaNewPayment * 12;
    int mashaDifference = (mashaOldSum + mashaNewSum) % mashaOldSum;
    System.out.println( "Маша теперь получает " + mashaNewPayment + " рублей. Годовой доход вырос на " + mashaDifference + " рублей" );

    int denisOldPayment = 83_690;
    int denisOldSum = denisOldPayment * 12;
    int denisNewPayment = (int) (denisOldPayment * 1.1);
    int denisNewSum = denisNewPayment * 12;
    int denisDifference = (denisOldSum + denisNewSum) % denisOldSum;
    System.out.println("Денис теперь получает " + denisNewPayment + " рублей. Годовой доход вырос на " + denisDifference + " рублей");

    int krisOldPayment = 76_230;
    int kristOldPayment = 83_690;
    int krisOldSum = krisOldPayment * 12;
    int krisNewPayment = (int) (kristOldPayment * 1.1);
    int krisNewSum = krisNewPayment * 12;
    int krisDifference = (krisOldSum + krisNewSum) % krisOldSum;
    System.out.println("Кристина теперь получает " + krisNewPayment + " рублей. Годовой доход вырос на " + krisDifference + " рублей");
    }
}
