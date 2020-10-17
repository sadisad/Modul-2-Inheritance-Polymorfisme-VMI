package com.iSad.Modul2.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subclass = new Y();

        superClass.getValue("Mati Listrik");
        subclass.getValue("Mati lampu");
    }
}