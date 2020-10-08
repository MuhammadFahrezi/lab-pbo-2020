public class Bitwise {
    public static void main(String args[]) {
    int a = 60; /* 60 = 0011 1100 */
    int b = 13; /* 13 = 0000 1101 */
    int c = 0;
   
    c = a & b; /* 12 = 0000 1100 */
    System.out.println("a & b = " + c );
    c = a | b; /* 61 = 0011 1101 */
    System.out.println("a | b = " + c );
    c = a ^ b; /* 49 = 0011 0001 */
    System.out.println("a ^ b = " + c );
    c = ~a; /*-61 = 1100 0011 */
    System.out.println("~a = " + c );
    c = a << 2; /* 240 = 1111 0000 */
    System.out.println("a << 2 = " + c );
    c = a >> 2; /* 15 = 1111 */
    System.out.println("a >> 2 = " + c );
    c = a >>> 2; /* 15 = 0000 1111 */
    System.out.println("a >>> 2 = " + c );
    }
   }
   
   /*
   1. c = a & b (Menggunakan operator AND dari nilai a = 60 nilai b = 13, maka disimpan pada nilai c = 12)
   2. c = a | b (Menggunakan operator OR dari nilai a = 60 nilai b = 13, maka disimpan pada nilai c = 61)
   3. c = a ^ b (Menggunakan operator XOR dari nilai a = 60 nilai b = 13, maka disimpan pada nilai c = 49)
   4. c = ~a (Menggunakan operator COMPIMENT dari nilai ~a = -1, maka disimpan pada nilai c = -61)
   5. c = a << 2 (Menggunakan operator shift kiri dari nilai a = 60, maka disimpan pada nilai c = 240)
   6. c = a >> 2 (Menggunakan operator shift kanan dari nilai a = 60. maka disimpan pada nilai c = 15)
   7. c = a >>> 2 (Menggunakan operator shift kanan dari nilai a = 60, maka disimpan pada nilai c = 15)
   */