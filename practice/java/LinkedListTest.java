/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

import java.util.Scanner;

/**
 *
 * @author Abh!shek
 */

class Node{
    private int data;
    private Node next;
    
    Node(){                 //by default hota hi hai
        data = 0;
        next = null;
    }
    
    Node(int data, Node next){
        data = data;
        next = next;
    }
    
    public void setData(int data){
        data = data;
    }
    public int getData(){
        return data;
    }
    
    public void setNext(Node next){
        next = next;
    }
    public Node getNext(){
        return next;
    }
    
}

class LinkedList{
    
    private Node start;
    private int size;
    
    public LinkedList(){
        start=null;
        size=0;
    }
    
    public boolean isEmpty(){
        if(start == null){
            return true;
        }else{
            return false;
        }
    }
    public int getListSize(){
        return size;
    }
    public void viewlist(){
        Node currNode;
        if(isEmpty()){
            System.out.print("empty");
            
        }else{
             currNode = start;
            for(int i=0; i<size; i++){
                System.out.print(currNode.getData()+ " ");
                currNode = currNode.getNext();
            }
        }
    }
    
    public void insertAtStart(int data){
        Node n;
        n = new Node();
        n.setData(data);
        n.setNext(start);
        start = n; 
        size++;
    }
    public void insertAtLast(int data){
        Node n;
        Node lastNode;
        
        n = new Node();
        n.setData(data);
        lastNode = start;
        if(lastNode == null){
            start = n;
        }else{
            while(lastNode.getNext() !=null){
                lastNode= lastNode.getNext();
            }
            lastNode.setNext(n);
        }
        size++;        
        
    }
    public void insertAtPos(int data, int pos){
        if(pos==1){
            insertAtStart(data);
        }else if(pos == size+1){
            insertAtLast(data);
        }else if(pos>1 && pos<=size){
            Node n, currNode;
            n = new Node(data, null);
            currNode = start;
            for(int i=0; i<pos-1; i++){
                currNode.getNext();
            }
            n.setNext(currNode.getNext());
            currNode.setNext(n);
            size++;
        }else{
            System.out.println("not possible at "+pos);
        }
    }
    public void deleteFirst(){
        if(start!=null){
            start = start.getNext();
            size--;
        }
    }
    public void deleteLast(){
        if(start==null){
            System.out.println("empty");
        }
        else if(size == 1){
            start = null;
            size++;
        }
        else{
            Node currNode;
            currNode = start;
            for(int i=0; i<size-1; i++){
                currNode = currNode.getNext();
            }
            currNode.setNext(null);
            size--;
        }
    }
    public void deleteAtPos(int pos){
        if(start == null){
            System.out.println("empty");
        }
        else if(pos<1 || pos>size){
            System.out.println("invalid pos");
        }
        else if(pos == 1){
            deleteFirst();
        }
        else if(pos == size){
            deleteLast();
        }
        else{
            Node currNode, curr2;
            currNode = start;
            for(int i=0; i<pos-1; i++){
                currNode = currNode.getNext();
            }
            curr2 = currNode.getNext();
            currNode.setNext(curr2.getNext());
            size--;
        }
    }
    
    
}



public class LinkedListTest {
    public static void main(String[] args){
        
        LinkedList list = new LinkedList();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. add at start");
        System.out.println("2. add at last");
        System.out.println("3. add at pos");
        System.out.println("4. delete at first");
        System.out.println("5. delete at last");
        System.out.println("6. add at pos");
        System.out.println("7. view");
        System.out.println("Now, Enter your choice......");
        while(true){
            int pos, val;
            int c = sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("enter val");
                    val = sc.nextInt();
                    list.insertAtStart(val);
                    break;
                case 2:
                    System.out.println("enter pos");
                    val = sc.nextInt();
                    list.insertAtLast(val);
                    break;
                case 3:
                    System.out.println("enter pos");
                    pos = sc.nextInt();
                    System.out.println("enter val to add");
                    val = sc.nextInt();
                    list.insertAtPos(val, pos);
                    break;
                case 4:
                    list.deleteLast();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.println("enter pos");
                    pos = sc.nextInt();
                    list.deleteAtPos(pos);
                    break;
                case 7:
                    list.viewlist();
                    break;
                default: 
                    System.out.println("invalid choice");
            }
        }
        
        
    }
}
