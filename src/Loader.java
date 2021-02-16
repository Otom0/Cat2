
public class Loader
{
    public static void main(String[] args)
    {
        Cat Tishka = new Cat();
        System.out.println("Tishka " + Tishka.getStatus());
        Tishka.catColor(Color.WHITE);

        Cat Markiza = new Cat();
        System.out.println("Markiza " + Markiza.getStatus());
        Markiza.catColor(Color.BLACK);

        Cat Skull = new Cat();
        System.out.println("Skull " + Skull.getStatus());
        Skull.catColor(Color.BROWN);

    }
}