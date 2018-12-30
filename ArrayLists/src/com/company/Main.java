package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Williams", 3245));

        // Changes an item in a list at a given index.
        employeeList.set(1, new Employee("John", "Adams", 4568));
        employeeList.forEach(employee -> System.out.println(employee));

        // Prints whether or not the list is empty.
        System.out.println(employeeList.isEmpty());

        // Prints the size of the list
        System.out.println(employeeList.size());

        // Adds a new employee at a given index in the list.
        employeeList.add(3, new Employee("John", "Doe", 4567));

        // Creates a array maid up of all the items in the list.
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee: employeeArray){
            System.out.println(employee);
        }

        // Prints if a list contains a certain item.
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        // Prints the index of a certain item in the list.
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
