
/**
 * Write a description of class TesSiswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesSiswa
{
    public static void main(String[] ar)
     {
         Siswa s = new Siswa();
         Siswa ss = new Siswa(8030001, "Upin");
         System.out.println(s.getNrp() + " " + s.getNama());
         System.out.println(ss.getNrp() + " " + ss.getNama());
     }
}