package Creational.prototype;

public class Main {
    public static void main(String[] args) {
        ConcreateProtoType original = new ConcreateProtoType("Teste prototype");
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototypeToRegistry("Original",original);

        ConcreateProtoType clone = (ConcreateProtoType) registry.getPrototypeCloneFromPrototypeRegistry("Original");
        System.out.println(original);
        System.out.println(clone);
        System.out.println();
        System.out.println(original.getName());
        System.out.println(clone.getName());
    }
}
