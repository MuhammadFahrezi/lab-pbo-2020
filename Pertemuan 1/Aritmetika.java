public class Aritmetika {
    public static void main(String args[]) {
    int a = 10;
    int b = 20;
    int c = 25;
    int d = 25;
    System.out.println("a + b = " + (a + b) );
    System.out.println("a - b = " + (a - b) );
    System.out.println("a * b = " + (a * b) );
    System.out.println("b / a = " + (b / a) );
    System.out.println("b % a = " + (b % a) );
    System.out.println("c % a = " + (c % a) );
    System.out.println("a++ = " + (a++) );
    System.out.println("b-- = " + (a--) );
    // Check the difference in d++ and ++d
    System.out.println("d++ = " + (d++) );
    System.out.println("++d = " + (++d) );
    }
   }

   /*
   1. a + b = (Deklarasi nilai a ditambah dengan nilai b maka hasilnya 30)
   2. a - b = (Deklarasi nilai a dikurang dengan nilai b maka hasilnya -10)
   3. a * b = (Deklarasi nilai a dikali dengan nilai b maka hasilnya 200)
   4. b / a = (Deklarasi nilai b dibagi dengan nilai a maka hasilnya 2)
   5. b % a = (Deklarasi nilai b dimodulo dengan nilai a maka sisa baginya 0)
   6. c % a = (Deklarasi nilai c dimodulo dengan nilai a maka sisa baginya 5)
   7. a++ = (nilai a = 10, proses ini increment akan ditambah 1 menjadi 11)
   8. b-- = ( nilai b = 20, proses ini decrement akan dikurang 1 menjadi 19)
   9. d++ = (nilai d = 25, proses ini increment akan ditambah 1 menjadi 26)
   10. ++d = (sebelumnya nilai d telah mendapatkan postincrement menjadi 26, namun proses ini pre-increment maka akan ditambah 1 menjadi 27)
   */