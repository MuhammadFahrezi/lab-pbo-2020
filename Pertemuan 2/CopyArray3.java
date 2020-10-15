public class CopyArray3 {
    public static void main(String args[]) {
    String str1 = "Informatika Universitas Syiah Kuala";
    System.out.println(str1.startsWith("Inf")); /* Karena diawali dengan "inf" maka true */
    System.out.println(str1.endsWith("kuala")); /* Karena diakhiri dengan "Kuala (K kapital)" maka false */
    System.out.println(str1.startsWith("Inf",1)); /* Karena diawali dengan "nfo" maka false */
    System.out.println(str1.startsWith("Inf",2)); /* Karena diawali dengan "for" maka false */
    System.out.println(str1.startsWith("Inf",3)); /* Karena diawali dengan "orm" maka false */
    }
    }