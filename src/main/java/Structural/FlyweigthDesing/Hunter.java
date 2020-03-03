package Structural.FlyweigthDesing;

public class Hunter {
    public static void main(String[] args) {
        System.out.println("Shooting with cached bullets");
        Gun shotGun = new ShotGun(8, BulletType.SHOTGUN_BULLET);
        shotGun.loadBullets();
        shotGun.shoot();
        System.out.println("______________________________________________________");
        System.out.println("Shooting with uncahed bullets");
        Gun shoutGunUncached = new ShotGun(8, BulletType.SHOTGUN_BULLET);
        shoutGunUncached.loadUncachedBullets();
        shoutGunUncached.shoot();
    }
}
