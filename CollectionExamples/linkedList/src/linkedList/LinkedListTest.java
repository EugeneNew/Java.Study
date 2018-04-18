package linkedList;

import assistentPackage.*;
import java.util.*;
// 02.04.2018 LinkedList Test

public class LinkedListTest{
    public static void main(String[] args){

        String inMyHand;

        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");


        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        List<String> c = new LinkedList<>();
        buildCollectionClass buildCollection = new buildCollectionClass(999);
        c = buildCollection.getNewCollection();

        System.out.println("Start");
        System.out.println(a);
        System.out.println(b);
        System.out.println("c.size() = "+c.size());

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        ListIterator<String> cIter = c.listIterator();

        while (cIter.hasNext()){
            System.out.println(cIter.next());
            //System.out.println("cIter.nextIndex()="+cIter.nextIndex());
            //System.out.println("cIter.previousIndex()="+cIter.previousIndex());
        }


        try{
            cIter.next();
        }
        catch (NoSuchElementException e){
            System.out.println("Достигнут конец коллекции:"+e.getMessage());
        }


        while (bIter.hasNext()){
            if (aIter.hasNext()) aIter.next();
            inMyHand = bIter.next();
            System.out.println("inMyHand = "+inMyHand+";");
            aIter.add(inMyHand);
        }
        System.out.println("Объединили коллекции:" + a);

        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if (bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println("Удалили каджое второе слово из коллекции b:"+b);

        a.removeAll(b);
        System.out.println("Удалили из а коллекцию b ");

        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }



}
