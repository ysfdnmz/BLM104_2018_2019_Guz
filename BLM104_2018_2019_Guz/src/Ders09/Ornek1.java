/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/*
Exception'lar istenmeyen durumlardır. Exception oluşturabilecek durumlar muhakkak try catch bloğuna alınmalıdır.
*/

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        int i;
        //Eğer try bloğu dışında bir Exception oluşursa bu durum yakalanamaz.
        try {
          // burada try bloğu içine alınan herhangi bir satırda Exception olması durumunda Exception catch bloğunda yakalanacaktır.
            i=5/0; // Exception burada oluşuyor.
            System.out.println("Ba?ar?l?");
        } catch (Exception e) {
            System.out.println("Hata var");
        }finally{
            System.out.println("Bitti");
        }

    }
}
