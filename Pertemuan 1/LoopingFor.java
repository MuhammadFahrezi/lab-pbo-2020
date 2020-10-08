public class LoopingFor
{
public static void main(String arg[])
{
for (int i=0; i<10; i++)
{
for (int j=0; j<i+1; j++)
System.out.print('*');
System.out.println();
}
}
}

/*
for (int i=0; i<10; i++) untuk looping pertama
for (int j=0; j<i+1; j++) untuk looping kedua atau looping didalam looping, akan menampilkan *
nilai j sampai batas nilai j terpenuhi
*/