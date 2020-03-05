package Behavioural.iterator;

public class CustomIterableCollectionIterator implements Iterator{

    private CustomInterableCollection collection;

    private int collectionSize;
    private int currentIndex = -1;

    public CustomIterableCollectionIterator(
            CustomInterableCollection collection){
        this.collection = collection;
        this.collectionSize = collection.size();
    }


    @Override
    public String getNext() {
    currentIndex ++;
        return this.collection.getStringAtIndex(currentIndex);
    }

    @Override
    public boolean hasMore() {
        return currentIndex +1 < collectionSize;
    }
}
