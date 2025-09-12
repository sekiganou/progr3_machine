package controller;

import model.Proverbs;

import java.util.Random;

public class GenerateProverb {
    private final Random random = new Random();
    private final Proverbs proverbs;

    public GenerateProverb(Proverbs proverbs) {
        this.proverbs = proverbs;
    }

    public void selectRandomProverb() {
        var randomIndex = random.nextInt(Proverbs.list.size());
        proverbs.setSelectedProverb(Proverbs.list.get(randomIndex));
        proverbs.notifyView();
    }
}
