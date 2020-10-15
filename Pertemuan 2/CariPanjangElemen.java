public class CariPanjangElemen {
    public static void main(String args[]) {
    int x[][][][]=new int[2][][][];
    x[0]=new int[1][][];
    x[0][0]=new int[2][];
    x[0][0][0]=new int[3];
    x[0][0][1]=new int[2];
    x[1]=new int[2][][];        /* Nilai Array */
    x[1][0]=new int[1][];
    x[1][0][0]=new int[2];
    x[1][1]=new int[2][];
    x[1][1][0]=new int[1];
    x[1][1][1]=new int[3];
    System.out.println(x.length);
    System.out.println(x[0].length);
    System.out.println(x[0][0].length);       /* Menampilkan panjang Array */
    System.out.println(x[0][0][0].length);
    System.out.println(x[0][0][1].length);
    System.out.println();                  /* Menampilkan void */
    System.out.println(x[1].length);
    System.out.println(x[1][0].length);
    System.out.println(x[1][0][0].length);
    System.out.println(x[1][1].length);        /* Menampilkan panjang Array */
    System.out.println(x[1][1][0].length);
    System.out.println(x[1][1][1].length);
    }
    }