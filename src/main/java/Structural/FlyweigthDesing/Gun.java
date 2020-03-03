package Structural.FlyweigthDesing;

public abstract class Gun {

    protected Bullet[] bullets;
    protected  int capacity;
    private final BulletType bulletType;

    public Gun(int capacity, BulletType type){
        this.capacity = capacity;
        this.bulletType = type;
    }
    public abstract void shoot();

    public void loadBullets(){
        for (int i = 0; i < this.capacity; i++)
            System.out.println(BulletFactory.getBulletFromCache(this.bulletType));


    }
    public void loadUncachedBullets(){
        for (int i = 0; i < this.capacity; i++)
            System.out.println(BulletFactory.getBulletByType(this.bulletType));
        }

}
