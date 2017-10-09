/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list01;

/**
 *
 * @author Eduardo
 */
public class Node <T> {
    T data;
    Node next;
    
    Node(T d){
        this.data = d;
        this.next = null;
    }
    
    Node (){
        next = null;
    }
    
    public void print(){
        System.out.println(data+"->");
    }
    
    public void printS(){
        System.out.println(data);
        System.out.println("↓");
    }
}
