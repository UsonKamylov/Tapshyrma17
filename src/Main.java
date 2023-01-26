public class Main {
    public static void main(String[] args) {

       Cow [] cow1= new Cow[] {new Cow(125.5,3,"Buka","Malla"),
        new Cow(115.5,7,"jen","Kara"),
        new Cow(127.5,2,"Buka","Ala"),
        new Cow(135.5,5,"Jen","Konur"),
       new Cow(105.5,6,"Buka","Kashka")};
       Sheep[] sheep1=new Sheep[]{new Sheep(50.5,2,"","Koi"),
        new Sheep(45.5,3,"","Koi"),
        new Sheep(50.4,4,"","Koi")};


        Horse[] horse1=new  Horse[]{new Horse(200,5,"Kara","Aigyr","Jerde kashka"),
         new Horse(205,6,"Kara","Baital","Toru")};


        Farm farm1=new Farm("ul streleskaya","Asan",cow1,sheep1,horse1);
        System.out.println(farm1.toString());


        Cow cow = new Cow(115, 4, "Buka", "Karaa ala");
        Sheep sheep = new Sheep(55, 3, "kochkor", "kok kara");
        Horse horse = new Horse(167,4, "Black", "jen", "Jerde");
        Farm2 farm2 = new Farm2("ул. Pushkina", cow, horse, sheep, "Bakyt");
        System.out.println(farm2.toString());

    }

}






