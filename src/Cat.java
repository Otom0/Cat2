public class Cat {
    //private   String Demon;
    private double originWeight;
    private double weight;
    public static final int EYE_COUNT = 2;
    public static final double MIN_WEIGHT = 1000;
    public static final double MAX_WEIGHT = 9000;
    public String name;
    private double minWeight;
    private double maxWeight;

    public String color;


    {

    }

//    public void catColor()
//    {
//
//        Color catColor = Color.BLACK;
//        System.out.println(catColor);
//    }

    public void setColor(Color color) {
        this.color = String.valueOf(color);
    }

    public String getColor() {
        return color;
    }




    public Cat(String name, double weight)
    {
        this.name = name;
        this.weight = weight;
        weight = 500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
    }
    public Cat(Cat cat){
        this(cat.name,cat.weight);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight()
    {
        return weight;
    }

    public  void  setWeight(double weight)
    {
        this.weight = weight;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

//    public Double getWeight()
//    {
//        return weight;
//    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
    public void  catColor(Color catColor){
        System.out.println(catColor.toString());
    }
}