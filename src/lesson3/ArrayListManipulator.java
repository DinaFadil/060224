package lesson3;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListManipulator {
    private ArrayList<Integer>arrayList;
    public static void main(String[] args) {
        ArrayListManipulator arrayListManipulator = new ArrayListManipulator();
        arrayListManipulator.addElement(90);
        arrayListManipulator.addElement(100);
        arrayListManipulator.addElement(150);
        arrayListManipulator.addElement(250);
        arrayListManipulator.addElement(50);
        arrayListManipulator.addElement(10);
        System.out.println(arrayListManipulator.getArrayList().toString());
        arrayListManipulator.sortList();
        System.out.println(arrayListManipulator.getArrayList().toString());
        int ind = arrayListManipulator.searchElement(90);
        System.out.println(ind);

        // [90, 100, 150]
        //arrayListManipulator.removeElementByValue(90); //remove element 90 
        //[100, 150]
        //arrayListManipulator.removeElementByIndex(1); //remove index 1 in array which is 150
        //System.out.println(arrayListManipulator.getArrayList().toString());

    }

    public ArrayListManipulator(){
        arrayList = new ArrayList<>();
    }

    public void addElement(int element){
        arrayList.add(element);
    }

    public void removeElementByValue(int element){
        arrayList.remove(Integer.valueOf(element));
    }

    public void removeElementByIndex(int element){
        arrayList.remove(element);
    }

    public ArrayList<Integer>getArrayList(){
        return arrayList;
    }

    public int searchElement(int element){
        return arrayList.indexOf(element);
    }

    public void sortList(){
        Collections.sort(arrayList);
    }




}
