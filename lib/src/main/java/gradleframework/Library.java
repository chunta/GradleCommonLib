/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleframework;

import java.util.Random;

public class Library {

    int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public int someLibraryMethod() { return getRandomInt(3000, 3300); }
}
