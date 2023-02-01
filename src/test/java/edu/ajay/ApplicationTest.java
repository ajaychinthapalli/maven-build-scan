package edu.ajay;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
  @Test
  public void testJoin() {
    assertEquals("Joined string didn't match", "1 2 3", Application.join("1", "2", "3"));
  }
}
