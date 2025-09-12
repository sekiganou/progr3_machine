package model;

import java.util.List;
import java.util.Observable;
import java.util.Random;

public class Proverbs extends Observable {
    public String selected;
    public static final List<String> list = List.of(
            "A penny saved is a penny earned.",
            "Actions speak louder than words.",
            "All that glitters is not gold.",
            "Better late than never.",
            "Don't count your chickens before they hatch.",
            "Every cloud has a silver lining.",
            "Fortune favors the bold.",
            "Good things come to those who wait.",
            "Haste makes waste.",
            "If you can't beat them, join them.",
            "Knowledge is power.",
            "Look before you leap.",
            "No pain, no gain.",
            "Practice makes perfect.",
            "The early bird catches the worm.",
            "When in Rome, do as the Romans do.",
            "Where there's a will, there's a way.",
            "You can't judge a book by its cover."
    );

    public void getRandomProverb() {
        setChanged();
        notifyObservers();
    }
}
