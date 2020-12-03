package com.company;


import java.util.PriorityQueue;

public class MyPriorityQueue {
    PriorityQueue<IndexCard> entries;
    PriorityQueue<IndexCard> arrList = new PriorityQueue<IndexCard>(); //not an arrayList

    public MyPriorityQueue() {
        entries = new PriorityQueue<IndexCard>();
    }

    public void addToPriorityQueue(IndexCard card) { //You don't need to touch this method
        entries.add(card);
    }

    public void showPriorityQueue() { //dump data into another way of storing data :/ google how to make a new priorityqueue while still utilizing entries
        if (arrList.size() == 4)
            for(int x = -2; x < arrList.size() + 1; x++) {
                System.out.println(arrList.peek().getCardNameName() + arrList.peek().getDistanceValue());
                arrList.remove(arrList.peek());
            }
        else {

        for (int i = -2; i< entries.size() + 1; i++) {
            arrList.add(entries.peek());
            System.out.println(entries.peek().getCardNameName() + entries.peek().getDistanceValue());
            entries.remove(entries.peek());
        }
        }
    }

    public void updateHeadValue(int valueToAdd) { //Should add provided value to first object in PriorityQueue
        IndexCard.addToDistance(valueToAdd);
    }
}
