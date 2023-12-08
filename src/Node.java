public class Node<E> {
        E item;
        Node<E> prevNode;
        Node<E> nextNode;
        int indexNode; // Индексы неизменяемы после присвоения. Аналог id.

        public Node() {
                indexNode = LinkListDM.indexStatNode++;
        }
        public Node(E item, Node<E> prev, Node<E> next) {
                this.item = item;
                this.prevNode = prev;
                this.nextNode = next;
                indexNode = LinkListDM.indexStatNode++;

        }

        @Override
        public String toString() {
                return "Node{" +
                        "item=" + item.toString() +
                        '}';
        }
}
