package academic.model;

/**
 * 12S23042 Pretty Purba
 * 12S23049 Clarissa Manurung
 */
public class Student {

    private String nim;
    private String nama;
    private int angkatan;
    private String prodi;
    public Student(String nim, String nama, int angkatan, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.angkatan = angkatan;
        this.prodi = prodi;
    }

    public String getnim(){
        return nim;
    }
    public String getnama(){
        return nama;
    }
    public int getangkatan(){
        return angkatan;
    }
    public String getprodi(){
        return prodi;
    }

    public void setnim(String nim){
        this.nim = nim;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setangkatan(int angkatan){
        this.angkatan = angkatan;
    }
    public void setprodi(String prodi){
        this.prodi = prodi;
    }
    
 
 }