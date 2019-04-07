package com.uguryasar.edu.oop.inheritance;

/**
 * Kalıtım(Inheritance): Bir sınıfa ait özellik ve işlevlerin diğer sınıflara aktarılması yöntemidir.
 *
 * Aşağıdaki sınıflar üzerinden örnekler verelim. Helicopter plane sınıfını kalıtım yoluyla aldığı için
 * kendi içerisinde tanımlamasak da type, engineCount ve fly metodlarını da içerir. Aynı şekilde Jet sınıfı da
 * Plane sınıfının tüm özellik ve işlevlerini kapsar. Bu özellikler dışında kendilerine has özellikleri de tanımlanmıştır.
 * Jetlerin çok hızlı uçma özellikleri flyFast() metodu ile, helikopterlerin havada asılı kalabilmeleri hover() metodu
 * ile kazandırılmıştır.
 *
 * Kalıtım benzer yapıdaki sınıflarda kullanılabilir. Kalıtım yoluyla genişleyen sınıflar birbirlerine bağımlı olurlar.
 * Yazılımda bağımlılık iyi bir şey değildir. Değiştirilmeye, genişlemeye engeldirler. Bu yüzden mümkün oldukça bağımlılığı
 * az tutmak için kalıtım gerektiğinde ve en temel özellikler için kullanılmalıdır.
 *
 * @author uguryasar
 *
 */
public class Plane {

    private String type;
    private int engineCount;

    public void fly() {
        System.out.println("Plane is flying");
    }

    public String getType() {
        return type;
    }

    public Plane setType(String type) {
        this.type = type;
        return this;
    }

    public int getEngineCount() {
        return engineCount;
    }

    public Plane setEngineCount(int engineCount) {
        this.engineCount = engineCount;
        return this;
    }

    public void info() {
        System.out.println("Type: " + type + "\nEngine count: " + engineCount);
    }
}

class Jet extends Plane {

    public void flyFast() {
        System.out.println("Jet planes can fly very fast");
    }

}

class Helicopter extends Plane {

    public void hover() {
        System.out.println("Helicopters can hover in the air");
    }

}

class Application {

    public static void main(String[] args) {

        Plane plane = new Plane();
        plane.setType("Airbus A360");
        plane.setEngineCount(4);
        plane.info();
        plane.fly();

        System.out.println("--------------------");

        Helicopter helicopter = new Helicopter();
        helicopter.setType("AH-64 Apache");
        helicopter.setEngineCount(1);
        helicopter.info();
        helicopter.hover();

    }
}
