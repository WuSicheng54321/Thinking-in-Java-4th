import java.util.ArrayList;

//: innerclasses/Test04.java
// Holds a Test04 of Objects.

interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Test04<T> {
  private ArrayList<T> items;
  public Test04(int size) { items = new ArrayList<T>(); }
  public void add(T  x) {
      items.add(x);
  }
  private class Test04Selector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.size(); }
    public T current() { return items.get(i); }
    public void next() { if(i < items.size()) i++; }
  }
  public Selector selector() {
    return new Test04Selector();
  }	
  public static void main(String[] args) {
    Test04<String> Test04 = new Test04<>(10);
    for(Integer i = 0; i < 10; i++)
      Test04.add(i.toString());
    Selector selector = Test04.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~