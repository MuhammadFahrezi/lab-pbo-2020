
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
    

    public Siswa(int nrpx, String namax)// method constructor 
    {
        nrp = nrpx;
        nama = namax;
    }

    public void setNrp(int nrpx)//method Mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        nrp = nrpx;
    }
    
    public int getNrp()// method Accessor untuk mengembalikan nilai dari Nrp
    {
        return nrp;
    }
    
    public void setNama(String namax)//method Mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        nama = namax;
    }
    
    public String getNama()// method Accessor untuk mengembalikan nilai dari Nama
    {
        return nama;
    }
}
