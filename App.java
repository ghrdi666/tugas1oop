public class App {

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.keliling();
        segitiga.luas();
        Umur saya = new Umur();
        saya.hitungUmur();
        Suhu drajat = new Suhu();
        drajat.hitungSuhu();
        
    }
}

class Segitiga{
    public void keliling(){
        int sisi = 20;

        int hasil = sisi*sisi*sisi; 
        System.out.println("keliling segitiganya adalah : " + hasil);
    }

    public void luas(){
        int alas = 10;
        int tinggi = 20;
        double luasSegitiga=1.00/2.00*alas*tinggi ;

        System.out.println("luas segitiganya adalah : " + luasSegitiga);
    }
}

class Umur{
    public void hitungUmur(){
        int tahunSekarang = 2024;
        int tahunLahir = 2004;

        int umur = tahunSekarang - tahunLahir;
        System.out.println("umur saya sekarang: " + umur);
    }
}

class Suhu {
    public void hitungSuhu() {
        int reamur = 50;
        double celcius = reamur * 5 / 4;
        double fahrenheit = reamur * 9 / 4;
        double kelvin = reamur * 5 / 4 + 273.15;

        System.out.println("Celsius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}