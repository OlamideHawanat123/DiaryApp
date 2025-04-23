package MyTasks;

public class MyQueue {
    int size = 0;
    int[] queue;
    int counter = 0;

    public MyQueue(int size) {
        this.queue = new int[size];

    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(int element) {
        for(int count = 0; count < queue.length; count++) {
            if(counter != size){
                queue[count] = element;
                counter++;
                return true;
            }

        }
        return false;

    }


    public int peek() {
        return queue[0];
        }
}
