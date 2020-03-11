package Creational.prototype;

public class ConcreateProtoType implements Prototype {
    private  String name;

    public ConcreateProtoType(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new ConcreateProtoType(this.name) ;
    }
}
