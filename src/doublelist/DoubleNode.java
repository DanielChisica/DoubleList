/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist;

/**
 *
 * @author Daniel Jimenez
 */
public class DoubleNode {

    public DoubleNode(Object obj, DoubleNode last, DoubleNode next) {
        this.obj = obj;
        this.last = last;
        this.next = next;
    }

    DoubleNode(Object value) {
        obj=value;
        last=null;
        next=null;
    }
    
    DoubleNode(Object value, DoubleNode n){
        obj=value;
        last=null;
        next=n;
    }
    
    

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public DoubleNode getLast() {
        return last;
    }

    public void setLast(DoubleNode last) {
        this.last = last;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
    private Object obj;
    private DoubleNode last;
    private DoubleNode next;
}
