public class Logika {
    public static void main(String args[]) {
    boolean a = true;
    boolean b = false;
    System.out.println("a && b = " + (a&&b));
    System.out.println("a || b = " + (a||b) );
    System.out.println("!(a && b) = " + !(a && b));
    }
   }
   /*
   1. a && b (Karena menggunakan operator AND jika keduanya True maka True, jika salah satunya False maka False)
   2. a || b (Karena menggunakan operator OR jika salah satunya True maka True)
   3. !(a && b) (Karena menggunakan membalikkan nilai jika nilai False maka True)
   */