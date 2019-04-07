package com.uguryasar.edu.oop.encapsulation;

/**
 * Sarmalama(Encapsulation): Basitçe sınıf elemanlarının erişimlerini sınırlamaktır.
 * Örneğin Vehicle sınıfındaki brand(marka) özelliği sadece nesne üretilirken yapıcı metod
 * içerisinde değer alabiliyor. set metodu veya bu değişkene değer atayan başka bir metod
 * olmadığı için erişimi sınırlandırmış oluyoruz.
 *
 * Bu değişkenin aksine weight(ağırlık) değişkenine erişimi sınırlandırmayıp istenildiği zaman değer atama
 * yapılabiliyor. Çünkü setWeight metodunun erişim belirleyicisini public olarak belirledik.
 *
 * wheelCount değişkenine değer atamaya ise aynı paket içerisinde olan sınıflar yapabiliyor. Çünkü setWeight
 * metodunun erişim belirleyicisini protected olarak belirledik.
 *
 * Kullanım örnekleri Application sınıfı içerisindedir.
 *
 * @author uguryasar
 *
 */
public class Vehicle {

    public Vehicle(String brand) {
        this.brand = brand;
    }

    private String brand;
    private int wheelCount;
    private double weight;

    public String getBrand() {
        return brand;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    protected Vehicle setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Vehicle setWeight(double weight) {
        this.weight = weight;
        return this;
    }

}
