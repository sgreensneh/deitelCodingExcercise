package dsa;

public interface List<I extends Number> {
    void add(int element);
    void remove(String element);
    void remove(int id);
    void add(String element, int index);
    void size();
    String get(int index);
    boolean isEmpty();
}
