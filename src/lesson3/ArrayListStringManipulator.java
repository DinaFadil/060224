package lesson3;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListStringManipulator {
    private ArrayList<String>arrayList;
    public static void main(String[] args) {
        ArrayListStringManipulator arrayListStringManipulator = new ArrayListStringManipulator();
        arrayListStringManipulator.addElement("dina");
        arrayListStringManipulator.addElement("denzel");
        arrayListStringManipulator.addElement("lol");
        arrayListStringManipulator.addElement("meme");
        arrayListStringManipulator.addElement("lisa");
        arrayListStringManipulator.addElement("Miku");
        System.out.println(arrayListStringManipulator.getArrayList().toString());
        arrayListStringManipulator.sortList();
        System.out.println(arrayListStringManipulator.getArrayList().toString());
        arrayListStringManipulator.removeElementByValue("meme"); 
        arrayListStringManipulator.removeElementByIndex(1); 
        System.out.println(arrayListStringManipulator.getArrayList().toString());
        int ind = arrayListStringManipulator.searchElement("lisa");
        System.out.println(ind);

    }

    public ArrayListStringManipulator(){
        arrayList = new ArrayList<>();
    }

    public void addElement(String element){
        arrayList.add(element);
    }

    public void removeElementByValue(String element){
        arrayList.remove(String.valueOf(element));
    }

    public void removeElementByIndex(int element){
        arrayList.remove(element);
    }

    public ArrayList<String>getArrayList(){
        return arrayList;
    }

    public int searchElement(String element){
        return arrayList.indexOf(element);
    }

    public void sortList(){
        Collections.sort(arrayList);
    }




}
