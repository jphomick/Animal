public class Snake extends Animal {
    public Snake() {
        //super();
        System.out.println("A snake is hatched...");
    }


    @Override
    public String sleep() {
        return "A snake curls up in a tree.";
    }

    @Override
    public String eat() {
        return "A snake eats after poisoning its prey!";
    }


    public String sense() {
        //Snakes sense the air with their tongue
        return "A snake senses the air around it. Is something there?";
    }
}
