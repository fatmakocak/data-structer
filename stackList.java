/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev3;

/**
 *
 * @author ckadir
 */
public class stackList {

    node top;
    node last;

    public void add(int val) {
        node n = new node(val);
        if (top == null) {
            top = n;
            last = n;
        } else {
            last.next = n;
            n.pre = last;
            last = n;
        }
    }

    public void listUndo() {
        node tmp = last;
        System.out.print("[ ");
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.pre;
        }
        System.out.print("]");
    }

    public void list() {
        node tmp = top;
        System.out.print("[ ");
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.print("]");
    }

    public int getLast() {
        return last.value;
    }

    public boolean isEmpty() {
        return (top != null);
    }

    public int remove() {
        if (last == top) {
            node n = top;
            top = null;
            last = null;
            return n.value;
            
        } else {
            int val = last.value;
            last.pre.next = null;
            last = last.pre;
            return val;
        }
    }
}
