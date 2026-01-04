package com.core;

import com.core.assignment.ConfigClass;
import com.core.assignment.DataSource;
import com.core.assignment.Hibernate;
import com.core.assignment.SessionFactory;
import com.core.college.Student;
import com.core.college.Teacher;
import com.core.concepts.Car;
import com.core.concepts.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

//        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext container1 = new AnnotationConfigApplicationContext(com.core.concepts.ConfigClass.class);

        // container
        Engine engine = container1.getBean("engine1", Engine.class);
        engine.startEngine();
        // Car
        System.out.println("--------------");
        Car car = container1.getBean("car", Car.class);
        car.start();

        Student student = container1.getBean("student", Student.class);
        System.out.println(student);
        student.show();

        // Either we can pass method name from ConfigClass or we can set the name of the bean.
        Teacher teacher = container1.getBean("teacher", Teacher.class);
        System.out.println(teacher);


        System.out.println("------------------------");
        // Assignment
        ApplicationContext container2 = new AnnotationConfigApplicationContext(ConfigClass.class);
        DataSource dataSource = container2.getBean("dataSource", DataSource.class);
        dataSource.show();

        SessionFactory sessionFactory = container2.getBean("sessionFactory",SessionFactory.class);
        sessionFactory.show();

        Hibernate hibernate = container2.getBean("hibernate", Hibernate.class);
        hibernate.show();
    }
}
