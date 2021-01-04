
/**
 * Write a description of class Line here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Line
{
    private Point begin;
    private Point end;
    
    public Line(int x1, int y1, int x2, int y2)//method constructor
     {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
     }
    
    public Line(Point begin, Point end)
    {
        this.begin = begin;
        this.end = end;
    }
    
    public Point getBegin()//method accessor untuk mengembalikan nilai dari Begin
    { 
        return begin;
    }
    
    public void setBegin(Point begin)//method mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        this.begin = begin;
    }
    
    public Point getEnd()//method accessor untuk mengembalikan nilai dari End
    {
        return end;
    }
    
    public void setEnd(Point end)//method mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        this.end = end;
    }
}
