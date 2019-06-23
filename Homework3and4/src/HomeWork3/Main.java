package HomeWork3;

import HomeWork3.Deque.DequeImpl;
import HomeWork3.Stack.StackImpl;

public class Main
{

  public static void main(String[] args)
  {
    //1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
    String testStr = "Нажал кабан на баклажаН";
    System.out.println("Исходная строка: " + testStr);
    StackImpl<Character> revertStack = new StackImpl<>(testStr.length());

    for (int i = 0; i < testStr.length(); i++)
    {
      revertStack.push(testStr.charAt(i));
    }

    System.out.print("Исходная строка: ");
    while (!revertStack.isEmpty())
    {
      System.out.print(revertStack.pop());
    }
    System.out.println();

    //2. Создать класс для реализации дека.
    DequeImpl<Integer> d = new DequeImpl(2);
    d.insertLeft(1);
    System.out.println(d.removeLeft());
    d.insertRight(3);
    System.out.println(d.removeRight());
  }

}
