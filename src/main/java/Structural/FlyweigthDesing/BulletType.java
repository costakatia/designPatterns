package Structural.FlyweigthDesing;

public enum BulletType {
    PISTOL_BULLET("MG 45 BULLET"),
    SHOTGUN_BULLET("COOEY 84 bullet"),
    SNIPER_BULLET("M 14 bullet");

    private String name;

    BulletType(String name){
        this.name = name;
    }
}
