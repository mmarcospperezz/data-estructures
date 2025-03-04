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
       head = new MyNode(number,head);
    }

    public void add(double number) {
      if (head == null){
          head = new MyNode(number, null);
      } else {
          var last = head;
          while (last.getNext() != null){
              last = last.getNext();
          }
          last.setNext(new MyNode(number, null));
      }
    }

    public Double getFirst() {
       if (head == null){
           return null;
       } else {
           return head.getValue();
       }
    }

    public boolean isEmpty() {
       return head == null;
    }
}