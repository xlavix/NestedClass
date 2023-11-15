public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        CPU.Harddisk hdd = myKomputer.new Harddisk(512,"Seagate");

        CPU.Motherboard mobo = myKomputer.new Motherboard("ASROCK","Intel",4);

        CPU.PowerSupply ps = myKomputer.new PowerSupply(650, "Seasonic");

        CPU.VGA gpu = myKomputer.new VGA(4,"Nvidia");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        // bikin object harddisk, vga, motherboard, powersupply
        hdd.getInfoHarddisk();
        mobo.getInfoMotherboard();
        ps.getInfoPSU();
        gpu.getInfoVGA();
    }
}