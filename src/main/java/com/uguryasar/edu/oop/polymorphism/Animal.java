package com.uguryasar.edu.oop.polymorphism;

/**
 * Çok biçimlilik(Polymorphism): Aynı isimli bir metodun işini farklı yollarla yapması anlamına gelir.
 * Hayvanlar üzerinden örnek verecek olursak, her hayvan iletişim kurar fakat bunu farklı şekillerde yaparlar.
 * Hayvanlar sesle, kokuyla, davranış ile iletişim kurabilirler.
 * Buradaki iletişimi javadaki fonksiyon olarak düşünebilirsiniz. İletişim kurma şekli ise fonksiyonun nasıl gerçekleştiğidir.
 *
 * Çok biçimlilik iki şekilde uygulanır: Overriding(ezme), Overloading (aşırı yükleme)
 *
 * Overriding: comminicate metodu overloading yönteminin bir örneğidir. Kalıtım yoluyla gelen metod kalıtım alan sınıfta ezilip
 * fonksiyonun kendisine özel şekilde çalışması sağlandı.
 *
 * Overloading: feed metodu overloading yönteminin bir örneğidir. feed() metodunda kedi besleniyor, feed(String food) metodunda
 * ise kedi belirli bir yiyecekle besleniyor. Burada yapılan iş beslenmedir ve farklı şekillerde yapılabiliyor.
 *
 * @author uguryasar
 */
public class Animal {

    /**
     * İletişim kurma fonksiyonu aşağıdaki gibi varsayılan şekilde tanımlandı.
     */
    public void communicate() {
        System.out.println("Animals communicate in various ways");
    }

}

class Cat extends Animal {

    /**
     * Kedilerin iletişim kurma fonksiyonu kendilerine has şekilde tanımlandı.
     */
    @Override
    public void communicate() {
        System.out.println("Cats communicate in voice");
    }

    public void feed() {
        System.out.println("Cat is feeding");
    }

    public void feed(String food) {
        System.out.println("Cat is feeding with " + food);
    }

}

class Bird extends Animal {

    /**
     * Kuşların iletişim kurma fonksiyonu kendilerine has şekilde tanımlandı.
     */
    @Override
    public void communicate() {
        System.out.println("Some birds communicate in courtship");
    }
}
