/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev2;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatmak
 */
public class applett extends Applet {

    list l = new list();
    int derece = 1 , periyod = 1;

    @Override
    public void init() {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        this.setSize(1350, 900);
    }

    @Override
    public void paint(Graphics g) {
        
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, 900);
        g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        int i = 0, periyod = 8;
        
        if (derece > 0) { // eğer derece pozitif ise listedeAraPozitif fonksiyonu döner.
            
            double[] degerY = l.listedeAraPozitif(derece); // dizi şeklinde elemanlar döndürür.
            int a = derece; // dereceyi ara bir değere kaydettik
            int p = 0;
            double sayac = 0;
            while(p < 180){
                sayac += degerY[i];
                p++;
            }
            System.out.println("0-180 arası sinüs değerleri toplamı : " + sayac);
            while (derece < (360 * periyod) + a) { // 2 periyod istendiğinde 720 ye kadar gider buna ek olarak 90.dereceden isteniyorsa 720+90(a değişkeni) 810 değer döner
                g.drawLine((this.getWidth() / 2) + (derece / 5), (int) ((this.getHeight() / 2) - (degerY[(i % 360)] * this.getHeight() / 4)), (this.getWidth() / 2) + (derece / 5), (int) ((this.getHeight() / 2) - (degerY[(i % 360)] * this.getHeight() / 4)));
                derece = derece + 1;
                i++;
            }
        } else {

            double[] degerY = l.listedeAraNegatif(derece);
            int a = derece;
            while (derece > -((360 * periyod) - a)) { // 360*2= 720 -(-90) => 810 ==> -810 a kadar gider
                g.drawLine((this.getWidth() / 2) + (derece / 5), (int) ((this.getHeight() / 2) - (degerY[(i % 360)] * this.getHeight() / 4)), (this.getWidth() / 2) + (derece / 5), (int) ((this.getHeight() / 2) - (degerY[(i % 360)] * this.getHeight() / 4)));
                /**
                 * burda ekran genişliği 2 ye bölünüyor ve bu değere derecenin 5 te biri ekleniyor ==> (this.getWidth() / 2) + (derece / 5)
                 * genişlik
                 * 
                 */
                
                derece = derece - 1;
                i++;
            }
        }
    }

}
