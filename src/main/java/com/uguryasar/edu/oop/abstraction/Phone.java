package com.uguryasar.edu.oop.abstraction;

/**
 * Soyutlama(Abstraction): Soyutlama, bir metodun işlevini nasıl yerine getireceğini
 * kendisini kalıtım yoluyla alan sınıfların karar vermesi yöntemidir. Yani siz bir sınıfta bir metod tanımlıyorsunuz
 * fakat işini nasıl yapacağını söylemiyorsunuz. Buna kendisini kalıtım yoluyla miras alan sınıfların tanımlamasını
 * istiyorsunuz.
 * <p>
 * Örnek olarak Phone sınıfına bakabiliriz. Phone sınıfına call() metodu tanımlandı ama işlevi belirtilmedi. Bu durumda
 * soyutlama yapmış oluyoruz. call() metodunun nasıl çalışacağına kendisini miras alan DialUpPhone ve MobilePhone karar
 * veriyor.
 * <p>
 * Soyut metod tanımlayabilmeniz için sınıfın da soyut olması gerekir.
 * Soyut sınıflardan nesne üretilemez.
 * Soyut metodlar miras alınan sınıflarda işlevleri tanımlanmak zorundadır.
 *
 * @author uguryasar
 */

public abstract class Phone {

    public abstract void call();

}

class DialUpPhone extends Phone {

    public void call() {
        System.out.println("Call via dial-up");
    }
}

class MobilePhone extends Phone {

    public void call() {
        System.out.println("Call via wireless");
    }

}

class Application {

    public static void main(String[] args) {

        // Soyut sınıflardan nesne türetilemez. Bu yüzden aşağıda satırdaki yorum satırı kaldırıldığında hata verir.
        // Phone phone = new Phone();

        DialUpPhone dialUpPhone = new DialUpPhone();
        dialUpPhone.call();

        System.out.println("--------------------");

        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.call();

    }

}
