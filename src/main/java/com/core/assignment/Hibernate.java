package com.core.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hibernate {
    private SessionFactory sessionFactory;

    @Autowired
    public Hibernate(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory ;
    }

    public void show(){
        sessionFactory.show();
        System.out.println("Hibernate");
    }
}
