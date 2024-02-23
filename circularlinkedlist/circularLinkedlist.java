package circularlinkedlist;

import java.util.Scanner;

public class circularLinkedlist {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    Node tail = null;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    // 1-2-3-4-5
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {

            tail.next = newNode;
            tail = newNode;
            newNode.next = head;

        }
    }

    public void insertMid(int data, int length) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;

        } else {

            // 1-2-3-4-5-6

            System.out.println("Enter position..");
            Scanner sc = new Scanner(System.in);
            int position = sc.nextInt();
            Node temp1 = head;
            Node temp2 = head.next;
            int count = 2;
            if (position < 2 || position >= length) {
              System.out.println("Enter valid position");
            } else if (position == 2) {
                temp1.next = newNode;
                newNode.next = temp2;
            } else {
                do {

                    temp1 = temp1.next;
                    temp2 = temp2.next;
                    count++;

                } while (count != position && temp1 != head);

                temp1.next = newNode;
                newNode.next = temp2;
            }

        }

    }

    public void printList() {
        Node temp = head;
        do {
            System.out.print(temp.data + " -");
            temp = temp.next;
        } while (temp != head);
    }

    public int getListLenght() {
        int c = 0;
        if (head == null) {
            return 0;
        }
        // 1-2-3-4-5-6
        Node temp = head;
        do {
            temp = temp.next;
            c++;
        } while (temp != head);
        return c;
    }

    public static void main(String[] args) {

        circularLinkedlist l1 = new circularLinkedlist();

        int A[] = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < A.length; i++) {
            //l1.insertFirst(A[i]);
            l1.insertLast(A[i]);
        }
        int listlength= l1.getListLenght();
        l1.insertMid(99,listlength);
        l1.printList();
    }

}
