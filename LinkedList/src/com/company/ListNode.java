package com.company;

public class ListNode {

    private ListNode next = null;
    private ListNode prev = null;
    private String value;


    ListNode(String value) {
        this.setValue(value);
    }
    public void setNext(ListNode nextObj) {
        next = nextObj;
    }
    public void setPrev(ListNode prevObj) {
        prev = prevObj;
    }
    public void setValue(String strValue) {
        value = strValue;
    }


    public ListNode getNext(){
        return next;
    }
    public ListNode getPrev() {
        return prev;
    }
    public String getValue(){
        return value;
    }





}
