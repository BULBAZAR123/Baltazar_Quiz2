/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baltazar_quiz2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList {
    Node head;

    SingleLinkedList() {
        head = null;
    }

    
    public void myList(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    
    boolean search(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true; 
            }
            current = current.next;
        }
        return false; 
    }
}
public class Baltazar_Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("PRESS:\nNUMBER 1\nNUMBER 2");
        int a = scn.nextInt();
        if (a ==1) {
            num1();
        }else if (a == 2) {
            num2();
        }
    }
    
    public static void num1(){
        Scanner scn = new Scanner(System.in);
        System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
        System.out.println("Enter the number you want to find from 1 to 10");
        int a = scn.nextInt();
        
        SingleLinkedList list = new SingleLinkedList();
    
        list.myList(1);
        list.myList(2);
        list.myList(3);
        list.myList(4);
        list.myList(5);
        list.myList(6);
        list.myList(7);
        list.myList(8);
        list.myList(9);
        list.myList(10);

        int target = a;

        if (list.search(target)) {
            System.out.println(target + " is found in the linked list.");
        } else {
            System.out.println(target + " is not found in the linked list.");
        }

        System.out.println("PRESS:\nNUMBER 1\nNUMBER 2");
        int b = scn.nextInt();
        if (b ==1) {
            num1();
        }else if (b == 2) {
            num2();
        }
    }
    
    
    public static void num2(){
        class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1 || head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Invalid position. Inserting at the end.");
                insertAtEnd(data);
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

      LinkedList myList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("*ENTER A NUMBER YOU WANT TO INSERT\n*ENTER (-0) TO EXIT\n ");
            int data = scanner.nextInt();
            if (data == -0) {
                Scanner scn = new Scanner(System.in);
        System.out.println("PRESS:\nNUMBER 1\nNUMBER 2");
        int b = scn.nextInt();
        if (b ==1) {
            num1();
        }else if (b == 2) {
            num2();
        }
                break;
            }
            System.out.print("Enter what position to insert: ");
            int position = scanner.nextInt();
            myList.insertAtPosition(data, position);
            myList.display();
        }  

    }
    
}
