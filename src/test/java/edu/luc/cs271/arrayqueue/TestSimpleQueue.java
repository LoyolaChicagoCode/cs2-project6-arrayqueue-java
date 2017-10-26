package edu.luc.cs271.arrayqueue;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSimpleQueue {

  private SimpleQueue<String> fixture;

  @Before
  public void setUp() {
    fixture = new FixedArrayQueue<>(2);
  }

  @After
  public void tearDown() {
    fixture = null;
  }

  @Test
  public void testInitial() {
    assertTrue(fixture.isEmpty());
    assertEquals(0, fixture.size());
    assertNull(fixture.peek());
    assertNull(fixture.poll());
  }

  @Test
  public void testAfterOffer() {
    final String value = "hello";
    assertTrue(fixture.offer(value));
    assertEquals(1, fixture.size());
    assertEquals(value, fixture.peek());
  }

  @Test
  public void testOfferThenPoll() {
    final String value = "hello";
    assertTrue(fixture.offer(value));
    assertEquals(value, fixture.poll());
    assertTrue(fixture.isEmpty());
  }

  @Test
  public void testOffer2ThenPoll2() {
    final String value1 = "hello";
    final String value2 = "world";
    assertTrue(fixture.offer(value1));
    assertTrue(fixture.offer(value2));
    assertEquals(value1, fixture.poll());
    assertEquals(value2, fixture.poll());
    assertTrue(fixture.isEmpty());
  }

  @Test
  public void testOffer3Poll3() {
    final String value1 = "hello";
    final String value2 = "world";
    final String value3 = "what";
    assertTrue(fixture.offer(value1));
    assertTrue(fixture.offer(value2));
    assertEquals(value1, fixture.poll());
    assertTrue(fixture.offer(value3));
    assertEquals(value2, fixture.poll());
    assertEquals(value3, fixture.poll());
    assertTrue(fixture.isEmpty());
  }

  @Test
  public void testOffer5Poll5() {
    final String value1 = "hello";
    final String value2 = "world";
    final String value3 = "what";
    final String value4 = "up";
    final String value5 = "today";
    assertTrue(fixture.offer(value1));
    assertTrue(fixture.offer(value2));
    assertEquals(value1, fixture.poll());
    assertTrue(fixture.offer(value3));
    assertEquals(value2, fixture.poll());
    assertEquals(value3, fixture.poll());
    assertTrue(fixture.offer(value4));
    assertTrue(fixture.offer(value5));
    assertEquals(value4, fixture.poll());
    assertEquals(value5, fixture.poll());
    assertTrue(fixture.isEmpty());
  }

  @Test
  public void testOffer3() {
    final String value1 = "hello";
    final String value2 = "world";
    final String value3 = "what";
    assertTrue(fixture.offer(value1));
    assertTrue(fixture.offer(value2));
    assertFalse(fixture.offer(value3));
    assertEquals(2, fixture.size());
  }

  @Test
  public void testAsListEmpty() {
    assertEquals(0, fixture.asList().size());
  }

  @Test
  public void testAsListNonempty() {
    final String value1 = "hello";
    final String value2 = "world";
    fixture.offer(value1);
    fixture.offer(value2);
    final List<String> list = fixture.asList();
    assertEquals(2, list.size());
    assertEquals(Arrays.asList(value1, value2), list);
  }

  @Test
  public void testAsListNonempty2() {
    final String value1 = "hello";
    final String value2 = "world";
    final String value3 = "what";
    fixture.offer(value1);
    fixture.offer(value2);
    fixture.poll();
    fixture.offer(value3);
    final List<String> list = fixture.asList();
    assertEquals(2, fixture.size());
    assertEquals(2, list.size());
    assertEquals(Arrays.asList(value2, value3), list);
  }
}
