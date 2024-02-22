import java.util.Scanner;

public class linkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insertFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
        } else {
            // head
            newNode.next = head;
            head = newNode;

        }
    }

    public void insertLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void insertMid(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
        } else {
            System.out.println("Enter position to add node");
            Scanner sc = new Scanner(System.in);
            int position = sc.nextInt();
            Node temp = head;

            for (int i = 1; i < position - 12; i++) {
                temp = temp.next;
            }

            Node current = temp.next;
            newNode.next = current;
            temp.next = newNode;

        }
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {

        linkedlist l1 = new linkedlist();
        int A[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < A.length; i++) {
            l1.insertLast(A[i]);
        }
        
        l1.insertMid(23);
        l1.printList();
    }
}