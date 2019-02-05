package core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestEnvironment {

    @Test
    public void whenCreatingEnvironment_thenItIsNotNull() throws ZeroLengthArrayThrowable {
        Environment environment = new Environment(5, 10);
        assertNotNull(environment);
    }

    @Test
    public void whenCreatingEnvironment_thenItHasWidth() throws ZeroLengthArrayThrowable {
        Environment environment = new Environment(5, 10);
        assertEquals(10, environment.getWidth());
    }

    @Test
    public void whenCreatingEnvironment_thenItHasHeight() throws ZeroLengthArrayThrowable {
        Environment environment = new Environment(5, 10);
        assertEquals(5, environment.getHeight());
    }

    @Test
    public void whenCreatingEnvironment_thenItInitializesAnArrayWithHeightAndWidth() throws ZeroLengthArrayThrowable {
        Environment environment = new Environment(6, 7);
        assertEquals(environment.getHeight(), environment.getAgentGrid().length);
        assertEquals(environment.getWidth(), environment.getAgentGrid()[0].length);
    }

    @Test(expected = ZeroLengthArrayThrowable.class)
    public void whenCreatingEnvironmentWithANullHeight_thenItThrowsAnException() throws ZeroLengthArrayThrowable {
        new Environment(0, 1);
    }

    @Test(expected = ZeroLengthArrayThrowable.class)
    public void whenCreatingEnvironmentWithANullWidth_thenItThrowsAnException() throws ZeroLengthArrayThrowable {
        new Environment(1, 0);
    }

    @Test(expected = NoAgentThrowable.class)
    public void whenGettingAnNonExisingAgent_thenItThrowsAnException() throws ZeroLengthArrayThrowable, NoAgentThrowable {
        Environment environment = new Environment(4, 4);
        environment.getAgent(0, 0);
    }

    @Test
    public void whenAddingAnAgent_thenTheAgentIsAccessible() throws ZeroLengthArrayThrowable, NoAgentThrowable {
        Environment environment = new Environment(5, 5);
        Agent agent = mock(Agent.class);
        when(agent.getPosX()).thenReturn(3);
        when(agent.getPosY()).thenReturn(2);
        environment.addAgent(agent);
        assertEquals(agent, environment.getAgent(2, 3));
    }
}
