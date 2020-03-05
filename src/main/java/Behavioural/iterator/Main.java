package Behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        IterableCollection collection = new CustomInterableCollection();
        Iterator  iterator= collection.createIterator();
        int i =0;

        while (iterator.hasMore()){
            String  result = iterator.getNext();
            System.out.println(++i + ">" + result);
        }
    }
}
