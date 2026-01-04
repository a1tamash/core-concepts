package com.core.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionFactory {
    private DataSource dataSource;

    @Autowired
    public SessionFactory(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void show(){
        dataSource.show();
        System.out.println("SessionFactory");
    }
}
