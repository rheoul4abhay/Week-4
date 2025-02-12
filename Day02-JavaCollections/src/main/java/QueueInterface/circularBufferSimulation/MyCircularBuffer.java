package QueueInterface.circularBufferSimulation;

public class MyCircularBuffer {
    private int[] buffer;
    private int size;
    private int capacity;
    private int head; //Points to oldest element
    private int tail; //Points to next available slot

    public MyCircularBuffer(int capacity){
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    public void add(int element){
        if(size == capacity){
            //Buffer is full so we adjust head
            buffer[tail] = element;
            head = (head + 1)%capacity;
            tail = (tail + 1)%capacity;
        } else {
            buffer[tail] = element;
            tail = (tail + 1) % capacity;
            size++; //Increase size of buffer if not full
        }
    }

    public int remove(){
        if(size == 0){
            throw new IllegalStateException("Buffer is empty");
        }
        int value = buffer[head];
        head = (head + 1) % capacity;
        size--;
        return value;
    }

    public boolean empty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public int[] getBuffer(){
        int[] result = new int[size];
        for(int i = 0;i < size; i++){
            result[i] = buffer[(head+i)%capacity];
        }
        return result;
    }

    public void printBuffer(){
        System.out.print("Buffer : [");
        for(int i = 0;i < size; i++){
            System.out.print(buffer[(head + i) % capacity]);
            if(i < size - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
