public class Break
{
public static void main(String arg[])
{
for (int i=0; i<10; i++)
{
for (int j=0; j<i+1; j++)
{
if(j==5)
break;
System.out.print('*');
}
System.out.println();
}
}
}

/*
Perulangan menggunakan operator if jika nilai j sama dengan 5 maka program akan break sampai looping pertama menampilkan * 
yang dihasilkan sesuai j
contohnya :
*
**
***
****
*****
*****
*****
*****
*****
*****
*/