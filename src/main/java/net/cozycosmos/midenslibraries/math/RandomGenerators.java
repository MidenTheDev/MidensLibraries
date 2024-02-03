package net.cozycosmos.midenslibraries.math;

public class RandomGenerators {
    public static int getRandomInt(int min, int max) {

        return (int) ((Math.random() * ((max+1) - min)) + min);

    }
    public static long getRandomLong(long min, long max) {
        return (long) ((Math.random() * ((max+1) - min)) + min);
    }
}
