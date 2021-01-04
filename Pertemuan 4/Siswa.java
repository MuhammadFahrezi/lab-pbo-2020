
/**
 * Write a description of class Siswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Siswa
{
    private int nrp;
    private String nama;
    
     public Siswa()//method constructor
     {
         this.nrp = 12345;
         this.nama = "nama default";
     }
    
     public Siswa(int nrp, String nama)
     {
         this.nrp = nrp;
         this.nama = nama;
     }
    
     public void setNrp(int nrp)//method mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
     {
         this.nrp = nrp;
     }
    
     public int getNrp()//method accessor untuk mengembalikan nilai dari Nrp
     {
         return this.nrp;
     }
    
     public void setNama(String nama)//method mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
     {
         this.nama = nama;
     }
    
     public String getNama()//method accessor untuk mengembalikan nilai dari Nama
     {
         return this.nama;
     }
}
