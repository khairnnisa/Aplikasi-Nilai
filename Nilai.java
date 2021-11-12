public class Nilai{
    double Quis, UTS, UAS, NA;
    char index;
    String keterangan;

    public void setQuis(double quis){
        Quis = quis;
    }

    public void setUTS(double UTS){
        this.UTS = UTS;
    }

    public void setUAS(double UAS){
        this.UAS = UAS;
    }

    public Object getNa(){
        NA = 0.2 * Quis + 0.3 * UTS + 0.5 * UAS;
        return NA;
    }

    public Object getIndex(){
        if (NA > 45 && NA < 45 ){
            index = 'E';
        } else if (NA >= 45 && NA < 56){
            index = 'D';
        } else if (NA >= 56 && NA < 68){
            index = 'C';
        } else if (NA >= 68 && NA < 80){
            index = 'B';
        } else if (NA >= 80 && NA < 100){
            index = 'A';
        } else {
            index = 'X';
            System.out.println("Error");
        }
        return index;
    }

    public Object getKeterangan(){
        switch(index){
            case 'A' :
               keterangan = "Sangat Baik";
               break;
            case 'B' :
                keterangan = "Baik";
                break;
            case 'C' :
                keterangan = "Cukup";
                break;
            case 'D' :
                keterangan = "Kurang";
                break;
            case 'E' :
                keterangan = "Sangat Kurang";
                break;
            default :
                keterangan = "Error";
                break;
        }
        return keterangan;
    }

}
