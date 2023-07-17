package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user1");


        //Employee emp = (Employee)context.getBean("E");
        Employee emp1 = (Employee)context.getBean("f");
        Employee emp2 = (Employee)context.getBean("G");
        Employee agg = (Employee)context.getBean("Aggregation");

        System.out.println(user);
        System.out.println(user1);


        System.out.println("----------------------------------");
        //System.out.println("Two-argu"+emp);
        System.out.println("One-argu id:"+emp1);
        System.out.println("One-argu name:"+emp2);
        System.out.println("----------------------------------");
        System.out.println(agg);

        System.out.println("----------------------------------");
        Question ques = (Question) context.getBean("collection-test");
        ques.displayInfo();

        



           }
}