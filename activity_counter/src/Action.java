import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Action extends Thread {
    private static final AtomicInteger activityCounter = new AtomicInteger(0);

    private final int sleepTimer;
    private final List<Action> preconditions;
    public Action(String name, List<Action> preconditions, int sleepTimer) {
        super(name);
        this.sleepTimer = sleepTimer;
        this.preconditions = preconditions;
    }

    private void joinPreconditions() {
        for(Thread precondition : this.preconditions){
            try {
                precondition.join();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void run(){
        joinPreconditions();
        System.out.println(this.getName() + " sleeping for " + sleepTimer + "s");
        try {
            Thread.sleep(sleepTimer * 1000L);
            System.out.println(this.getName() + " ended. Action counter: " + activityCounter.get());
            activityCounter.incrementAndGet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
