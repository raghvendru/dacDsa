//package LinkedList;
//
//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class SinglyLL {
//
//    public Node conAToLL(int[] arr) {
//        if (arr.length == 0) return null; 
//
//        Node head = new Node(arr[0]);
//        Node tail = head; 
//
//        for (int i = 1; i < arr.length; i++) {
//            Node newNode = new Node(arr[i]);
//            tail.next = newNode; 
//            tail = newNode;      
//        }
//
//        return head;
//    }
//
//    public void printList(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//        SinglyLL ss = new SinglyLL();
//        int[] arr = {10, 20, 30, 40, 50};
//        Node head = ss.conAToLL(arr);
//        ss.printList(head);
//    }
//}
