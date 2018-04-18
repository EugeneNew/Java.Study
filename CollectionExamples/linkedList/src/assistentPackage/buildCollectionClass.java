package assistentPackage;

import java.util.*;
import java.util.List;
import java.util.ListIterator;




public class buildCollectionClass {

    List<String> constructCollection;
    Integer amountCollectionElements;

    public buildCollectionClass(){
        amountCollectionElements = 10;
    }

    public buildCollectionClass(Integer amountElements) {
        amountCollectionElements = amountElements;
    }

    private String getNewString() {
        String prepareString = UUID.randomUUID().toString();
        int startPosition = prepareString.length()-12;
        return prepareString.substring(startPosition);
    }

    public List<String> getNewCollection() {
        constructCollection = new LinkedList<>();
        ListIterator<String> constructCollectionIterator = constructCollection.listIterator();
        for (Integer i = 0; i < amountCollectionElements; i++) {
            constructCollectionIterator.add(i.toString()+"_"+getNewString());
        }
        return constructCollection;
    }
}






