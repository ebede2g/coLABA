package com.company;

public class Polymorph_Pleskanko {
    void method() {
        System.out.println("Це був визван метод суперкласу Polymorpt");
    }

    public static void main(String[] args) {
        new NewClass1().method();
        new NewClass2().method();
    }
}

class NewClass1 extends Polymorph_Pleskanko {
    void method() {
        System.out.println("Це був викликаний метод класу нащадка NewClass1");
    }
}

class NewClass2 extends Polymorph_Pleskanko {
    void method() {
        System.out.println("Це був викликаний метод класу нащадка NewClass2");
    }

}
