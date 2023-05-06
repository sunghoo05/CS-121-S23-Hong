public class LinkedListQueueTester {
    public static void main(String[] args)
    {
        LinkedListQueue a = new LinkedListQueue();

        // 1
        System.out.println("1");
        a.enqueue("Tom");
        a.enqueue("Jane");
        a.enqueue("Beth");
        System.out.println(a.displayQueue());

        // 2
        System.out.println("2");
        a.enqueue("John");
        a.enqueue("Mary");
        System.out.println(a.displayQueue());

        // 3
        System.out.println("3");
        System.out.println("Queue is empty: " + a.isEmpty());
        System.out.println("Number of items in queue is " + a.size());
        System.out.println("The head of the queue is: " + a.peek());
        a.dequeue();
        System.out.println();

        // 4
        System.out.println("4");
        System.out.println(a.displayQueue());

        // 5
        System.out.println("5");
        System.out.println("Queue is empty: " + a.isEmpty());
        System.out.println("Number of items in queue is " + a.size());
        System.out.println("The head of the queue is: " + a.peek());
        System.out.println();

        // 6
        System.out.println("6");
        a.dequeue();
        System.out.println("The head of the queue is: " + a.peek());
        System.out.println();

        // 7
        System.out.println("7");
        a.dequeue();
        System.out.println("The head of the queue is: " + a.peek());
        System.out.println();

        // 8
        System.out.println("8");
        a.dequeue();
        System.out.println("The head of the queue is: " + a.peek());
        System.out.println();

        // 9
        System.out.println("9");
        a.dequeue();
        System.out.println("The head of the queue is: " + a.peek());
        System.out.println();

        // 10
        System.out.println("10");
        System.out.println("Queue is empty: " + a.isEmpty());
    }
}