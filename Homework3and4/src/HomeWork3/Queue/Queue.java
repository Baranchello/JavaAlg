package HomeWork3.Queue;

public interface Queue<E>
{

  void insert(E value);

  E remove();
  E peek();

  boolean isEmpty();
  boolean isFull();

  int getSize();
}
