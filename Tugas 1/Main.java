/**
 * Nama : Muhammad Fahrezi
 * NIM  : 1908107010081
 */

import java.util.Scanner;

public class Main {   
    private static Scanner input;
    private boolean main;
    private int menu;

    public Main() {
        this.main = true;
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        new Main().mainkan();
    }

    public void mainkan(){     
        Bus b1 = new Bus();      
        System.out.println("====== BUS TRANS KOETARADJA ======");

    while(main){
        System.out.println("\nMENU : ");
        System.out.println("1. Naikkan Penumpang");
        System.out.println("2. Turunkan Penumpang");
        System.out.println("3. Lihat Penumpang");
        System.out.print("\nPilihan : ");
        menu = input.nextInt();
  
            if (menu == 1) {         
                 System.out.print("\nNama : ");
                 String nama = input.next(); 
                 System.out.print("Umur : ");
                 int umur = input.nextInt();
                 System.out.print("Hamil (y/n) : "); 
                 Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y")?true:false;
           
                 System.out.println("\n<===============================>"); 
                 Penumpang penumpang = new Penumpang(nama, umur, hamil);                
                 b1.naikPenumpang(penumpang);
                 b1.toString();
                 b1.getJumlahPenumpangBiasa();
                 b1.getJumlahPenumpangPrioritas();
                 b1.getJumlahSemuaPenumpang();

            }else if (menu == 2){ 
                System.out.print("\nNama : ");
                String nama = input.next();
                b1.turunkanPenumpang(nama);
                b1.toString();
                System.out.println("<===============================>");
                main = true;
            }else if (menu == 3){ 
                b1.toString(); 
                System.out.println("<===============================>");
                System.out.println("");
                main = true;
            }else if (menu == 4){ 
                System.exit(0);
            }else{
                System.out.println("Pilihan Salah!");
            }
        }  
    }
}