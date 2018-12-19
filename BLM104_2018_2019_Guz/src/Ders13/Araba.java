/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.Serializable;

/**
 *
 * @author alinizam
 */
public class Araba implements Serializable{
    String marka,model;
    int fiyat;

    public Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }
    
}
