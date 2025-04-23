package Week07_Problems;


public class Problem3
{
    // Main driver
    public static void main(String[] args)
    {
        Item soda = new Item("Coke",2.70,30);
        Item chickenRoll = new ChickeyRoll("Chicken Roll",5.95,30);
        Item soldOut = new SoldOutItem("Monster",3.20);

        soda.purchase();
        chickenRoll.purchase();
        soldOut.purchase();

    }
}

class Item
{
    String name;
    double price;
    int quantity = 0;

    Item(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void purchase()
    {
        if (quantity <= 0)
        {
            System.out.println("Sold out!");
        }
        else
        {
            System.out.println("You purchased " + name + " with price " + price + " and quantity " + quantity);
            quantity--;
        }
    }
}

class ChickeyRoll extends Item
{
    ChickeyRoll(String name, double price, int quantity)
    {
        super(name, price, quantity);
    }

    @Override
    public void purchase()
    {
        System.out.println("Chickey rolled! You purchased " + name + " with price " + price );
    }
}

class SoldOutItem extends Item
{
    SoldOutItem(String name, double price)
    {
        super(name, price, 0);
    }

    @Override
    public void purchase(){
        System.out.println("Sold out!");
    }
}
