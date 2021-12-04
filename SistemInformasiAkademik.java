/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisteminformasiakademik;


import sisteminformasiakademik.model.Nilai;
import sisteminformasiakademik.model.Mahasiswa;

/**
 *
 * @author kel8
 */
public class SistemInformasiAkademik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t = new Thread(SistemInformasiAkademik::printText);
        t.start();

        Mahasiswa m = new Mahasiswa ();
        m.setNim("123456");
        m.setNama("Nisa");
        m.setJenisKelamin("P");

        System.out.println("Nim              : " +m.getNim());
        System.out.println("Nama             : " +m.getNama());
        System.out.println("Jenis Kelamin    : " +m.getJenisKelamin());

        Nilai n = new Nilai ();
        n.setQuis(70);
        n.setUTS(80);
        n.setUAS(100);

        System.out.println("Quis             : " + n.Quis);
        System.out.println("UTS              : " + n.UTS);
        System.out.println("UAS              : " + n.UAS);
        System.out.println("Nilai Akhir      : " + n.getNa());
        System.out.println("Index            : " + n.getIndex());
        System.out.println("Keterangan       : " + n.getKeterangan());
        m.aktivitas();
    }

    public static void printText(){
        System.out.println("SISTEM INFORMASI AKADEMIK");
    }
    
}
