
/**
 * Write a description of class Lingkaran here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lingkaran
{
    private double jari_jari;

    public Lingkaran(double jari)//method constructor 
    {
        this.jari_jari = jari; 
    }

    public void setJariJari(double jari)//method Mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        this.jari_jari = jari;
    }
    
    public double getJariJari()// method Accessor untuk mengembalikan nilai dari JariJari
    {
        return jari_jari;
    }
}