
/**
 * Write a description of class TicketMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicketMachine
{
    private int price;
    private int balance;
    private int total;

    public TicketMachine(int ticketCost)//method constructor
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
    }

    public int getPrice()// method Accessor untuk mengembalikan nilai dari Price
    {
        return price;
    }

    public int getBalance()// method Accessor untuk mengembalikan nilai dari Balance
    {
        return balance;
    }

    /*method ini terdapat parameter dan kondisi amount > 0 serta operasi aritmatika*/
    public void insertMoney(int amount)//terdapat parameter, kondisi amount > 0 dan operasi aritmatika
    {
        if(amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("masukkan uang bernilai positif : "+amount);
        }
    }

    public void printTicket()//terdapat kondisi balanca >= price sisa > 0 dan operasi aritmatika
    {
        if(balance >= price){
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            total = total + price;
            balance = balance - price;
            
            int sisa = this.refundBalance();
            if(sisa > 0)
                System.out.println("Uang kembalian : "+sisa);
        }
        else {
            System.out.println("Uang anda kurang, silahkan masukkan : "+(price - balance) + " cents lagi.");
        }
    }
    
    public int refundBalance()// method Accessor untuk mengembalikan nilai dari refundBalance
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
