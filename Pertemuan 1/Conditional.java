public class Conditional {
    public static void main(String args[]) {
    int a, b;
    a = 10;
    b = (a == 1) ? 20: 30;
    System.out.println( "Value of b is : " + b );
    b = (a == 10) ? 20: 30;
    System.out.println( "Value of b is : " + b );
    }
   }

   /*
   True = Kiri
   False = Kanan

   1. (a == 1) (Nilai a = 10 maka False, karena False maka di ambil nilai sebelah kanan = 30)
   2. (a == 10) (Nilai a = 10 maka True, karena True maka di ambil nilai sebelah kiri = 20)
   */