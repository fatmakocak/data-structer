/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

/**
 *
 * @author ckadir
 */
public class node {

    int aci;
    double sinAciDegeri;
    public node ileri;
    public node geri;

    public node(int x, double y) {
        this.aci = x;
        this.sinAciDegeri = y;
        this.ileri = null;
        this.geri = null;
    }
}
