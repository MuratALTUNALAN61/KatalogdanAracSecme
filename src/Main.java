import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Otomobil suv = new Otomobil("Suv");
        Otomobil supersoprt = new Otomobil("Supersoprt");

        Otomobil[] otomobilTuru = new Otomobil[2];
        otomobilTuru[0] = suv;
        otomobilTuru[1] = supersoprt;

        Suv nissan = new Suv("Suv","Nissan");
        Suv peugeot = new Suv("Suv","Peugeot");

        Suv[] suvMarkalari = new Suv[2];
        suvMarkalari[0] = nissan;
        suvMarkalari[1] = peugeot;

        Nissan juke = new Nissan("Suv","Nissan","juke");
        Nissan quashqai = new Nissan("Suv","Nissan","quashqai");

        Nissan[] nissanModelleri = new Nissan[2];
        nissanModelleri[0] = juke;
        nissanModelleri[1] = quashqai;

        Qashqai qashqai1 = new Qashqai("Suv","Nissan","Quashqai",2018);
        Qashqai qashqai2 = new Qashqai("Suv","Nissan","Quashqai",2023);

        Qashqai[] qashqailer = new Qashqai[2];
        qashqailer[0] = qashqai1;
        qashqailer[1] = qashqai2;



        for (int i=0; i<otomobilTuru.length; i++){
            System.out.println((i+1)+". "+otomobilTuru[i].getTur());
        }
        System.out.println("İstediğiniz araç türünün numarasını giriniz");

        Scanner scanner = new Scanner(System.in);
        int turSecimi = scanner.nextInt();

        if (turSecimi == 1) {
            for (int i=0; i<suvMarkalari.length; i++){
                System.out.println((i+1)+". "+suvMarkalari[i].getMarka());
            }
            System.out.println("İstediğiniz suv markasının numarasını giriniz");

            Scanner scanner1 = new Scanner(System.in);
            int markaSecimi = scanner1.nextInt();

            if (markaSecimi == 1) {
                for (int i=0; i<nissanModelleri.length; i++){
                    System.out.println((i+1)+". "+nissanModelleri[i].getModel());
                }
                System.out.println("İstediğiniz nissan model numarasını giriniz");

                Scanner scanner2 = new Scanner(System.in);
                int modelSecimi = scanner2.nextInt();

                if (modelSecimi == 2) {
                    for (int i=0; i< qashqailer.length;i++){
                        System.out.println((i+1)+". "+qashqailer[i].getYil());
                    }
                    System.out.println("İstediğiniz quashqai numarasını seçiniz");

                    Scanner scanner3 = new Scanner(System.in);
                    int quashqaiSecimi = scanner3.nextInt();

                    if (quashqaiSecimi == 1) {
                        qashqai1.ozeliikler();
                    } else {
                        qashqai2.ozeliikler();
                    }
                }
            }
        }
    }
}