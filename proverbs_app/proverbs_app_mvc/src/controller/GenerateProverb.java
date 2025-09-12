package controller;

import model.Proverbs;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class GenerateProverb implements Observer {
    private final Random random = new Random();
    private final Proverbs proverbs;
    public GenerateProverb(Proverbs proverbs) {
        this.proverbs = proverbs;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Proverbs) {
            int randomIndex = random.nextInt(Proverbs.list.size());
            proverbs.selected = Proverbs.list.get(randomIndex);
        }
    }
}
