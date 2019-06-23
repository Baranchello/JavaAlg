import ArraySort.*;

import java.util.Random;

public class MainClass
{

  private static final int MAX_ELM = 100000;

  public static void main(String[] args)
  {
    ArrayImpl array = new ArrayImpl(MAX_ELM);

    Random rnd = new Random();
    for (int i = 0; i < MAX_ELM; i++)
    {
      array.add(rnd.nextDouble()*100);
    }

    long start = System.currentTimeMillis();
//    array.sort_bubble();
//    array.sort_select();
    array.sort_insert();
    long finish = System.currentTimeMillis();

    System.out.println("Время сортировки: " + (finish - start) + " мс");



  }




}
