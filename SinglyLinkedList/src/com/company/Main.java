package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jonDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilliams = new Employee("Mike", "Williams", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(janeJones);
        list.addToFront(jonDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilliams);

        list.printList();

        System.out.println(list.getSize());

        System.out.println(list.isEmpty());

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}
