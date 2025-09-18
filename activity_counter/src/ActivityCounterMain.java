import java.util.ArrayList;

public class ActivityCounterMain {
    public static void main(String[] args) {
        var action0 = new Action("Action 0", new ArrayList<>(), 3);

        var step1Preconditions = new ArrayList<Action>();
        step1Preconditions.add(action0);

        var action1 = new Action("Action 1", step1Preconditions, 15);
        var action2 = new Action("Action 2", step1Preconditions, 5);
        var action3 = new Action("Action 3", step1Preconditions, 10);

        var step2Preconditions = new ArrayList<Action>();
        step2Preconditions.add(action1);
        step2Preconditions.add(action2);
        step2Preconditions.add(action3);
        var action4 = new Action("Action 4", step2Preconditions, 4);

        var step3Preconditions = new ArrayList<Action>();
        step3Preconditions.add(action4);
        var action5 = new Action("Action 5", step3Preconditions, 3);

        action0.start();
        action1.start();
        action2.start();
        action3.start();
        action4.start();
        action5.start();

        try {
            for (int i = 0; i < 5; i++) {
                var step4Preconditions = new ArrayList<Action>();
                step4Preconditions.add(action5);

                var newAction5 = new Action("Action 5 - iteration " + i, step4Preconditions, 3);

                newAction5.start();
                newAction5.join();

                action5 = newAction5;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}