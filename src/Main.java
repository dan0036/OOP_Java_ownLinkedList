import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkListDM<Integer> lldm = new LinkListDM<>();
        lldm.add(1);
        lldm.add(2);
        lldm.add(3);

        System.out.println("print whole list: "+lldm);
        System.out.println("1st element: " + lldm.firstNode.toString());
        System.out.println("last element: " + lldm.lastNode.toString());
        System.out.println("got item by 0 index: "+lldm.get(0));
        System.out.println("got item by 1 index: "+lldm.get(1));
        System.out.println("got item by 2 index: "+lldm.get(2));
        System.out.println("got item by 3 index: "+lldm.get(3));

        lldm.remove(1);
        System.out.println("removed item 1: "+lldm);

        lldm.add(4);
        System.out.println("added item 4: "+lldm);

        System.out.println("Index 0 elmnt: "+lldm.get(0));
        System.out.println("Index 2 elmnt: "+lldm.get(2));
        System.out.println("size of list: "+lldm.sizeList);
    }
}