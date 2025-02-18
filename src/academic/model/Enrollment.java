package academic.model;

/**
    * 12S23042 Pretty Purba
    * 12S23049 Clarissa Manurung
 */
public class Enrollment {

    private String nim;
    private String kodematkul;
    private String tahunajaran;
    private String status;
    private String tambahan;
    public Enrollment(String nim, String kodematkul, String tahunajaran, String status){
        this.nim = nim;
        this.kodematkul = kodematkul;
        this.tahunajaran = tahunajaran;
        this.status = status;
        
    }

    public String getnim(){
        return nim;
    }
    public String getkodematkul(){
        return kodematkul;
    }
    public String gettahunajaran(){
        return tahunajaran;
    }
    public String getstatus(){
        return status;
    }
    public String gettambahan(){
        return tambahan;
    }
    
    public void setnim(String nim){
        this.nim = nim;
    }
    public void setkodematkul(String kodematkul){
        this.kodematkul = kodematkul;
    }
    public void settahunajaran(String tahunajaran){
        this.tahunajaran = tahunajaran;
    }
    public void setstatus(String status){
        this.status = status;
    }
    public void settambahan(String tambahan){
        this.tambahan = tambahan;
    }


}