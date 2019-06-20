public class Spider extends Animal {

    private boolean hasWeb = false;

    public Spider() {
        //super();
        System.out.println("A spider is hatched...along with many others!");
    }


    @Override
    public String sleep() {
        return "A spider kinda just sits there.";
    }

    @Override
    public String eat() {
        if (hasWeb) {
            return "A spider captured a bug!";
        } else {
            return "A spider cannot eat without a web!";
        }
    }


    public String web() {
        // Spiders need a web to catch prey
        hasWeb = true;
        return "A spider creates a web!";
    }
}
