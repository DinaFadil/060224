package lesson8.Generic.GenericQueue;

public class Main {
    public static void main(String[] args) {
        
        //create object and test with integer
        Queue<Integer> integerQueue = new GenericQueue<>();
        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);

        System.out.println("Integer Queue:");
        while (!integerQueue.isEmpty()) {
            System.out.println("Dequeued:" + integerQueue.dequeue());
        }
        System.out.println();

         //create object and test with string
         Queue<String> stringQueue = new GenericQueue<>();
         stringQueue.enqueue("ayam");
         stringQueue.enqueue("itik");
         stringQueue.enqueue("kucing");
 
         System.out.println("String Queue:");
         while (!stringQueue.isEmpty()) {
             System.out.println("Dequeued:" + stringQueue.dequeue());
         }
         System.out.println();

          //create object and test with boolean
          Queue<Boolean> booleanQueue = new GenericQueue<>();
          booleanQueue.enqueue(true);
          booleanQueue.enqueue(false);
  
          System.out.println("Boolean Queue:");
          while (!booleanQueue.isEmpty()) {
              System.out.println("Dequeued:" + booleanQueue.dequeue());
          }
          System.out.println();
    }
}
