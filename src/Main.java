public class Main {
    public static void main(String[] args) {
       // Employee e1 = new Employee("Abdullah Çobanoğlu", "5555555456", "abdcbn@outlook.com");
        //Academician a1 = new Academician("Engin Demiroğ", "1111231231", "edmrg@asdasd.com", "CENG", "DOC.");
        //a1.cikis();

       // Employee m1 = new Officer("Murat Yücedağ", "454514545", "a@patika.dev", "IT", "09:00 - 18:00");

        TrainingPersonal t1 = new TrainingPersonal("Engin Demiroğ", "0", "engin@gmail.com",
                                                    "CENG", "PROF.", "11234");
        t1.derseGir("09:00");
    // Metotlarda geçersiz kılma işlemi => Metot Overriding

        //Polymorphism = Çok Biçimlilik
       // a1.giris();

       // int[] loginUser = new int[5];
        Employee[] loginUser = { t1};

       // Employee.girisYapanlar(loginUser);

        //Abstraction : Soyutlama
        //Bir metodu abstract etmek istiyorsak o sınıfı da abstract yapmamız gerekmektedir.

    }
}
