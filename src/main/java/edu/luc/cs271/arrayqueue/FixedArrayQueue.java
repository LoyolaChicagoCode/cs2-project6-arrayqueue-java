package edu.luc.cs271.arrayqueue;

import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  /**
   * @pre capacity > 0
   * @post TODO
   */
  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    // TODO ensure precondition
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // TODO
    return false;
  }

  @Override
  public E peek() {
    // TODO
    return null;
  }

  @Override
  public E poll() {
    // TODO
    return null;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return false;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    // TODO then return as an unmodifiable list
    return Arrays.asList();
  }
}
