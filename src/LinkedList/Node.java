/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author user
 */
public class Node {
    protected int data;
    protected Node link;
    /*Constructor*/
    public Node(){
        link=null;
        data=0;
    }
    /*Construktor*/
    public Node(int d,Node n){
        data=d;
        link=n;
    }
    /*function to set link to next NodeP */
    public void setLink(Node n){
        link=n;
    }
    /*Function to st data to current node */
    public void setData(int d){
        data=d;
    }
    /*function to get link to next node */
    public Node getLink(){
        return link;
    }
    /*function to get data from current Node*/
    public int getData(){
        return data;
    }
}
