package edu.luc.cs271.arrayqueue;

import java.util.List;

/**
 * Generic interface for a first-in-first-out (FIFO) data structure where objects are inserted into
 * and removed from opposeite ends.
 *
 * <p>Based on Koffman & Wolfgang, Data Structures 3rd ed, Wiley 2015.
 *
 * @param <E> The element type
 */
public interface SimpleQueue<E> {
  /**
   * Adds an item to the end of the queue and returns a boolean to indicate whether the attempt
   * succeded.
   *
   * @post The queue is one item larger and nonempty.
   * @param obj The object to be inserted
   * @return true if the object has been inserted, false otherwise
   */
  boolean offer(E obj);

  /**
   * Returns the object at the front of the queue without removing it.
   *
   * @post The queue remains unchanged.
   * @return The object at the front of the queue if one exists, null otherwise
   */
  E peek();

  /**
   * Returns the object at the front of the queue and removes it.
   *
   * @post The queue is one item smaller.
   * @return The object at the front of the queue if one exists, null otherwise
   */
  E poll();

  /**
   * Returns true if the queue is empty; otherwise, returns false.
   *
   * @post The queue remains unchanged.
   * @return true if the queue is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Returns the size of the queue.
   *
   * @post The queue remains unchanged.
   * @return the size of the queue
   */
  int size();

  /**
   * Returns a Java list containing the items currently in the queue. The item at the front of the
   * queue is the first item of the list (at index 0).
   *
   * @post The queue remains unchanged.
   * @return The list containing the items in the queue
   */
  List<E> asList();
}
