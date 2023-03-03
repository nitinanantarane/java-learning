package com.workshop;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String args[]) {
        Consumer<List<String>> print  = System.out::println;

        List<Employee> employees = EmployeeData.build();
        // for each
        employees.stream().forEach(e -> System.out.println(e.getName()));

        // flatmap
        String projects = employees.stream().
            map(e -> e.getProject()).
            flatMap(e -> e.stream()).
            collect(Collectors.toSet()).
            stream().collect(Collectors.joining(", "));
        System.out.println(projects);

        String ratings = employees.stream().map(e -> e.getRating().values()).
            flatMap(e -> e.stream()).
            collect(Collectors.joining(", "));
        System.out.println(ratings);

        String awards = employees.stream().map(e -> e.getAwards()).flatMap(e -> e.stream()).
            collect(Collectors.joining(", "));
        System.out.println(awards);

        // min max
        Employee employee = employees.stream().
            min(Comparator.comparing(o -> o.getSalary())).
            stream().findFirst().get();

        System.out.println(employee.getName());

        // grouping
        Map<Integer, List<String>> grouping = employees.stream().
            collect(Collectors.groupingBy(e -> e.getName().length(),
                Collectors.mapping(e -> e.getName(), Collectors.toList())));

        System.out.println(grouping);

        // summing
        Double salary = employees.stream().
            collect(Collectors.summingDouble(e -> e.getSalary()));
        System.out.println(salary);

        Double avg = employees.stream().
            collect(Collectors.averagingDouble(e -> e.getSalary()));
        System.out.println(avg);

        // skipping
        List<String> skip = employees.stream().
            skip(1).map(e -> e.getName())
            .collect(Collectors.toList());
        print.accept(skip);

        List<String> limit = employees.stream().
            limit(1).map(e -> e.getName()).
            collect(Collectors.toList());
        System.out.println(limit);
    }
}

class EmployeeData {
    static List<Employee> build() {
        List<Employee> employees = List.of(
            new Employee("Nitin", 42, 5000,
                List.of("Project 1", "Project 2"),
                Map.of(2015, "P1", 2016, "P"),
                Set.of("AWS-Cert", "java-cert"),
                new Department("IT")
            ),
            new Employee("Vinay", 40, 6000,
                List.of("Project 1", "Project 3"),
                Map.of(2015, "P2", 2016, "P3"),
                Set.of("Spring-Cert", "java-cert"),
                new Department("CS")
            ),
            new Employee("Ravindra", 43, 5500,
                List.of("Project 1", "Project 3", "Project 4"),
                Map.of(2015, "P1", 2016, "P1", 2017, "P2"),
                Set.of("Spring-Cert", "java-cert", "AWS-cert"),
                new Department("ELC")
            )
        );

        return employees;
    }
}
class Employee {
    String name;
    int age;
    double salary;
    List<String> project;
    Map<Integer, String> rating;
    Set<String> awards;
    Department department;

    public Employee(String name, int age, double salary,
                    List<String> project,
                    Map<Integer, String> rating,
                    Set<String> awards,
                    Department department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.project = project;
        this.rating = rating;
        this.awards = awards;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getProject() {
        return project;
    }

    public void setProject(List<String> project) {
        this.project = project;
    }

    public Map<Integer, String> getRating() {
        return rating;
    }

    public void setRating(Map<Integer, String> rating) {
        this.rating = rating;
    }

    public Set<String> getAwards() {
        return awards;
    }

    public void setAwards(Set<String> awards) {
        this.awards = awards;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
