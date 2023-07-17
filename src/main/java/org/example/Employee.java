package org.example;

public class Employee {
    private int empid;
    private String empname;
    private User user; //Aggregation

    public Employee(){
     System.out.println("no-arg employee");
    }

    public Employee(int id){
        this.empid = id;
    }
    public Employee(String name){
        this.empname = name;
    }
    public Employee(int id, String name,User user){
        this.empid = id;
        this.empname = name;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", user=" + user +
                '}';
    }
}
