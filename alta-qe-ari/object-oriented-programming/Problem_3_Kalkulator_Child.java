public class Problem_3_Kalkulator_Child extends Problem_3_Kalkulator_Parent {
    void penjumlahan(int angkaJumlah, int diJumlahAngka){
        jumlah=angkaJumlah+diJumlahAngka;
        System.out.println("Penjumlahan: "+jumlah);
    }
    void pengurangan(int angka, int dikurangiAngka){
        kurang=angka-dikurangiAngka;
        System.out.println("Pengurangan: "+kurang);
    }
}
