package com.app.entity;

class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand=brand;
        System.out.println("Brand of car :-"+ brand);
    }
}
    class practice extends Vehicle {
        String model;
        public practice(String model, String brand) {
            super(brand);
            this.model = model;
            System.out.println("model of car :"+model);
    }

    public static void main(String[] args) {
            practice car = new practice("Creata", "four blar");
    }
}
