
public class Loader
{
    public static void main(String[] args)
    {
        Cat A = getKitten(1100.00);
        Cat CH = getKitten(1100.00);
        Cat D = getKitten(1100.00);

        System.out.println("Artur " + A.getWeight());
        System.out.println("Chubajs " + CH.getWeight());
        System.out.println("Demon " + D.getWeight());


//        Cat Tishka = new Cat();
//        System.out.println("Tishka " + Tishka.getStatus());
//        Tishka.catColor(Color.WHITE);
//
//        Cat Markiza = new Cat();
//        System.out.println("Markiza " + Markiza.getStatus());
//        Markiza.catColor(Color.BLACK);
//
//        Cat Skull = new Cat();
//        System.out.println("Skull " + Skull.getStatus());
//        Skull.catColor(Color.BROWN);

    }
    private  static Cat getKitten(double weight)
    {
        Cat x = new Cat(1100.00);
        return x;
    }
}