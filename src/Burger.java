public class Burger {
    private String bread;
    private String meat;
    private String cheese;
    private String mayo;

    public Burger(String bread, String meat, String cheese, String mayo) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.mayo = mayo;
        System.out.println("You buy the ordinary burger with " + bread + ", " + meat + " meat, " + cheese + " and " + mayo + "!");
    }

    public Burger(String bread, String meat, String cheese) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        System.out.println("You buy the diet burger with " + bread + ", " + meat + " meat, " + cheese + "!");
    }

    public Burger(String bread, String meat, String addedMeat, String cheese, String mayo) {
        this.bread = bread;
        this.cheese = cheese;
        this.mayo = mayo;
        this.meat = meat;
        this.meat = addedMeat;
        System.out.println("You buy the double meat burger with " + bread + ", " + meat + " mixed with " + addedMeat + ", " + cheese + " and " + mayo + "!");
    }

}
