/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagliliste;

import java.util.Scanner;

/**
 *
 * @author ckadir
 */
public class BagliListe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Liste b1 = new Liste();
        Liste b2 = new Liste();

        b1.basaEkle(true);
        b1.basaEkle(false);
        b1.basaEkle(true);
        
        b2.decToBinary(10);
        
        System.out.println("1. liste ");
        b1.listele();
        System.out.println("2. liste ");
        b2.listele();
        
        Liste b3 = new Liste();
        b3.binTobin(b1, b2);
        System.out.println("l1 + l2 => " + b3.binToDec(b3.bas));

        b3.listele();
    }

}

class Liste {

    node bas;
    node son;

    public Liste() {
        bas = null;
        son = null;
    }

    public void binTobin(Liste l1, Liste l2) {
        int toplam = l1.binToDec(l1.bas) + l2.binToDec(l2.bas);
        this.decToBinary(toplam);
    }
    public void decToBinary(int sayi) {
        Liste n = new Liste();
        while (sayi > 0) {
            this.sonaEkle((sayi % 2) == 0 ? false : true);
            sayi /= 2;
        }
    }

    public int binToDec(node ilk) {
        int sayi = 0, i = 1;

        node tmp = ilk;
        while (null != tmp) {
            if ((tmp.icerik)) {
                sayi += us(i - 1);
            }
            if (tmp.ileri != null) {
                i++;
                tmp = tmp.ileri;

            } else {
                break;
            }
        }
        return sayi;
    }

    public int us(int s) {
        int us = 1;
        while (s != 0) {
            us *= 2;
            s--;
        }
        return us;
    }

    public void aradanSil(int sira) {
        node tmp = bas;
        int i = 1;
        while (i <= sira) {
            if (i == 1) {
                bas = bas.ileri;
                break;
            }
            if (i == sira - 1) {

                tmp.ileri = tmp.ileri.ileri;

                break;
            }
            tmp = tmp.ileri;
            i++;
        }

    }

    public void bastanSil() {
        bas = bas.ileri;

    }

    public void sondanSil() {
        node tmp = bas;

        while (tmp.ileri != null) {
            if (tmp.ileri.ileri == null) {
                tmp.ileri = null;
                son = tmp;
                break;
            }
            tmp = tmp.ileri;

        }

    }

    /**
     * @param eleman kacıncı elemana eklenecek
     */
    public void ortayaEkle(int eleman, boolean icerik) {
        node n = new node(icerik);
        node tmp = bas;
        int i = 1;
        while (i <= eleman) {
            if (eleman == i) {
                if (elemanSayisi() == eleman) {
                    son.ileri = n;
                    son = n;
                    break;
                }
                n.ileri = tmp.ileri;
                tmp.ileri = n;
                tmp = n.ileri;
            }
            tmp = tmp.ileri;
            i++;

        }
    }

    public void ortayaEkleARA(boolean aranacak, boolean icerik) {
        node n = new node(icerik);
        node tmp = bas;
        int i = 1;
        while (true) {
            if (aranacak == tmp.icerik) {
                if (tmp == son) {
                    son.ileri = n;
                    son = n;
                    break;
                }
                n.ileri = tmp.ileri.ileri;
                tmp.ileri = n;
                tmp = n;
                break;
            }
            tmp = tmp.ileri;

            i++;
        }
    }

    public void sonaEkle(boolean icerik) {
        node n = new node(icerik);
        if (bas == null) {
            bas = n;
            bas.ileri = null;
            son = n;
        } else {
            son.ileri = n;
            son = n;
        }
    }

    public int elemanSayisi() {
        node tmp = bas;
        int i = 1;
        while (tmp.ileri != null) {
            tmp = tmp.ileri;
            i++;
        }
        return i;
    }

    public void basaEkle(boolean icerik) {
        node n = new node(icerik);
        if (bas == null) {
            bas = n;
            son = n;
        } else {
            n.ileri = bas;
            bas = n;
        }
    }
    public void listele() {
        node tmp = bas;
        while (null != tmp) {
            System.out.println(((tmp.icerik) ? 1 : 0));
            tmp = tmp.ileri;
        }
    }
}


class node {

    boolean icerik;
    node ileri;
    public node(boolean icerik) {
        ileri = null;
    }
}
