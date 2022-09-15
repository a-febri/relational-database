public class Problem_2_Menghtung_Volume_Child extends Problem_2_Menghitung_Volume_Parent {
    void volumeKubus(int sisi){
        vKubus=sisi*sisi*sisi;
        System.out.println("Volume Kubus: "+ vKubus);
    }
    void volumeTabung(int jariJari, int tinggi){
        vTabung= (22*jariJari*jariJari*tinggi)/7;
        System.out.println("Volume Tabung: "+vTabung);
    }
}
