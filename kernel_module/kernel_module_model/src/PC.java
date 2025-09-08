public record PC(Processor processor, Screen screen) {

    public String getConfiguration() {
        return String.format(
                "\n- Processor: %.2f GHz, %d cores, %d threads\n- Screen: %dx%d",
                processor.getClockSpeed(),
                processor.getCores(),
                processor.getThreads(),
                screen.getResolutionX(),
                screen.getResolutionY()
        );
    }

    public double getTotalPrice() {
        return processor.getPrice() + screen.getPrice();
    }
}
