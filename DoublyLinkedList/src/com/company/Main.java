package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jonDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilliams = new Employee("Mike", "Williams", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(jonDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilliams);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
    }
}
