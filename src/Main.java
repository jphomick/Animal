public class Main {

    public static void main(String[] args) {

        // Basic animal is created. We do not know what animal it is, but all animals eat and sleep
        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        // A cat can additionally purr
        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());

        // A bird can additionally fly
        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        // A spider can make a web
        Spider sp = new Spider();
        // A spider cannot catch a bug without a web!
        print(sp.eat());
        print(sp.sleep());
        print(sp.web());
        print(sp.eat());

        // A snake can sense the air with a tongue
        Snake sn = new Snake();
        print(sn.eat());
        print(sn.sleep());
        print(sn.sense());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
