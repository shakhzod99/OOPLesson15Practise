package Iterator;

import Lesson18Generics.List;

public class ListExample {
  public static void main(String[] args) {
    List<String> list = new List<>(12);
    list.add("string1");
    list.add("string2");
    list.add("string3");
    list.add("string4");

    list.iterator().forEachRemaining(System.out::println);
  }
}
