package com.core.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
//    @Autowired
    Engine engine;

    public Engine getEngine() {
        return engine;
    }

//    @Autowired
    public void setEngine(Engine engine) {
        System.out.println("setting engine: setter injection");
        this.engine = engine;
    }

    @Autowired
    public Car(Engine engine){
        System.out.println("Car Constructor Injection");
        this.engine = engine;
//        System.out.println("cost inside constructor: " + cost);
    }

    public Car(){
    }

    public void start() {
        engine.startEngine();
        System.out.println("Car Started");
    }
}


/*
*** Note ***
* By default, constructor injection is called after adding context: component-scan.
* Use @Autowired for setter injection and filed injection
 */