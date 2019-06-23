package HomeWork3.Deque;

import HomeWork3.Queue.Queue;

public interface Deque<E> extends Queue<E>
{
  void insertLeft(E value);
  void insertRight(E value);

  E removeLeft();
  E removeRight();
}
