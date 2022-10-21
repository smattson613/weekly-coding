package intersection;

import java.util.LinkedList;

public class ListIntersection {

    static Node h1, h2;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node intersectionNode(Node headA, Node headB) {
        Node A = headA, B = headB;
        if (A == null || B == null) {
            return null;
        }
        while (A != B) {
            A = A == null ? headB : A.next;
            B = B == null ? headA : B.next;
        }
        return A;
    }

    public static void main(String[] args) {
        ListIntersection list = new ListIntersection();

        Node same1 = new Node(8);
        Node same2 = new Node(10);


        list.h1 = new Node(3);
        list.h1.next = new Node(7);
        list.h1.next.next = same1;
        list.h1.next.next.next = same2;


        list.h2 = new Node(99);
        list.h2.next = new Node(1);
        list.h2.next.next = same1;
        list.h2.next.next.next = same2;

        System.out.println(list);
        System.out.println(intersectionNode(h1, h2));
    }
}
