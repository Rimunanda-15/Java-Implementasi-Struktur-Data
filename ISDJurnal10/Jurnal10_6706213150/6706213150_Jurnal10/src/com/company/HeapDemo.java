package com.company;

public class HeapDemo {
    public static void main(String[] args) {
        MinHeap q = new MinHeap();
        q.add(new WorkOrder(60, "Contoh"));
        q.add(new WorkOrder(5, "Contoh"));
        q.add(new WorkOrder(43, "Contoh"));
        q.add(new WorkOrder(11, "Contoh"));
        q.add(new WorkOrder(12, "Contoh"));
        q.add(new WorkOrder(50, "Contoh"));
        q.add(new WorkOrder(23, "Contoh"));
        q.add(new WorkOrder(8, "Contoh"));
        q.add(new WorkOrder(17, "Contoh"));
        q.add(new WorkOrder(3, "Contoh"));
        while (q.size() > 0)
            System.out.println(q.remove());
    }
}