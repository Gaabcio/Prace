class Laptop extends Computer {
    private double screenSizeInches;

    public Laptop(int processorSpeedMHz, int memoryGB, int hardDiskCapacityGB, int pricePLN, double screenSizeInches) {
        super("Laptop", processorSpeedMHz, memoryGB, hardDiskCapacityGB, pricePLN);
        this.screenSizeInches = screenSizeInches;
    }

    @Override
    public String toString() {
        return super.toString() + ", Screen Size: " + screenSizeInches + " inches";
    }
}