
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    
    public Book(String bookAuthor, String bookTitle, int pages, String refNumber)//method constructor
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 0;
        refNumber = ("");
    }
    
    public String getAuthor()//method accessor untuk mengembalikan nilai dari author
    {
        return author;
    }
    
    public String getTitle()//method accessor untuk mengembalikan nilai dari title
    {
        return title;
    }
    
    
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public int getPages()//method accessor untuk mengembalikan nilai dari pages
    {
        return pages;
    }
    
    public void printDetails()
    {
        System.out.println(author);
        System.out.println(title);
        System.out.println(pages);
        if(refNumber == ("")) {
            System.out.println("zzz");
        }
        else {
            System.out.println(refNumber);
        }
    }
    
    public void setRefNumber(String ref)//method mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        refNumber = ref;
    }
}
