package Structural.composite;

import java.util.ArrayList;

public class GiftSurpriseBox implements SurpriseBox {
    private ArrayList<SurpriseBox> surpriseBoxes;

    public GiftSurpriseBox(){
        this.surpriseBoxes = new ArrayList<>();
    }
    public void add(SurpriseBox box){
        this.surpriseBoxes.add(box);
    }
    public void remove(SurpriseBox box){
        this.surpriseBoxes.remove(box);
    }


    public void unWrap() {
        surpriseBoxes.forEach(SurpriseBox::unWrap);

    }
}
