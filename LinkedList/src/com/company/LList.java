package com.company;

import java.util.List;



public class LList {

    private ListNode head;
    private ListNode tail;
    private int listSize;

    public ListNode getHead() {
        return head;
    }

    public ListNode getTail() {
        return tail;
    }

    public ListNode getFirst() {
        return head;
    }

    public ListNode getLast() {
        return tail;
    }

    public void addLast(ListNode newNode) {
        //Sets ListNode parameter as new tail.
        //checks if newNode is head/or no edges
        if (newNode.getPrev() == null || newNode.getNext() == null) {
            if (newNode == head && newNode.getNext() != null) {
                head = newNode.getNext();
                head.setPrev(null);
                tail.setNext(newNode);
                newNode.setPrev(tail);
                newNode.setNext(null);
            }
            if (tail != null) {
                tail.setNext(newNode);
                newNode.setPrev(tail);
            }
            if (head == null) {
                head = newNode;
            }
            listSize++;
            tail = newNode;
        } else {//if newNode has existing edges
            newNode.getPrev().setNext(newNode.getNext());
            newNode.getNext().setPrev(newNode.getPrev());
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
            newNode.setNext(null);
        }
    }

    public void addFirst(ListNode newNode) {
        //Sets ListNode parameter as new head.
        //checks if newNode is tail/or no edges
        if (newNode == null) {
            return;
        }
        if (newNode.getPrev() == null || newNode.getNext() == null) {
            if (newNode == tail) {
                tail = newNode.getPrev();
                tail.setNext(null);
                head.setPrev(newNode);
                newNode.setPrev(null);
                newNode.setNext(head);
            }
            if (tail == null) {
                tail = newNode;
            }
            if (head != null) {
                head.setPrev(newNode);
                newNode.setNext(head);
            }
            listSize++;
            head = newNode;

        } else { //if newNode has existing connections
            newNode.getPrev().setNext(newNode.getNext());
            newNode.getNext().setPrev(newNode.getPrev());
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
            newNode.setPrev(null);
            }
    }

    public void printAll() {
        //start at head, print every value up to/including tail.
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.getValue());
            cur = cur.getNext();
        }
    }

    public int indexOf(String value) {
        //iterates through Linked List to find the index of input value
        ListNode cur = head;
        int counter = 0;
        while (cur != null) {
            if (cur.getValue().equals(value)) {
                return counter;
            }
            cur = cur.getNext();
            counter++;
        }
        return -1;
    }


    public String get(int index){
        //Given an index, return a value at specific index
        ListNode cur;
        int counter;
        boolean firstHalf = index > listSize / 2;
        if (firstHalf) {
            cur = head;
            counter = 0;
        } else {
            cur = tail;
            counter = listSize - 1;
        }

        while (cur != null) {
            if (counter == index) {
                return cur.getValue();
            }
            if (firstHalf) {
                cur = cur.getNext();
                counter++;
            } else {
                cur = cur.getPrev();
                counter--;
            }
        }
        return null;
    }

    public void add(ListNode newNode) {
        //Sets ListNode parameter as new tail.
        //checks if newNode is head or has no existing branches
        if (newNode.getPrev() == null || newNode.getNext() == null) {
            if (newNode == head) {
                head = newNode.getNext();
                head.setPrev(null);
                tail.setNext(newNode);
                newNode.setPrev(tail);
                newNode.setNext(null);
            }
            if (tail != null) {
                tail.setNext(newNode);
                newNode.setPrev(tail);
            }
            if (head == null) {
                head = newNode;
            }
            listSize++;
            tail = newNode;
        } else {
            newNode.getPrev().setNext(newNode.getNext());
            newNode.getNext().setPrev(newNode.getPrev());
            tail.setNext(newNode);
            newNode.setPrev(tail);
            newNode.setNext(null);
            tail = newNode;
        }
    }

    public void add(int index, ListNode newNode) {
        //Given an index, insert a ListNode into the Linked List at a specific index.

        ListNode cur = head;
        int counter = 0;

        while (cur != null) {
            if (counter == index) {
                if (newNode == tail) {
                    tail = newNode.getPrev();
                    tail.setNext(null);
                } else if (newNode == head) {
                    head = newNode.getNext();
                    head.setPrev(null);
                } else if (newNode.getNext() != null || newNode.getPrev() !=null) {
                    newNode.getPrev().setNext(newNode.getNext());
                    newNode.getNext().setPrev(newNode.getPrev());
                }
                if (cur == head) {
                    head = newNode;
                }
                listSize++;
                cur.getPrev().setNext(newNode);
                newNode.setPrev(cur.getPrev());
                cur.setPrev(newNode);
                newNode.setNext(cur);
            }
            cur = cur.getNext();
            counter++;
        }
    }

    public void set(int index, ListNode newNode) {
        ListNode cur = head;
        int counter = 0;


        while (cur != null) {
            if (counter == index) {
                if (newNode == tail && cur == tail) {
                    break;
                } else if (newNode == tail) {
                    tail = newNode.getPrev();
                    tail.setNext(null);
                } else if (newNode == head) {
                    head = newNode.getNext();
                    head.setPrev(null);
                } else if (newNode.getNext() != null && newNode.getPrev() != null) {
                    newNode.getPrev().setNext(newNode.getNext());
                    newNode.getNext().setPrev(newNode.getPrev());
                }
                if (cur == head) {
                    head = newNode;
                } else if (cur == tail) {
                    tail = newNode;
                }
                if (cur.getPrev() != null) {
                    cur.getPrev().setNext(newNode);
                    newNode.setPrev(cur.getPrev());
                }
                if (cur.getNext() != null) {
                    cur.getNext().setPrev(newNode);
                    newNode.setNext(cur.getNext());
                }
                if (cur != tail) {
                    cur.setNext(null);
                    cur.setPrev(null);
                }
            }
            cur = cur.getNext();
            counter++;
        }
    }

    public void push(ListNode newNode) {
        //Sets ListNode parameter as new tail.
        if (newNode.getPrev() == null || newNode.getNext() == null) {
            if (newNode == head) {
                head = newNode.getNext();
                head.setPrev(null);
                tail.setNext(newNode);
                newNode.setPrev(tail);
                newNode.setNext(null);
            }
            if (tail != null) {
                tail.setNext(newNode);
                newNode.setPrev(tail);
            }
            if (head == null) {
                head = newNode;
            }
            listSize++;
            tail = newNode;
        } else {
            newNode.getPrev().setNext(newNode.getNext());
            newNode.getNext().setPrev(newNode.getPrev());
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
            newNode.setNext(null);
        }
    }

    public String pop() {
        String val = tail.getValue();
        tail = tail.getPrev();
        tail.getNext().setPrev(null);
        tail.setNext(null);
        listSize--;
        return val;
    }

    public void remove(int index) {
        //Given an index, remove a ListNode from the Linked List at a specific index.
        ListNode cur = head;
        int counter = 0;

        while (cur != null) {
            if (counter == index) {
                if (cur.getNext() != null && cur != head) {
                    cur.getNext().setPrev(cur.getPrev());
                } else if(cur == head) {
                    head = cur.getNext();
                    head.setPrev(null);
                }
                if (cur.getPrev() != null && cur != tail) {
                    cur.getPrev().setNext(cur.getNext());
                } else if(cur == tail) {
                    tail = cur.getPrev();
                    tail.setNext(null);
                }
                cur.setNext(null);
                cur.setPrev(null);
                listSize--;
            }
            cur = cur.getNext();
            counter++;
        }
    }

    public void remove(String element) {
        ListNode cur = head;
        // counter = 0;

        while (cur != null) {
            if (cur.getValue().equals(element)) {
                if (cur.getNext() != null && cur != head) {
                    cur.getNext().setPrev(cur.getPrev());
                } else if (cur == head) {
                    head = cur.getNext();
                    head.setPrev(null);
                }
                if (cur.getPrev() != null && cur != tail) {
                    cur.getPrev().setNext(cur.getNext());
                } else if (cur == tail) {
                    tail = cur.getPrev();
                    tail.setNext(null);
                }
                cur.setNext(null);
                cur.setPrev(null);
                listSize--;
            }
            cur = cur.getNext();
        }
    }

    public void removeFirst() {
        head = head.getNext();
        head.getPrev().setNext(null);
        head.setPrev(null);
        listSize--;
    }
    public void removeLast() {
        tail = tail.getPrev();
        tail.getNext().setPrev(null);
        tail.setNext(null);
        listSize--;
    }

    public int size() {
        //iterate through the LinkedList to find size, return int
        ListNode cur = head;
        int sizeCounter = 0;

        while (cur!= null) {
            sizeCounter++;
            cur = cur.getNext();
        }
        return sizeCounter;
    }

    public int getSize() {
        return listSize;
    }

    public void clear() {
        head = null;
        tail = null;
    }
}
