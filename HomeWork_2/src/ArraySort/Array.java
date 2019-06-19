package ArraySort;

public interface Array <E>
{
  E get(int index);
  void add(E element);
  boolean remove(E element);

  boolean contains (E element);
  boolean is_empty();
  int index_of(E element);
  int get_size();

  void sort_bubble();
  void sort_insert();
  void sort_select();
}
