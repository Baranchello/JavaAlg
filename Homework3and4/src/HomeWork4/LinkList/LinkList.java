package HomeWork4.LinkList;

public interface LinkList<E>
{

  void insertFirst(E value);

  E removeFirst();

  boolean remove(E value);

  void display();

  boolean isEmpty();

  int getSize();

  boolean contains(E value);

  E getFirstElement();

}
