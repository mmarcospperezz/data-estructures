package org.ies.lists;

public class MyLinkedList {
    private MyNode head;

    public Double get(int i) {
        if( head == null) {
            return null;
        } else {
            return head.get(i);
        }
    }

    public void addFirst(double number) {
        var node = new MyNode(
                number,
                head
        );
        head = node;
    }

    public void add(double number) {
        var node = new MyNode(
                number,
                null
        );
        if(head == null) {
            head = node;
        } else {
            head.add(node);
        }
    }

    public Double getFirst() {
        if(isEmpty()) {
            return null;
        } else {
            return head.getValue();
        }
    }

    public void add(int value) {

    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        } else {
            return false;
        }
    }
}