//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class observer_observable_main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Visualizer visualizer = new Visualizer();
        Filter filter = new Filter();
        counter.addObserver(filter);
        filter.addObserver(visualizer);
        counter.start();
    }
}