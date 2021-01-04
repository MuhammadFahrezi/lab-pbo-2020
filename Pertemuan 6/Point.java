
/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point
{
    // instance variables - replace the example below with your own
    private int x;
     private int y;
    
     public Point()//method constructor
     {
         x = 0;
         y = 0;
     }
    
     public Point(int x, int y)
     {
         this.x = x;
         this.y = y;
     }
    
     public int getX()//method accessor untuk mengembalikan nilai dari X
     {
         return this.x;
     }
    
     public void setX(int x)//method mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
     {
         this.x = x;
     }
    
     /* method Accessor ini yang digunakan untuk mengembalikan
     nilai dari y*/
     public int getY()//method accessor untuk mengembalikan nilai dari Y
     {
         return this.y;
     }
    
     public void sety(int y)//method mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
     {
         this.y = y;
     }
    
     public String toString()//untuk menampilkan titik X dan Y
     {
         return "Titik dengan x=" +x+ " y=" +y ;
     }
}
