import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Filter extends Observable implements Observer {
    private ArrayList<Object> values = new ArrayList<>();
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Counter) {
            values.add(arg);
        }

        if(values.size() % 2 ==0){
            setChanged();
            notifyObservers(values);
        }
    }
}
