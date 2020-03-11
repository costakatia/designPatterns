package Creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String , Prototype> stringPrototypeMap;

    public PrototypeRegistry(){
        this.stringPrototypeMap = new HashMap<>();
    }
    public void addPrototypeToRegistry
            (String prototypeName, Prototype prototype){
        this.stringPrototypeMap.put(prototypeName,prototype);

    }
    public Prototype getPrototypeCloneFromPrototypeRegistry(String prototypeName){
        return this.stringPrototypeMap.get(prototypeName).clone();
    }


}
