package com.company;

public class ListNode {

    private ListNode next = null;
    private ListNode prev = null;
    private String value;


    ListNode(String value) {
        this.setValue(value);
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }





}
