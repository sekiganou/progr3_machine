import controller.GenerateProverb;
import model.Proverbs;
import view.ProverbWindow;

public class proverbs_app_main {
    public static void main(String[] args) {
        var proverbs = new Proverbs();
        var generateProverb = new GenerateProverb(proverbs);
        var window = new ProverbWindow(proverbs, generateProverb);

        proverbs.addObserver(window);
    }
}