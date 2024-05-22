class Computer {
    private String type;
    private int processorSpeedMHz;
    private int memoryGB;
    private int hardDiskCapacityGB;
    private int pricePLN;

    public Computer(String type, int processorSpeedMHz, int memoryGB, int hardDiskCapacityGB, int pricePLN) {
        this.type = type;
        this.processorSpeedMHz = processorSpeedMHz;
        this.memoryGB = memoryGB;
        this.hardDiskCapacityGB = hardDiskCapacityGB;
        this.pricePLN = pricePLN;
    }

    @Override
    public String toString() {
        return type + ": " +
                "Processor Speed: " + processorSpeedMHz + " MHz, " +
                "Memory: " + memoryGB + " GB, " +
                "Hard Disk Capacity: " + hardDiskCapacityGB + " GB, " +
                "Price: " + pricePLN + " PLN";
    }
}