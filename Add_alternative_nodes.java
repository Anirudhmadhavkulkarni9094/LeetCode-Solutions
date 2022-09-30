// problem : Add alternative elements in linked list and print it
// sample input 1: 1->2->3->4->5->6->7
// sample output 1: 1->2->4->6->8->10->12 

import java.util.*;
class LL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = temp;
    }
    public void printList(){
        
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            
            currNode =currNode.next;
        }
        System.out.println("Null");
    }

    public void fun(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        Node currNode1  = head;
        while(currNode1 != null){
            array.add(currNode1.data);
            currNode1 = currNode1.next;
        }
        Node q = head.next;
        int i =0;
        int j = 2;
        while(q.next!=null){
            q = q.next;
            q.data = array.get(i)+array.get(j);
            i++;
            j++;
        }

    }
    
    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.fun();
        list.printList();
    } 
}
