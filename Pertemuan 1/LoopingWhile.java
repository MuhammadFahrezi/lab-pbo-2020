public class LoopingWhile
{
public static void main(String arg[])
{
int i=0;
while (i<10)
{
int j=0;
while (j<i+1)
{
System.out.print('*');
j++;
}
System.out.println();
i++;
}
}
}

/*
Menggunakan operator while untuk melakukan perulangan

while (i<10) 
melakukan perulangan sampai batas while terpenuhi atau kurang dari 11
*/