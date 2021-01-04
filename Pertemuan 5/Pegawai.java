
/**
 * Write a description of class Pegawai here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pegawai {
    private String nama;
    private double gaji;
    
    public Pegawai(String nama, double gaji)//method constructor
    {
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public void setNama(String nama)//method mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        this.nama = nama;
    }
    
    public String getNama()//method accessor untuk mengembalikan nilai dari Nama
    {
        return nama;
    }
    
    public void setGaji(double gaji)//method mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        this.gaji = gaji;
    }
    
    public double getGaji()//method accessor untuk mengembalikan nilai dari Gaji
    {
        return gaji;
    }
}

