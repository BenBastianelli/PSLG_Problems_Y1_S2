package Week07_Problems;

public class Problem2
{
    // Main driver
    public static void main(String[] args)
    {
        Thor thor = new Thor("Mjolnir","God of Thunder!",true);
        Thor loki = new Loki("God of Mischief","Lævateinn");

        thor.title();
        loki.title();
    }
}

class Thor
{
    public String weapon;
    public String title;
    public boolean isReal;

    public Thor(String weapon, String title, boolean isReal)
    {
        this.weapon = weapon;
        this.title = title;
        this.isReal = isReal;
    }

    public void title()
    {
        System.out.println("I am Thor!" + title);
    }
}
class Loki extends Thor
{
    public Loki(String title, String weapon)
    {
        super(weapon,title,false);
    }

    @Override
    public void title()
    {
        System.out.println("HAHAHA GOT YOU");
    }

}
