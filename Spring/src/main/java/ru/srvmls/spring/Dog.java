package ru.srvmls.spring;

public class Dog implements Pet {
   // private String name;

    public Dog() {
        System.out.println("Dog bean is created!");
    }

    @Override
    public void say(){
        System.out.println("ГАВ ГАВ!");

    }

    public void init(){
        System.out.println("Claas dog: init method");
    }

    public void destroy(){
        System.out.println("Class dog: destroy method");
    }

/*    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
