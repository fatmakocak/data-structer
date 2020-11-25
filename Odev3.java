/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev3;

import java.util.Scanner;

/**
 *
 * @author ckadir
 */
public class Odev3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stackList s = new stackList();
        Scanner k = new Scanner(System.in);
        String text;
        boolean stat = true;
        
        
        System.out.println("+ - * / ? ! ");
        while(stat){
            
            System.out.println("Deger Giriniz");
            text= k.next();
            switch (text){
                    case "+":
                        System.out.println("Toplama işlemi yapılıdı ");
                        s.add((s.remove() + s.remove()));
                        break;
                    case "-":
                        System.out.println("Çıkarma işlemi yapılıdı ");
                        s.add((s.remove() - s.remove()));
                        break;
                    case "*":
                        System.out.println("Çarpma işlemi yapılıdı ");
                        s.add((s.remove() * s.remove()));
                        break;
                    case "/":
                        System.out.println("Bölme işlemi yapılıdı ");
                        s.add((s.remove() / s.remove()));
                        break;
                    case "?":
                        System.out.println("Değerler Listeleniyor ");
                        s.list();
                        break;
                    case "!":
                        System.out.println("Çıkış Yapılıyor ");
                        stat = false;
                        break;
                    default:
                        System.out.println("Değer Eklendi ");
                        s.add(Integer.parseInt(text));
                        
            }
        }
    }
}
