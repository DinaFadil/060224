package SoalanTest;

class Message{
    public static void main(String[] args) {
        System.err.println("Welcome " + args[0] + "!");
        //System.err.println("Welcome " + args[0] + " " + args[1] + "!");
    }
}

public class Guest {
    public static void main(String[] args) {
        Message.main(args);
    }
}

/*class lol{
    public static void main(String[] args) {
        System.err.println("Welcome " + args[1] + "!");
        //System.err.println("Welcome " + args[0] + " " + args[1] + "!");
    }
}

public class Guest {
    public static void main(String[] args) {
        Message.main(args);
        lol.main(args);
    }
}*/
