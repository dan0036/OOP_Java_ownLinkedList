public interface LinkListableDM<E> {
    boolean contains(E e);
    public int size();
    boolean add(E e);
    boolean remove(E e);
    Object get(int index);
    String toString(LinkListDM<E> e);
    E set(int index, E e);
    String toString();
}
