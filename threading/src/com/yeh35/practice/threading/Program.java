package com.yeh35.practice.threading;

import java.util.Date;
import java.util.UUID;

public class Program {

    final int somethingInt = 0;
    final long somethingLong = 0;
    final String somethingStr = "something";

    public static void main(String[] args) {

        Program program = new Program();

        Runnable runnable = () -> {

            UUID uuid = UUID.randomUUID();
            String name = "Thread(" + uuid + ") :";
            for (int j = 0; j < 10000; j++) {
                synchronized (program) {
                    program.count++;
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("program.count : " + program.count);
    }
}

public final class ImmutableObject {
    private final Date value;

    public ImmutableObject(final Date value) {
        this.value = value;
    }

    public Date getValue() {
        return (Date) value.clone();
    }
}