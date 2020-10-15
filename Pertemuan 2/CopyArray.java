public class CopyArray {
    public static void main(String args[]) {
    int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
    int[] array2 = new int[3];
    System.arraycopy(array1,0,array2,0,3); /*Mengcopy nilai array1 dan array 2 sebanyak 3 kali */
    System.out.print("Array1 : "); /* Menampilkan nilai Array1 */
    for (int i=0; i<array1.length; i++) /*Looping panjang array1 sampai batas array*/
    System.out.print(array1[i] + " "); /* Menampilkan array1 sampai batas i */
    System.out.println(); /*untuk membuat baris baru*/
    System.out.print("Array2 : "); /* Menampilkan nilai array 2 */
    for (int i=0; i<array2.length; i++)  /* Looping panjang array2 sampai batas array */
    System.out.print(array2[i] + " ");  /* Menampilkan array2 sampai batas i */
    }
    }
