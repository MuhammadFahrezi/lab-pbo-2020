public class Smallest
{
public static void main(String arg[])
{
int a, b;
Mulai:
for(a=0; a<2; a++)
{
for(b=0; b<3; b++)
{
if(b==2)
break Mulai;
System.out.println("a=" + a + " ; b=" + b);
}
}
}
} 

/*
for(a=0; a<2; a++) Looping pertama
for(b=0; b<3; b++) Looping kedua
Jika b sama dengan 2 maka break akan menghentikan operasi sesuai dengan looping
*/