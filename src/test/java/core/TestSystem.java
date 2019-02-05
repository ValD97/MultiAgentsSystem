package core;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TestSystem {

    @Test
    public void whenCreatingASystem_thenItIsNotNull() {
        System system = new System();
        assertNotNull(system);
    }

    @Test
    public void whenRunningAnAgent_thenDecideMethodIsCalled() {
        System system = new System();
        Agent agent = mock(Agent.class);
        system.runOnce(agent);
        verify(agent).decide();
    }

    @Test
    public void whenRunningXAgent_thenCallingXDecideMethod() {
        List<Agent> agentList = new ArrayList<>();
        int nbAgents = 5;
        for (int i = 0; i < nbAgents; i++) {
            Agent agent = mock(Agent.class);
            agentList.add(agent);
        }
        System system = new System();
        system.runAll(agentList);
        for (Agent agent : agentList) {
            verify(agent).decide();
        }

    }

    @Test
    public void whenDelayingExecution_thenTheMockedPauseIsCalled() throws InterruptedException {
        Sleeper sleeper = mock(Sleeper.class);
        System system = new System(sleeper);
        system.delay(1000);
        verify(sleeper).sleep(1000);
    }
}
