package academic.model;

/**
 * 12S23042 Pretty Purba
 * 12S23049 Clarissa Manurung
 */
public class Student {

    private String id; // Menggunakan 'id' untuk konsistensi
    private String name; // Menggunakan 'name' untuk konsistensi
    private int year; // Menggunakan 'year' untuk konsistensi
    private String program; // Menggunakan 'program' untuk konsistensi

    // Constructor
    public Student(String id, String name, int year, String program) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.program = program;
    }

    // Accessor (getter methods)
    public String getId() {
        return id; // Mengembalikan ID mahasiswa
    }

    public String getName() {
        return name; // Mengembalikan nama mahasiswa
    }

    public int getYear() {
        return year; // Mengembalikan tahun angkatan
    }

    public String getProgram() {
        return program; // Mengembalikan program studi
    }

    // Mutator (setter methods)
    public void setId(String id) {
        this.id = id; // Mengatur ID mahasiswa
    }

    public void setName(String name) {
        this.name = name; // Mengatur nama mahasiswa
    }

    public void setYear(int year) {
        this.year = year; // Mengatur tahun angkatan
    }

    public void setProgram(String program) {
        this.program = program; // Mengatur program studi
    }

    // Method to display student information
    public void showStudent() {
        System.out.println(id + "|" + name + "|" + year + "|" + program);
    }
}