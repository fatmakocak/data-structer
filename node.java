package odev3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ckadir
 */
public class node {
    int value;
    node next;
    node pre;

    public node(int v) {
        value = v;
        next = null;
        pre =null;
    }
    
}
