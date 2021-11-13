import javax.swing.JOptionPane;

public class NilaiTester {
    public static void main(String[] args){
        String quis, uts, uas;
        Nilai n = new Nilai();

        quis = JOptionPane.showInputDialog("Masukkan Nilai Quis : ");
        double nQuis = Double.parseDouble(quis);

        uts = JOptionPane.showInputDialog("Masukkan Nilai UTS : ");
        double nUts = Double.parseDouble(uts);

        uas = JOptionPane.showInputDialog("Masukkan nilai UAS : ");
        double nUas = Double.parseDouble(uas);

        n.setQuis(nQuis);
        n.setUTS(nUts);
        n.setUAS(nUas);

        System.out.println("Quis             : " + n.Quis);
        System.out.println("UTS              : " + n.UTS);
        System.out.println("UAS              : " + n.UAS);
        System.out.println("Nilai Akhir      : " + n.getNa());
        System.out.println("Index            : " + n.getIndex());
        System.out.println("Keterangan       : " + n.getKeterangan());

    }
}
