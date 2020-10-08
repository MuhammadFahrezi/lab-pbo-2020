public class Continue{
	public static void main(String arg[]){
		for (int i=0; i<10; i++){
			for (int j=0; j<i+1; j++){
			    if(j==5)
                continue;
                
			    System.out.print('*');
			}
			System.out.println();
		}
    }
}

/*
Menggunakan operator if jika nilai j sama dengan 5 maka program akan dimulai dari 5 dan continue
sampai batas yg ditentukan 
contoh i<10 maka :
*
***
****
*****
***** 
****** ini looping pertama dan dilanjutkan output tambahan
*******
********
*********
*/