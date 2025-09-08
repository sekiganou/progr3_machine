public record PC(Processor processor, Screen screen) {

    public String getConfiguration() {
        return String.format(
                """

                        Processor: %s (%.2f GHz, %d cores, %d threads) - %.2f€
                        Screen: %dx%d - %.2f€""",
                processor.getClass().getSimpleName().replace("Processor", ""),
                processor.getClockSpeed(), processor.getCores(), processor.getThreads(),
                processor.getPrice(),
                screen.getResolutionX(), screen.getResolutionY(),
                screen.getPrice());

    }

    public double getTotalPrice() {
        return processor.getPrice() + screen.getPrice();
    }

    @Override
    public String toString() {
        return getConfiguration() + "\nTotal price is " + getTotalPrice() + " €";
    }
}
