package core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestZeroLengthArrayThrowable {

    @Test
    public void whenGettingMessage_thenItReturnsTheRightMessage() {
        String msg = "Impossible de créer un tableau de taille 0";
        ZeroLengthArrayThrowable throwable = new ZeroLengthArrayThrowable();
        assertEquals(msg, throwable.getMessage());
    }
}
