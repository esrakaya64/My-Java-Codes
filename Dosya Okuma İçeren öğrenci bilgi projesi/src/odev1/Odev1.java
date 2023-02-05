
package odev1;
/*
Ali Bilge hakkındaki bilgiler ali_bilge.txt adında bir dosyadadır. Dosyanın içeriği aşağıdadır. 
Ali Bilge 
12212121212
Matematik Kış 2008 95 
Bilgisayar Mimarisi Bahar 2007 80 
İşletim Sistemleri Kış 2008 90 
Fizik Bahar 2007 70 
Kimya Kış 2008 70 
Web Servisleri Kış 2008 90 
Bir Ders sınıfı (class) yazınız. Bu sınıfta ad, donem ve not dan oluşan 3 private parametre 
olacaktır. 
Ders sınıfına ek olarak Ogrenci sınıfı yazınız. Bu sınıfın ad, soyAd ve ogrenciNo String private 
parametreleri olsun. Bu parametrelere ek olarak Ogrenci sınıfı Ders sınıfı tipinde 6 
uzunluğunda bir array degiskene sahiptir. 
Bu sınıfların constructor, get ve setlerini yazınız. Ve ali_bilge.txt için testlerini yapınız. Test 
durumlarını siz yaratın. 
En azından şu testler için fonksiyonları oluşturun: Ali Bilge adında öğrenciyi oluşturup ders 
listesini de girdikten sonra Ogrenci sınıfında öğrencinin 
derslerini listeleyen bir fonksiyon yazınız ve bunların testini ekrandan yapınız
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Odev1 {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/Esra Kaya/Desktop/dosya/ali.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Odev1.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<String> lines = new ArrayList<>();
        Ders[] dersler = new Ders[6];
        while(sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        
        for (int i = 0; i < dersler.length; i++) {
            String[] infoLecture = lines.get(i + 2).split(" ");
            dersler[i] = new Ders(infoLecture[0], 
                                  infoLecture[1],
                                  infoLecture[3]);
        }
        Ogrenci ogrenci = new Ogrenci(lines.get(0).split(" ")[0], 
                                      lines.get(0).split(" ")[1], 
                                      lines.get(1), 
                                      dersler); 
   
        System.out.println(ogrenci.getName());
        System.out.println(ogrenci.getStdNo());
        ogrenci.listLessons();
    }
    
}
