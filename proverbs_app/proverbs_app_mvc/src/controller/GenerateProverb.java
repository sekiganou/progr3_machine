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
        proverbs.selectRandomProverb();
    }
}
