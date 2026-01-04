package com.core.concepts;

import com.core.college.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.core.concepts","com.core.college"})
public class ConfigClass {
    // for inbuilt classes we can create a bean/object like this.
    @Bean(name="teacher")
    public Teacher getTeacher(){
        return new Teacher();
    }
}
