package Behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomInterableCollection implements IterableCollection {

    List<String> internalList = new ArrayList<>();

     public Iterator createIterator() {
        return new CustomIterableCollectionIterator(this);
    }
    public CustomInterableCollection(){
        internalList.add("I");
        internalList.add("Love");
        internalList.add("Binary");

    }
    public int size(){
         return this.internalList.size();
    }
    public String getStringAtIndex(int i){
         return internalList.get(i);
    }
}
