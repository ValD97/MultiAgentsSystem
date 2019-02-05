package core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestAgent {

    @Test
    public void whenCreatingAgent_thenItIsNotNull() {
        Agent agent = new Agent(0, 1) {
            public void decide() {}
        };
        assertNotNull(agent);
    }

    @Test
    public void whenCreatingAgentWithPos_thenItHasPos() {
        Agent agent = new Agent(0, 1) {
            public void decide() {}
        };
        assertEquals(1, agent.getPosX());
        assertEquals(0, agent.getPosY());
    }

    @Test
    public void whenSettingPosX_thenItUpdatesPosX() {
        Agent agent = new Agent(1, 2) {
            public void decide() {}
        };
        agent.setPosX(0);
        assertEquals(0, agent.getPosX());
        agent.setPosX(1);
        assertEquals(1, agent.getPosX());
    }

    @Test
    public void whenSettingPosY_thenItUpdatesPosY() {
        Agent agent = new Agent(2, 3) {
            public void decide() {}
        };
        agent.setPosY(0);
        assertEquals(0, agent.getPosY());
        agent.setPosY(1);
        assertEquals(1, agent.getPosY());
    }
}
