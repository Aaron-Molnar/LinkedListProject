package com.company;


public class Main {

    public static void main(String[] args) {

        ListNode myNode0 = new ListNode("0");
        ListNode myNode1 = new ListNode("1");
        ListNode myNode2 = new ListNode("2");
        ListNode myNode3 = new ListNode("3");
        ListNode myNode4 = new ListNode("4");
        ListNode myNode5 = new ListNode("5");


        LList myList = new LList();
        myList.addFirst(null);
        //myList.addFirst(null);
        myList.printAll();
        /*
        LList myList = new LList();
        myList.addFirst(myNode0);
        myList.addLast(myNode1);
        myList.addLast(myNode2);
        myList.addLast(myNode3);
        myList.addLast(myNode4);
        myList.addLast(myNode5);
        myList.add(1, myNode5);
        myList.add(myNode5);
        myList.push(myNode0);



        System.out.println("These are the values of the linked list:");
        myList.printAll();
        System.out.println();
        System.out.println("The value at index '3' is : " + myList.get(3));
        myList.remove(3);
        System.out.println("The new value at index '3' is : " + myList.get(3));
        System.out.println("The size of the linked list is: " + myList.size());
        System.out.println();
        System.out.println("The Index of value '3' is at: " + myList.indexOf("3"));
        System.out.println(myList.pop() + " has been popped off of the List");
        System.out.println("Current List: ");
        myList.printAll();
        System.out.println("Set index 3 to 0 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        myList.set(3,myNode0);
        myList.printAll();
        System.out.println("Set index 3 to 4, push back any others ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        myList.add(3, myNode4);
        myList.printAll();
        System.out.println("Set index 4 to 0 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        myList.set(4,myNode0);
        myList.printAll();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + myList.getTail());
        /*
        myList.removeFirst();
        myList.printAll();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        myList.removeLast();
        myList.printAll();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        myList.remove("3");
        myList.printAll();
        System.out.println(myList.getHead());
        myList.clear();
        System.out.println("myList is all empty!");
        myList.printAll();

         */
    }
}


/*
**CLEAR, removes all elements from list.
**ADD, 1 element as a parameter, adds to end of list.
**ADD, 1 index, 1 element as parameter, adds element to specific index.
**ADDLAST, 1 element as parameter, adds element to end of list
**GET, 1 index, returns element at specified index
**GETFIRST, returns first
**GETLAST, returns last
**INDEXOF, takes 1 element, returns index of element from list
**PUSH, 1 element, adds to end of list
**POP, removes and returns last element from list
**REMOVEFIRST,
**REMOVELAST,
**REMOVE, takes 1 index, removes at specific index
**SIZE, returns size of list
**SET, 1 index 1 element, replaces old element at index in list to element
**REMOVE, takes 1 element, removes element at any index


At first it will be linked list of Strings, later will be linked list of Generics

 */