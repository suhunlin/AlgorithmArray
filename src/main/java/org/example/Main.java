package org.example;

public class Main {
    public static void main(String[] args) {
        ArrayImplPractice arrayImplPractice = new ArrayImplPractice(5);
        arrayImplPractice.add_by_index(0, 10);
        arrayImplPractice.add_by_index(1, 20);
        arrayImplPractice.add_by_index(2, 30);
        arrayImplPractice.add_by_index(3, 40);
        arrayImplPractice.add_by_index(4, 50);
//        arrayImplPractice.add_by_index(0, 10);
        arrayImplPractice.add_by_value(70);
        arrayImplPractice.printArray();

    }
}