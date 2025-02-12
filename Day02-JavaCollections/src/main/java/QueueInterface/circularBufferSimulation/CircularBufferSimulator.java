package QueueInterface.circularBufferSimulation;

public class CircularBufferSimulator {
    public static void main(String[] args) {
        MyCircularBuffer buffer = new MyCircularBuffer(3);

        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.printBuffer();

        buffer.add(4);
        buffer.printBuffer();

        System.out.println("Removed : " + buffer.remove());
        buffer.printBuffer();
    }
}
