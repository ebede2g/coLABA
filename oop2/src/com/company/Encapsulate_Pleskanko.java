package com.company;

public class Encapsulate_Pleskanko {
    public int field1 = 100;
    protected int field2 = 150;
    int field3 = 200;
    private int field4 = 250;

    public int getField4() {
        return this.field4;
    }

    public static void main(String[] args) {
        new Class2().method1();
    }
}

class Class2 extends Encapsulate_Pleskanko {
    public void method1() {
        System.out.println("Значення відкритого public полля - field1: " + this.field1);
        System.out.println("Значення захищеного protected поля - field2: " + this.field2);
        System.out.println("Значення поля без модифыкатора - field3: " + this.field3);
        System.out.println("Значення інкапсульованого закритого private поля - field4: " + getField4());
    }
}
