package com.core.concepts;

public class Car {
    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("setting engine");
        this.engine = engine;
    }

//    public Car(Engine engine,int cost){
//        this.engine = engine;
//        System.out.println("cost inside constructor: " + cost);
//    }

    public void start() {
        engine.startEngine();
        System.out.println("Car Started");
    }
}
