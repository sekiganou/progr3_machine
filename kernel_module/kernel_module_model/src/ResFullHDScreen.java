public class ResFullHDScreen implements Screen{
    private final int resolutionX;
    private final int resolutionY;
    private final double price;

    public ResFullHDScreen() {
        price = 99.99;
        resolutionY = 1080;
        resolutionX = 1920;
    }

    @Override
    public int getResolutionX() {
        return resolutionX;
    }

    @Override
    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
