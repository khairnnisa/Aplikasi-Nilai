/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisteminformasiakademik.model;

/**
 *
 * @author user
 */
public class Mahasiswa extends Person{
    private String nim;
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getNim(){
        return nim;
    }

    @Override
    public void aktivitas(){
        System.out.println("Mengikuti pelajaran dengan baik");
    }
}
