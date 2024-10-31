package com.izeye.helloworld;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for {@link Fortune}.
 *
 * @author Johnny Lim
 */
class FortuneTests {

    @Test
    @DisplayName("Returns a fortune")
    void testItWorks() throws JsonProcessingException {
        Fortune fortune = new Fortune();
        assertTrue(fortune.randomFortune().length() > 0);
    }

}
