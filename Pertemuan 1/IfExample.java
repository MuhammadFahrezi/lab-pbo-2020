import java.util.Scanner;
public class IfExample {
public static void main(String[] args) {
int age=0;
Scanner sc = new Scanner(System.in);
System.out.println("Masukkan umur anda:");
age = sc.nextInt();
if(age>=17)
System.out.print("Anda sudah boleh buat KTP");
 }
}

/*
Jika umur lebih dari 17 maka program akan mengprint Anda sudah boleh buat KTP
Jika umur kurang dari 16 maka program tidak mengprint atau program selesai
*/