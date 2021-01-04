
/**
 * Write a description of class Manajer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manajer extends Pegawai {
    private String departemen;
    
    public Manajer(String nama, double gaji, String departemen)// method constructor
    {
        super(nama, gaji);
        this.departemen = departemen;
    }
    
    public void setDepartemen(String departemen)//method mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        this.departemen = departemen;
    }
    
    public String getDepartemen()//method accessor untuk mengembalikan nilai dari Departemen
    {
        return departemen;
    }
}