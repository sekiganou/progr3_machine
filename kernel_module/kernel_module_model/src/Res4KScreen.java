public class Res4KScreen implements Screen {
    private final int resolutionX;
    private final int resolutionY;
    private final double price;

    public Res4KScreen() {
        price = 299.99;
        resolutionY = 2160;
        resolutionX = 3840;
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
