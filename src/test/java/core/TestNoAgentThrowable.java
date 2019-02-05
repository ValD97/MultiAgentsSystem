package core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNoAgentThrowable {

    @Test
    public void whenGettingMessage_thenItReturnsTheRightMessage() {
        String msg = "Impossible de récupérer un agent sur une case null";
        NoAgentThrowable throwable = new NoAgentThrowable();
        assertEquals(msg, throwable.getMessage());
    }
}
