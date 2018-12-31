package com.company;

import com.sun.jdi.connect.spi.TransportService;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();

        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        System.out.println(stack.peek());
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
    }
}
