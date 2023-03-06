package ru.srvmls.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        var inputGrand = 55;
        System.out.println(inputGrand);
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
    }
}
