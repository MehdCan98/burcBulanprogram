import java.util.Scanner;
//Kullanıcıdan verileri alabilmek için Scanner Sınıfını projeye dahii ediyoruz.

public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan alacağımız Gün ve Ay için iki değişken tanımladık
        int day, month;


        Scanner input = new Scanner(System.in);


        //Kullanıcıdan Verileri istemek ve almak için bir mesaj ve bir input kodu yazıyoruz
        System.out.print("Hangi Ayda Doğdun: ");
        month =input.nextInt();


        System.out.print("Hangi Günde Doğdun: ");
        day = input.nextInt();



        //İlk İf kodumuz ile Kullanıcının Kaçıncı Ay'ı girdiğini Sorguluyoruz
        if (month == 1){
            //Ana if'in içine yazdığımız ikinci İf ile girilen gün verisinin 31-30-28 günlük ay içi gün sayısına uygunluğunu sorguluyoruz
            if ((day>0)  && (day<31)){
                //Son iç İf ile girilen günün burç gün kapsamında olup olmadığını sorguluyoruz
                if (day < 22){
                    System.out.println("Burcunuz Oğlak");
                }else{
                    System.out.println("Burcunuz Kova");
                }
            }
            //Kulanıcının Belirli gün ve ay aralığında giriş yapmaması halinde kullanıcıya hatalı gün/ay girdiniz şeklinde hata mesajı veriyoruz.
        }else {
            System.out.println("Hatalı gün/ay girişi!");
        }


        if (month == 2){
            if ((day>0)  && (day<28)){
                if (day < 20){
                    System.out.println("Burcunuz Kova");
                }else{
                    System.out.println("Burcunuz Balık");
                }
            }
        }


        if (month == 3){
            if ((day>0)  && (day<31)){
                if (day < 21){
                    System.out.println("Burcunuz Balık");
                }else{
                    System.out.println("Burcunuz Koç");
                }
            }
        }


        if (month == 4){
            if ((day>0)  && (day<31)){
                if (day < 21){
                    System.out.println("Burcunuz Koç");
                }else{
                    System.out.println("Burcunuz Boğa");
                }
            }
        }


        if (month == 5){
            if ((day>0)  && (day<31)){
                if (day < 22){
                    System.out.println("Burcunuz Boğa");
                }else{
                    System.out.println("Burcunuz Kova");
                }
            }
        }


        if (month == 6){
            if ((day>0)  && (day<31)){
                if (day < 22){
                    System.out.println("Burcunuz Kova");
                }else{
                    System.out.println("Burcunuz Yengeç");
                }
            }
        }


        if (month == 7){
            if ((day>0)  && (day<31)){
                if (day < 22){
                    System.out.println("Burcunuz Aslan");
                }else{
                    System.out.println("Burcunuz Başak");
                }
            }
        }


        if (month == 8){
            if ((day>0)  && (day<31)){
                if (day < 22){
                    System.out.println("Burcunuz Başak");
                }else{
                    System.out.println("Burcunuz Terazi");
                }
            }
        }


        if (month == 9){
            if ((day>0)  && (day<31)){
                if (day < 22){
                    System.out.println("Burcunuz Terazi");
                }else{
                    System.out.println("Burcunuz Akrep");
                }
            }
        }


        if (month == 10){
            if ((day>0)  && (day<31)){
                if (day < 22){
                    System.out.println("Burcunuz Akrep");
                }else{
                    System.out.println("Burcunuz Yay");
                }
            }
        }


        if (month == 11){
            if ((day>0)  && (day<31)){
                if (day < 22){
                    System.out.println("Burcunuz Yay");
                }else{
                    System.out.println("Burcunuz Oğlak");
                }
            }
        }


        if (month == 12){
            if ((day>0)  && (day<31)){
                if (day < 22){
                    System.out.println("Burcunuz Oğlak");
                }else{
                    System.out.println("Burcunuz Kova");
                }
            }
        }
    }
}