package PipedStreams;

import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        String message = "Hello from Writer Thread!";
        try {
            pos.write(message.getBytes());
            pos.close();
            System.out.println("Writer thread finished writing.");
        } catch (IOException e) {
            System.out.println("Error in writer thread: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        byte[] buffer = new byte[1024];
        try {
            int bytesRead = pis.read(buffer);
            String message = new String(buffer, 0, bytesRead);
            System.out.println("Reader thread received message: " + message);
            pis.close();
        } catch (IOException e) {
            System.out.println("Error in reader thread: " + e.getMessage());
        }
    }
}

public class PipedStreamsCommunication {
    public static void main(String[] args) {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();

        try {
            pos.connect(pis);

            Thread writerThread = new WriterThread(pos);
            Thread readerThread = new ReaderThread(pis);

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

            System.out.println("Inter-thread communication completed.");
        } catch (IOException | InterruptedException e) {
            System.out.println("Error in communication: " + e.getMessage());
        }
    }
}

