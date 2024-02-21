package Test3.Ques1_20;

import java.util.ArrayList;
import java.util.List;

public class Ques20 {
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<>();
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");
        list.addAll(list.subList(0, 4));
        System.out.println(list);
    }
    
}

/*Starting with JDK 7, Java allows to not specify type while initializing the ArrayList. As variable list is of List<String> type, therefore type of ArrayList is considered as String. Line n1 compiles successfully.



sublist method is declared in List interface:

List<E> subList(int fromIndex, int toIndex)

fromIndex is inclusive and toIndex is exclusive

It returns a view of the portion of this list between the specified fromIndex and toIndex. The returned list is backed by this list, so non-structural changes in the returned list are reflected in this list and vice-versa.

If returned list (or view) is structurally modified, then modification are reflected in this list as well but if this list is structurally modified, then the semantics of the list returned by this method become undefined.

If fromIndex == toIndex, then returned list is empty.

If fromIndex < 0 OR toIndex > size of the list OR fromIndex > toIndex, then IndexOutOfBoundsException is thrown.



At Line n2, list.subList(0, 4) --> [A, E, I, O] (toIndex is Exclusive, therefore start index is 0 and end index is 3].



list.addAll(list.subList(0, 4)); is almost equal to list.addAll(5, [A, E, I, O]); => Inserts A at index 5, E takes index 6, I takes index 7 and O is placed at index 8. list --> [A, E, I, O, U, A, E, I, O]



Last statement inside main(String []) method prints [A, E, I, O, U, A, E, I, O] on to the console. */
