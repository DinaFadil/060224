package lesson4.InnerClass;

public class OuterClass {
    class Inner {
        private String name;
        
        public Inner(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
    }
}