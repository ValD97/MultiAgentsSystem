package core;

import java.util.List;

public class System {

    private Sleeper sleeper;

    public System(Sleeper sleeper) {
        this.sleeper = sleeper;
    }

    public System() {

    }

    public void runOnce(Agent agent) {
        agent.decide();
    }

    public void runAll(List<Agent> agentList) {
        for (Agent agent : agentList) {
            this.runOnce(agent);
        }
    }

    public void delay(int millis) throws InterruptedException {
        sleeper.sleep(millis);
    }
}
