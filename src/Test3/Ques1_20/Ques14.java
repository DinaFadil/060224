package Test3.Ques1_20;

interface Blogger {
    default void blog() throws Exception{
        System.out.println("GENERIC");
    }
}

class TravelBlogger implements Blogger {
    public void blog(){
        System.out.println("TRAVEL");
    }
}

public class Ques14 {
    public static void main(String[] args) {
        Blogger blogger = new TravelBlogger();
        ((TravelBlogger)blogger).blog();
    }
    
}
