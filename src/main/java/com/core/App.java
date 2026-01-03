package com.core;

import com.core.concepts.Car;
import com.core.concepts.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Project Started");
        System.out.println("Starting Point");

//        Car car = new Car(new Engine());
//        car.start();

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        // container
        Engine engine = container.getBean("engine1", Engine.class);
        engine.startEngine();
        // Car
        System.out.println("--------------");
        Car car = container.getBean("car", Car.class);
        car.start();
    }
}
