public record PC(Processor processor, Screen screen) {

    public String getConfiguration() {
        return String.format(
                "\n- Processor: %.2f GHz, %d cores, %d threads, price: %.2f€\n- Screen: %dx%d, price: %.2f€",
                processor.getClockSpeed(),
                processor.getCores(),
                processor.getThreads(),
                processor.getPrice(),
                screen.getResolutionX(),
                screen.getResolutionY(),
                screen.getPrice()
        );
    }

    public double getTotalPrice() {
        return processor.getPrice() + screen.getPrice();
    }
}
