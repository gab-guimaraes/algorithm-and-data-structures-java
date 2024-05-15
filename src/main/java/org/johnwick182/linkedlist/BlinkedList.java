package org.johnwick182.linkedlist;

public class BlinkedList {
     Node head;

     public void add(int value) {
         if (head == null) {
             head = new Node(value);
         } else {
             Node current = head;
             while (current.next != null) {
                 current = current.next;
             }
             current.next = new Node(value);
         }
     }

     public Node search(int value) {
         if (head == null)
             return null;

         Node current = head;
         while (current != null) {
             if (current.value == value) {
                 return current;
             }
             current = current.next;
         }
         return null;
     }


     class Node {
      int value;
      Node next;

      Node(int value) {
          this.value = value;
          this.next = null;
      }
     }
}
