public class TugasPraUKL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        //NOMOR 1
        // Input data dari pengguna
        System.out.print("Masukkan berat paket (kg): ");
        double berat = scanner.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = scanner.nextDouble();

        // Hitung volume paket
        double volume = panjang * lebar * tinggi;

        // Tentukan biaya per kg berdasarkan jarak
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // Hitung biaya berdasarkan berat
        double biayaBerat = berat * biayaPerKg;

        // Hitung biaya volume
        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }

        // Hitung total biaya
        double totalBiaya = biayaBerat + biayaVolume;

        // Tampilkan hasil
        System.out.println("Volume paket: " + volume + " cm³");
        System.out.println("Biaya pengiriman berdasarkan berat: Rp " + biayaBerat);
        System.out.println("Biaya pengiriman berdasarkan volume: Rp " + biayaVolume);
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);

        
     
        
        
       
        
        scanner.close();

    }
    }
