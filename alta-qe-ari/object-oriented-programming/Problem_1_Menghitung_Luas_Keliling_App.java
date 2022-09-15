public class Problem_1_Menghitung_Luas_Keliling_App {
    public static void main(String[] args) {
        Problem_1_Menghitung_Luas_Keliling_Child hitung = new Problem_1_Menghitung_Luas_Keliling_Child();
        System.out.println("Luas");
        hitung.luasPersegi(4);
        hitung.luasSegitiga(3,4);
        hitung.luasPersegiPanjang(7,8);
        System.out.println();
        System.out.println("Keliling");
        hitung.kelilingPersegi(4);
        hitung.kelilingSegitiga(3,4);
        hitung.kelilingPersegiPanjang(7,8);
    }
}
