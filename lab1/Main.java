package com.company;

public class Main {

    public int nConstruct() {

        int n = (int) (Math.random() * 1000000);
        n = n*3;

        String binary="10101";
        int decimal=Integer.parseInt(binary,2);

        n = n+decimal;

        String hexa="FF";
        int intValue = Integer.parseInt(hexa,16);

        n = n + intValue;

        n = n*6;

        return n;
    }

    public int compute(int number) {
        int result = 0;
        while (number != 0) {
            result = result + (number % 10);
            number = number / 10;
        }

        return result;
    }

    public static void main(String[] args) {

        Main object = new Main();

        System.out.println("Hello World!");

        String[] languages;
        languages = new String[] {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        int n = object.nConstruct();
        int result = object.compute(n);
        if (result >= 10) {result = object.compute(result);}

        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }
}
