public class pertemuan2 {
    public static void main(String[] args) {
        String nama, nim, rombel;
        Double a,b,c,sqrt,z,res;

        nama = "Muhammad Afif Naufal";
        nim = "0110223240";
        rombel = "SE02 & TI08";

        a = 9.0;
        b = 6.0;
        c = 7.0;
        z = Math.cos(c);
        res = 2 * a * b * z;

        sqrt = Math.sqrt(a * a * b * b - res);

        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Rombel : " + rombel);
        System.out.println("Hasil : " + sqrt);
    }
}
