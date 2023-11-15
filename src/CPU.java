import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM + "GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class Harddisk
    public class Harddisk {
        int jumlahpenyimpanan;
        String manufacturer;

        Harddisk(int jumlahpenyimpanan, String manufacturer){
            this.jumlahpenyimpanan = jumlahpenyimpanan;
            this.manufacturer = manufacturer;
        }

        public void getInfoHarddisk(){
            System.out.println("Jumlah Penyimpanan: " + this.jumlahpenyimpanan + "GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class Motherboard
    public class Motherboard{
        String manufacturer;
        String type;
        int slotRam;

        Motherboard(String manufacturer, String type, int slotRam){
            this.manufacturer = manufacturer;
            this.type = type;
            this.slotRam = slotRam;
        }

        public void getInfoMotherboard(){
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor yang Kompatibel: " + this.type);
            System.out.println("Jumlah Slot Ram: " + this.slotRam);
        }
    }

    // inner class PowerSuply
    public class PowerSupply{
        int kapasitas;
        String manufacturer;

        PowerSupply(int kapasitas, String manufacturer){
            this.kapasitas = kapasitas;
            this.manufacturer = manufacturer;
        }

        public void getInfoPSU(){
            System.out.println("Kapasitas: " + this.kapasitas + "W");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class VGACard
    public class VGA{
        int jumlahVRAM;
        String manufacturer;

        VGA(int jumlahVRAM, String manufacturer){
            this.jumlahVRAM = jumlahVRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoVGA(){
            System.out.println("Jumlah VRAM: " + this.jumlahVRAM + "GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

}