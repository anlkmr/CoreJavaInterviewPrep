package com.java.CoreJavaInterviewPrep;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    long id;
    String name;
    String skill;

    public Employee(long id, String name, String skill) {
        this.id = id;
        this.name = name;
        this.skill = skill;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}


public class TEST10AUG12PM {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1L, "Ankit","Spring");

        Employee emp2 = new Employee(2L, "Rahul","Java");

        Employee emp3 = new Employee(3L, "Swaraj","React");

        List<Employee> employees = Arrays.asList(emp1,emp2,emp3);


        employees.stream().filter(e -> e.getSkill().equalsIgnoreCase("Java")).collect(Collectors.toList()).forEach(e -> System.out.println(e.id+":"+e.getName()+":"+e.getSkill()+" "));













    }




}
