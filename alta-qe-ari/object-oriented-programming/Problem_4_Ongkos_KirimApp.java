public class Problem_4_Ongkos_KirimApp {

    public static void main(String[] args) {
        Problem_4_Ongkos_Kirim_Child ongkos = new Problem_4_Ongkos_Kirim_Child();
        ongkos.volumeBarang(5,2,4);
        System.out.println("Ongkos kirim Anda dengan volume barang "+ongkos.volume+" cm3 adalah Rp."+ongkos.ongkosKirimTotal);
    }
}
