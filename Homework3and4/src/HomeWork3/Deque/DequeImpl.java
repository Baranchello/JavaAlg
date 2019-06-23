package HomeWork3.Deque;

import HomeWork3.Queue.QueueImpl;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E>
{
  public DequeImpl(int maxSize)
  {
    super(maxSize);
  }

  @Override
  public void insertLeft(E value)
  {
    if(isFull()) throw new RuntimeException("Deque is full!");

    if (this.front - 1 < 0) front = data.length;

    data[--front] = value;
    size++;
  }

  @Override
  public E removeLeft()
  {
    return super.remove();
  }


  @Override
  public E removeRight()
  {
    if (isEmpty()) throw new RuntimeException("Deque is empty!");

    if (rear < 0) rear = data.length - 1;

    size--;
    return data[rear--];
  }

  @Override
  public void insertRight(E value)
  {
    super.insert(value);
  }



}
