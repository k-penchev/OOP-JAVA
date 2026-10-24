class Ticket
{
    private int price = 10;
    static int sold = 0;
    
    Ticket() {}
    
    Ticket(int prc)
    {
        price = prc;
    }
    
    public int price()
    {
        return price;
    }

    public void setPrice(int newp)
    {
        price = newp;
    }

    void sell()
    {
        sold = sold + 1;
    }

    public static Ticket clone(Ticket oth)
    {
        return new Ticket(oth.price);
    }
}

public class Fix
{
    public static void main(String[] args)
    {
        int[] a = {1, 2};
        int[] b = a;
        b[0] = 9;
        Ticket t = new Ticket();
        Ticket u = Ticket.clone(t);
        t.setPrice(12);
        t.sell();
        System.out.println(a[0] + " " + a[1]);
        System.out.println(Ticket.sold + " " + u.price());
    }
}