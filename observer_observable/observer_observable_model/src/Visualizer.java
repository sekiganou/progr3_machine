import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Visualizer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if((o instanceof Filter)) {
            System.out.println(arg);
        }

    }
}
