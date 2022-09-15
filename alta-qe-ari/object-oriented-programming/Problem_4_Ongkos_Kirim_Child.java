public class Problem_4_Ongkos_Kirim_Child extends Problem_4_Ongkos_Kirim_Parent{
    void volumeBarang(float panjang, float lebar, float tinggi){
        volume=panjang*lebar*tinggi; //menghitung volume awal barang
        ongkosVol=volume/vol; //hitung dengan membagi minimal volume (50 cm3)
        pembulatan=Math.round(ongkosVol); //pembulatan hasil
        ongkosKirimTotal=pembulatan*5000; //menghitung ongkos kirim secara keseluruhan dengan mengkalikan 5000
    }
}
