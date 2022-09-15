public class Problem_1_Menghitung_Luas_Keliling_Parent {
    int lPersegi;
    int lSegitiga;
    int lPersegiPanjang;
    int kelPersegi;
    int kelSegitiga;
    int kelPersegiPanjang;
    void luasPersegi(int lebar){
        lPersegi=lebar*lebar;
        System.out.println("Persegi: "+lPersegi);
    }

    void luasSegitiga(int alas, int tinggi) {
        lSegitiga=alas*tinggi/2;
        System.out.println("Segitiga: "+lSegitiga);
    }

    void luasPersegiPanjang(int panjang, int lebarP) {
        lPersegiPanjang=panjang*lebarP;
        System.out.println("Persegi Panjang: "+lPersegiPanjang);
    }
}
