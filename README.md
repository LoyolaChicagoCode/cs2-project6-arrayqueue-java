# Loyola COMP 271 Project 6: array-based queues

## Group activity

In this activity, we'll implement our own array-based data structure, a fixed-size circular queue!

# Objectives

An understanding of the following concepts and techniques:

- ADT implementation perspective
- queue ADT
- implementing queue as a circular array
- queues with fixed versus growing capacity
- algorithms based on the queue's FIFO policy
- interface-based testing
- initial exposure to concurrency

# Instructions

In this lab, you will have the opportunity to implement a generic queue as a circular array
and use this implementation in the context of a typical queue-based application.

Specifically:

1. Complete the TODO items in the `FixedArrayQueue` implementation until the tests pass.
1. Complete the main class `SingleQueueService`, which reads successive input lines until EOF and
puts them on a queue that the background consumer activity processes.
1. When running the main class, note that the consumer is set to serve customers at a fixed rate.
By entering customers' names at different rates, try to create scenarios where customers arrive infrequently enough for the queue to remain empty, or in such quick succession that the queue becomes full.
1. Answer the following questions:
   - Why does `FixedArrayQueue` require an explicit constructor?
   - What happens when you offer an item to a full `FixedArrayQueue`?
   - What happens when you poll an empty `FixedArrayQueue`?
   - What is the time and (extra) space complexity of each of the `FixedArrayQueue` methods?

# Running the code

To run the tests, please press the green "run" button or, in a Replit Shell window, run

    mvn test

To run the main program, in a Replit Shell window, run

    mvn exec:java

# Grading (total 5 points)

- 2.5 completion of items marked TODO in `FixedArrayQueue` and tests passing
- 1 completion of `SingleQueueService` and correct behavior
- 1.5 written part
  - 1.2 responses to the questions above
  - 0.3 grammar, style, formatting

# References

- [Introduction and Array Implementation of Circular Queue](https://www.geeksforgeeks.org/introduction-and-array-implementation-of-circular-queue)
