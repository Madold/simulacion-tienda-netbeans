package Tienda;

public class Catalogos {

    /**
     * *********************** CPUS ****************************
     */
    public void mostrarCPUsAmd() {
        System.out.println("=> Catalogo de Procesadores AMD\n"
                + "1. AMD Ryzen 3 3200G   --> $250.000\n"
                + "2. AMD Ryzen 3 3300    --> $315.000\n"
                + "3. AMD Ryzen 3 3300X   --> $350.000\n"
                + "4. AMD Ryzen 5 3400g   --> $390.000\n"
                + "5. AMD Ryzen 5 3600    --> $540.000\n"
                + "6. AMD Ryzen 5 3600X   --> $590.000\n"
                + "7. AMD Ryzen 7 3700    --> $840.000\n"
                + "8. AMD Ryzen 7 3700X   --> $890.000\n"
                + "9. AMD Ryzen 7 3800    --> $930.000\n"
                + "10. AMD Ryzen 7 3800X  --> $1.000.000\n"
                + "11. AMD Ryzen 9 3900   --> $2.200.000\n"
                + "12. AMD Ryzen 9 3900X  --> $2.400.000\n"
                + "13. AMD Ryzen 9 3950X  --> $2.575.000\n"
                + "14. AMD Ryzen 9 3950XT --> $2.715.000");
    }

    public void mostrarCPUsIntel() {
        System.out.println("=> Catalogo de Procesadores INTEL\n"
                + "1. INTEL Core i3 10100   --> $285.000\n"
                + "2. INTEL Core i3 10100F  --> $260.000\n"
                + "3. INTEL Core i5  10400  --> $345.000\n"
                + "4. INTEL Core i5  10400F --> $325.000\n"
                + "5. INTEL Core i5  10600  --> $360.000\n"
                + "6. INTEL Core i5  10600K --> $400.000\n"
                + "7. INTEL Core i7 10700   --> $890.000\n"
                + "8. INTEL Core i7 10700K  --> $945.000\n"
                + "9. INTEL Core i9 10900   --> $2.400.000\n"
                + "10. INTEL Core i9 10900K --> $3.000.000\n");
    }

    /**
     * *********************** GPUS ****************************
     */
    public void mostrarGPUsNvidia() {
        System.out.println("=> Catalogo de GPUs Nvidia\n"
                + "1. Nvidia GTX 1030       --> $500.000\n"
                + "2. Nvidia GTX 1050       --> $575.000\n"
                + "3. Nvidia GTX 1050TI     --> $655.000\n"
                + "4. Nvidia GTX 1060       --> $716.000\n"
                + "5. Nvidia GTX 1060 super --> $800.000\n"
                + "6. Nvidia GTX 1060TI     --> $895.000\n"
                + "7. Nvidia RTX 2060       --> $1.500.000\n"
                + "8. Nvidia RTX 2060 super --> $1.800.000\n"
                + "9. Nvidia RTX 2080       --> $2.800.000\n"
                + "10. Nvidia RTX 2080TI    --> $3.500.000\n");
    }

    public void mostrarGPUsAMD() {
        System.out.println("=> Catalogo de GPUs AMD\n"
                + "1. AMD Radeon RX 6800   --> $400.000\n"
                + "2. AMD Radeon RX 6800X  --> $530.000\n"
                + "3. AMD Radeon RX 6800XT --> $620.000\n"
                + "4. AMD Radeon RX 6700   --> $700.000\n"
                + "5. AMD Radeon RX 6600   --> $980.000\n");
    }

    /**
     * *********************** BOARDS ****************************
     */
    public void mostrarBoardGygabyte() {
        System.out.println("=> Catalogo de Placas madre Gygabyte\n"
                + "1. Gygabyte Z690 Gaming X    --> $1.500.000\n"
                + "2. Gygabyte X570S Gaming X   --> $816.000\n"
                + "3. Gygabyte B660 Gaming X AX --> $690.000\n");
    }

    public void mostrarBoardMSI() {
        System.out.println("=> Catalogo de Placas madre MSI\n"
                + "1. MSI MPG Z590 --> $800.000\n"
                + "2. MSI MPG Z490 --> $950.000\n"
                + "3. MSI MPG Z690 --> $1.200.000\n"
                + "4. MSI MPG Z590 --> $1.500.000\n"
                + "5. MSI MAG B550 --> $1.000.000\n");
    }

    /**
     * *********************** MEMORIAS RAM ****************************
     */
    public void mostrarMemoriaRAM() {
        System.out.println("=> Catalogo de Memorias RAM (DDR4)\n"
                + "1. XLR9 Gaming Epic-X RGB 8GB 3200MHZ     --> $245.000\n"
                + "2. Spectrix D41 Gamer RGB 16GB 3600MHZ    --> $515.000\n"
                + "3.  Fury Beast (Color negro) 4GB 2400MHZ  --> $176.000\n"
                + "4. Vengeance (Color negro) 32 GB 560Mhz   --> $790.000\n"
                + "5. Hyper X Fury 8GB 3600MHZ               --> $314.000\n");
    }

    /**
     * *********************** FUENTES DE PODER ****************************
     */
    public void mostrarFuentes() {
        System.out.println("=> Catalogo de Fuentes de Poder\n"
                + "1. COUGAR VTC 400w Certificación 80 plus gold      --> $312.000\n"
                + "2. Corsair SF 600w Gold Modular                    --> $400.000\n"
                + "3.  Cougar AURIC 750w Certificacion 80 Plus Gold   --> $450.000\n"
                + "4. EVGA Supernona 1000w certificacion 80 plus gold --> $600.000\n"
                + "5. EVGA Supernona 1300w certificacion 80 plus gold --> $830.000\n");
    }

    /**
     * *********************** ALMACENAMIENTOS ****************************
     */
    public void mostrarCatalogoHDD() {
        System.out.println("=> Catalogo de almacenamientos HDD\n"
                + "1. Disco duro Seagate 500GB       --> $80.000\n"
                + "2. Disco duro Kingston 250GB      --> $70.000\n"
                + "3. Disco duro Western Digital 1TB --> $200.000\n"
                + "4. Disco duro SanDisk 500GB       --> $160.000\n"
                + "5. Disco duro SeaGate 2TB         --> $300.000\n");
    }

    public void mostrarCatalogoSSD() {
        System.out.println("=> Catalogo de Almacenamientos SSD"
                + "1. Disco SSD Kingston 240GB             --> $230.000\n"
                + "2. Disco SSD Adata Swordfish 500GB NVME --> $295.000\n"
                + "3. Disco SSD Western Digital 1TB        --> $515.000\n"
                + "4. Disco SSD Crucial  1TB               --> $517.000\n"
                + "5. Disco SSD Swordfish 2TB M.2 NVME     --> $720.00\n");
    }
}
