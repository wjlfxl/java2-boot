package com.example.springboot02;

import com.example.springboot02.pojo.Dog;
import com.example.springboot02.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot02ApplicationTests {

    @Autowired  //自动装配
//    @Qualifier  //指定装配
    private Person person;

    @Test
    void dogTest() {
        System.out.println(person);
    }

}
