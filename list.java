/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev2;

/**
 *
 * @author ckadir
 */
public class list {

    public node bas;
    public node son;

    public list() { // sorunun a şıkkı burası listeye 0-360 daki sinüs değerleri eklenir.
        double[] sin = new double[361];
        double radian;
        for (int i = 0; i <= 360; i++) {
            radian = Math.toRadians(i);
            this.sonaEkle(i, Math.sin(radian));
        }
    }

    public double[] listedeAraPozitif(int x) { // x = derecedir appletten gönderiliyor 
        node tmp = bas;
        double dizi[] = new double[360];
        while (true) {

            if (tmp.aci == x) {
                for (int j = 0; j < 360; j++) {

                    dizi[j] = tmp.sinAciDegeri;
                    tmp = tmp.ileri;
                }
                return dizi;
            }
            tmp = tmp.ileri;
            if (tmp == son) {
                return null;
            }
        }
    }
    public double[] listedeAraNegatif(int x) {
        node tmp = bas;
        double dizi[] = new double[360];
        while (true) {

            if (tmp.aci == 360 + x) {
                for (int j = 0; j < 360; j++) {

                    dizi[j] = tmp.sinAciDegeri;
                    tmp = tmp.geri;
                }
                return dizi;
            }
            tmp = tmp.ileri;
            if (tmp == son) {
                return null;
            }
        }
    }
/**
 * 
 * listenin sonuna eleman ekler
 * 
 * 
 */
    public void sonaEkle(int x, double y) {
        node n = new node(x, y);
        if (bas == null) {
            bas = n;
            son = n;
        } else {

            son.ileri = n;
            n.geri = son;
            n.ileri = bas;
            bas.geri = n;
            son = n;
        }
    }

    public void basaEkle(int x, double y) {
        node n = new node(x, y);

        if (bas == null) {
            bas = n;
            son = n;
        } else {
            son.ileri = n;
            n.geri = son;
            bas.geri = n;
            n.ileri = bas;
            bas = n;
        }
    }
}
