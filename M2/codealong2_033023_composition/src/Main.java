public class Main {
    public static void main(String[] args) {
        Enclosure myEnclosure = new Enclosure(); //new instance = creating it in memory, before it's just a blueprint
        myEnclosure.setName("Turtle Exhibit");
        myEnclosure.setTemperature(31);


        Inhabitat myInhabitat = new Inhabitat();
        myInhabitat.setName("Box Turtle");
        myInhabitat.setFood("Lettuce");
        myInhabitat.setMinTemp(28);
        myInhabitat.setMaxTemp(35);

        myEnclosure.setResident(myInhabitat);
        myEnclosure.getResident().setName("Steve");

        System.out.println("Our enclosure name is " + myEnclosure.getName());
        System.out.println("Our enclosure resident's name is: " + myEnclosure.getResident().getName());


    }
}