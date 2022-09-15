public class Problem_3_Kalkulator_Parent {
    int jumlah;
    int kurang;
    int bagi;
    int kali;
    void pembagian(int angkaBagi, int dibagiAngka){
        bagi=angkaBagi/dibagiAngka;
        System.out.println("Pembagian: "+bagi);
    }
    void perkalian(int angkaKali, int dikaliAngka){
        kali=angkaKali*dikaliAngka;
        System.out.println("Perkalian: "+kali);
    }
}
