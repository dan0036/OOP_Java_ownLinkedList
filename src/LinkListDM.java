public class LinkListDM<E> implements LinkListableDM<E> {

    int sizeList = 0;
    Node<E> firstNode;
    Node<E> lastNode;
    static int indexStatNode;

    public LinkListDM() {
        indexStatNode = 0;
    }

    @Override
    public boolean contains(E e) {
        for (Node<E> x = firstNode; x != null; x = x.nextNode) {
            if (x.item.equals(e)) {
            return true;
        }
    }
        return false;
    }

    @Override
    public int size() {
        return sizeList;
    }

    @Override
    public boolean add(E e) {
        if (sizeList == 0) {
            firstNode = lastNode = new Node<>(e, null, null);
        } else {
            Node<E> l = lastNode;
            Node<E> newNode = new Node<E>(e, l, null);
            l.nextNode = newNode;
            lastNode = newNode;
        }
        sizeList++;
        return true;
    }

    @Override
    public boolean remove(Object e) {
        if (e == null) {
            for (Node<E> x = firstNode; x != null; x = x.nextNode) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = firstNode; x != null; x = x.nextNode) {
                if (e.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }
// Здесь пришлось отдельно присваивать null ссылки, так как класс Node не принимает null
// при выполнении программы в случае удаления крайних узлов. Но работает, если принудительно прописать в методе.
// Почему так??
    void unlink(Node<E> e) {
        if (e == lastNode) {
            lastNode = e.prevNode;
            lastNode.nextNode = null;
        } else if (e == firstNode) {
            firstNode = e.nextNode;
            firstNode.prevNode = null;
        } else {
            Node<E> prev = e.prevNode;
            Node<E> next = e.nextNode;
            prev.nextNode = next;
            next.prevNode = prev;
        }
        sizeList--;
    }


    @Override
    public E get(int index) {
        if (index < sizeList) {
            for (Node<E> x = firstNode; x != null; x = x.nextNode) {
                if (x.indexNode == index) {
                    return x.item;
                }
            }
        }
        return null;
    }

    @Override
    public String toString(LinkListDM<E> e) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (Node<E> x = firstNode; x != null; x = x.nextNode) {
            sb.append(x.item.toString()).append(", ");
        }
        String result = sb.toString();
        result = result.substring(0, result.length()-2);
        result += " ]";
        return result;
    }

    @Override
    public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[ ");
            for (Node<E> x = firstNode; x != null; x = x.nextNode) {
                sb.append(x.item.toString()).append(", ");
            }
            String result = sb.toString();
            result = result.substring(0, result.length()-2);
            result += " ]";
            return result;
        }


    @Override
    public E set (int index, E e) {
        if (index < sizeList) {
            for (Node<E> x = firstNode; x != null; x = x.nextNode) {
                if (x.indexNode == index) {
                    E oldItem = x.item;
                    x.item = e;
                    return oldItem;
                }
            }
        }
        return null;
    }
}

