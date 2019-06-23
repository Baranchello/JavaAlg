package HomeWork4;

import HomeWork4.LinkList.LinkList;
import HomeWork4.LinkList.LinkListImpl;

public class MainClassHW4
{
  public static void main(String[] args)
  {
    LinkList<Integer> ll = new LinkListImpl();

    ll.insertFirst(1);
    ll.insertFirst(2);
    ll.insertFirst(3);
    ll.insertFirst(4);
    ll.display();
    ll.removeFirst();
    ll.removeFirst();
    ll.display();
  }
}
