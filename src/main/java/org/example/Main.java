package org.example;

import org.example.models.Department;
import org.example.models.Employee;
import org.example.models.Lop;
import org.example.models.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("cfg.xml");

        Department department = ctx.getBean("dep1", Department.class);
        System.out.println(department);

        Department department2 = ctx.getBean("dep2", Department.class);
        System.out.println(department2);

//        Employee em = ctx.getBean("e1",Employee.class);
//        System.out.println("Employee: ");
//        em.show();
//        System.out.println();
//
//        Person person = ctx.getBean("p",Person.class);
//        System.out.println("Person: ");
//        person.show();

//        Lop lop = ctx.getBean("lop", Lop.class);
//        System.out.println("Lop: ");
//        System.out.println(lop);



    }
}