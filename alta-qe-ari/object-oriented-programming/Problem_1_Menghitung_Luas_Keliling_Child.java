public class Problem_1_Menghitung_Luas_Keliling_Child extends Problem_1_Menghitung_Luas_Keliling_Parent{
    int sisiMiring;
    void kelilingPersegi(int lebar){
        kelPersegi=lebar*4;
        System.out.println("Persegi: "+kelPersegi);
    }
    void kelilingSegitiga(int alas, int tinggi){
        sisiMiring= (int) Math.sqrt((alas*alas)+(tinggi*tinggi));
        kelSegitiga=sisiMiring+alas+tinggi;
        System.out.println("Segitiga: "+kelSegitiga);
    }
    void kelilingPersegiPanjang(int panjang, int lebarP){
        kelPersegiPanjang=(panjang+lebarP)*2;
        System.out.println("Persegi Panjang: "+kelPersegiPanjang);
    }
}
