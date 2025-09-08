public class AMDProcessor implements Processor{
    private final double price;
    private final double clockSpeed;
    private final int cores;
    private final int threads;

    public AMDProcessor() {
        price = 349.99;
        clockSpeed = 3.60;
        cores = 8;
        threads = 16;
    }

    @Override
    public double getClockSpeed() {
        return clockSpeed;
    }

    @Override
    public int getCores() {
        return cores;
    }

    @Override
    public int getThreads() {
        return threads;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
