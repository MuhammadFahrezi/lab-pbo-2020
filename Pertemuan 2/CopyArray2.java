public class CopyArray2 {
    public static void main(String args[]) {
    String str1 = "Pemrograman";
    String str2 = "Java";       /* Input data string */
    String str3 = "PemrogramanJava";
    System.out.println("String 1:"+str1); /* Menampilkan string1 dan seterusnya */
    System.out.println("String 2:"+str2);
    System.out.println("String 3:"+str3);
    System.out.println("String 1 = String 3 ==>"+str1.equals(str3)); /* Membandingkan string 1 dengan string 3 karena tidak sama maka false */
    System.out.println("String 2 = String 3 ==>"+str2.equals(str3));    /* Membandingkan string 2 dengan string 3 karena tidak sama maka false */
    System.out.println("String 1 + String 2 = String 3 ==>"+(str1+str2).equals(str3)); /* Membandingkan string 1 dan string 2 dengan string 3 karena sama maka true */
    String str4 = "Universitas Syiah Kuala"; /* Input data string */
    String str5 = "universitas syiah kuala";
    System.out.println("String 4:"+str4); /* Menampilkan string 4 dan seterusnya */
    System.out.println("String 5:"+str5);
    System.out.println("Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil");
    System.out.println("String 4 = String 5 ==> " +str4.equalsIgnoreCase(str5));
    System.out.println("String 4 + String 5 = String 5 + String4 ==> "
    +(str4+str5).equalsIgnoreCase(str5+str4));
    }
    }

    /*
    System.out.println("String 4 = String 5 ==> " +str4.equalsIgnoreCase(str5));
    Membandingkan string 4 dengan string 5 jika mengabaikan huruf besar dengan huruf kecil maka true

    System.out.println("String 4 + String 5 = String 5 + String4 ==> "
    Membandingkan string 4 dan string 5, string 5 dan string 4 jika mengabaikan huruf besar dengan huruf kecil maka true
    */