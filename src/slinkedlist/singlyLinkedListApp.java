/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slinkedlist;

/**
 *
 * @author USER
 */
public class singlyLinkedListApp {
    public static void main(String[] ar)
    {
        singlyLinkedList lk = new singlyLinkedList();
        lk.insertAwal(100);
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAtPos(50,1);
        lk.display();
        lk.insertAtPos(80,2);
        lk.display();
        lk.insertAtPos(50, 2);
        lk.display();
        lk.deleteAtPos(1);
        lk.display();
       
}
}
    




















    
