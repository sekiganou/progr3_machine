public class IntelProcessor implements Processor {
    private final double price;
    private final double clockSpeed;
    private final int cores;
    private final int threads;

    public IntelProcessor() {
        price = 249.99;
        clockSpeed = 2.60;
        cores = 4;
        threads = 8;
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
