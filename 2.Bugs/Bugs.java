public class Bugs 
{
    public static void main(String[] args)
    {
        int[] prices = {120, 250, 80};
        int count = prices.length;
        int total = 0;
        for (int i = 0 ; i < count ; i++)
        {
            total = total + prices[i];
        }

        String label = "Total ";
        System.out.println(label + total + " , avg " + (total / count));

        if (count == 3)
        {
            System.out.println("Paid: " + (total - total * 10 / 100));
        }

        System.out.println("With tip: " + (total + 50));
    }
}