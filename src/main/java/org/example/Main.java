package org.example;

public class Main {
    public static void main(String[] args) {
        ArrayImplPractice arrayImplPractice = new ArrayImplPractice(5);
        arrayImplPractice.add_by_index(0, 10);
        arrayImplPractice.add_by_index(1, 20);
        arrayImplPractice.add_by_index(2, 30);
        arrayImplPractice.add_by_index(3, 40);
        arrayImplPractice.add_by_index(4, 40);
//        arrayImplPractice.add_by_index(0, 10);
        arrayImplPractice.add_by_value(70);
//        arrayImplPractice.add_by_index(3, 80);
//        arrayImplPractice.remove_by_index(2);
        arrayImplPractice.remove_by_value(40);
        arrayImplPractice.printArray();

    }
}