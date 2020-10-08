public class Assignment {
    public static void main(String args[]) {
    int a = 10;
    int b = 20;
    int c = 0;
  
    c = a + b;
    System.out.println("c = a + b = " + c );
    c += a ;
    System.out.println("c += a = " + c );
    c -= a ;
    System.out.println("c -= a = " + c );
    c *= a ;
    System.out.println("c *= a = " + c );
    a = 10;
    c = 15;
    c /= a ;
    System.out.println("c /= a = " + c );
    a = 10;
    c = 15;
    c %= a ;
    System.out.println("c %= a = " + c );
    c <<= 2 ;
    System.out.println("c <<= 2 = " + c );
    c >>= 2 ;
    System.out.println("c >>= 2 = " + c );
    c >>= 2 ;
    System.out.println("c >>= 2 = " + c );
    c &= a ;
    System.out.println("c &= a = " + c );
    c ^= a ;
    System.out.println("c ^= a = " + c );
    c |= a ;
    System.out.println("c |= a = " + c );
    }
   }

/*
1. c = a + b (Nilai a ditambah nilai b maka hasilnya menjadi nilai c = 30)
2. c += a (Nilai c = 30, maka c + a = 40)
3. c -= a (Nilai c = 40, maka c - a = 30)
4. c *= a (Nilai c = 30, maka c * a =300)
5. c /= a (c / a = 15 / 10 = 1)
6. c %= a (c % a = 15 % 10 = 5)
7. c <<= 2 (operasi shift kiri pada angka biner maka c = c << 2 = 5 << 2 = 20)
8. c >>= 2 (operasi shift kanan pada angka biner maka c = c >> 2 = 20 >> 2 = 5)
9. c >>= 2 (operasi shift kanan pada angka biner maka c = c >> 2 = 5 >> 2 = 1)
10. c&= a (operasi AND pada angka biner maka c = c & a = 1 & 10 = 0)
11. c ^= a (operasi XOR pada angka biner maka c = c ^ a = 0 ^ 10 = 10)
12. c |= a (operasi OR pada angka biner maka c = c | a = 10 | 10 = 10)
*/