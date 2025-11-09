import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        runScenario0();
        runScenario1();
        runScenario2();
        runScenario3();
        runScenario4();
        runBonus();
    }
    // SCENARIO 0:

    public static void runScenario0() {
        int[] myArr = {4, 8, 15, 16, 23, 42};

        System.out.println("a. Array length: " + myArr.length);
        System.out.println("b. First element (myArr[0]): " + myArr[0]);
        System.out.println("c. Last element index: " + (myArr.length - 1));
        System.out.println("d. Third element (myArr[2]): " + myArr[2]);
        System.out.println("e. Value of myArr[3]: " + myArr[3]);

        // Hata verecek satır (çalıştırıldığında programı durdurur)
        // System.out.println(myArr[10]);

        System.out.println("\n/*");
        System.out.println(" * f. Accessing myArr[10] (commented out) would cause an");
        System.out.println(" * 'ArrayIndexOutOfBoundsException' because the highest");
        System.out.println(" * valid index is 5.");
        System.out.println(" */");
    }

    // SCENARIO 1:
    public static int[] resizeRoster(int[] oldRoster, int newSize) {
        int[] newRoster = new int[newSize];
        int lengthToCopy = Math.min(oldRoster.length, newSize);
        System.arraycopy(oldRoster, 0, newRoster, 0, lengthToCopy);
        return newRoster;
    }

    public static void runScenario1() {
        int[] oldRoster = new int[20];
        for (int i = 0; i < oldRoster.length; i++) {
            oldRoster[i] = 1000 + i;
        }
        int newSize = 42;
        int[] newRoster = resizeRoster(oldRoster, newSize);

        System.out.println("\nOld Roster (Size " + oldRoster.length + "):");
        System.out.println(Arrays.toString(oldRoster));

        System.out.println("\nNew Roster (Size " + newRoster.length + "):");
        System.out.println(Arrays.toString(newRoster));
    }


    // SCENARIO 2:
    public static int[] rotateRight(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int n = arr.length;
        int[] rotatedArr = new int[n];
        rotatedArr[0] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            rotatedArr[i] = arr[i - 1];
        }
        return rotatedArr;
    }

    public static void runScenario2() {
        Random rand = new Random();

        int size = rand.nextInt(11) + 10;
        int[] originalArray = new int[size];

        for (int i = 0; i < size; i++) {
            originalArray[i] = rand.nextInt(100);
        }

        System.out.println("\nOriginal Array (Size " + size + "):");
        System.out.println(Arrays.toString(originalArray));

        int[] rotatedArray = rotateRight(originalArray);

        System.out.println("\nRotated Array:");
        System.out.println(Arrays.toString(rotatedArray));
    }


    // SCENARIO 3:

    public static void runScenario3() {

        Random rand = new Random();
        final int SIMULATIONS = 1_000_000;
        final int TOTAL_PROBABILITY_SLOTS = 10;

        int[] probabilityArray = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3};
        int[] counts = new int[4];

        for (int i = 0; i < SIMULATIONS; i++) {
            int randomIndex = rand.nextInt(TOTAL_PROBABILITY_SLOTS);
            int weatherType = probabilityArray[randomIndex];
            counts[weatherType]++;
        }

        System.out.println("\nSimulation Results for 1,000,000 Days:\n");
        double sunnyPercent = (double) counts[0] / SIMULATIONS * 100;
        double cloudyPercent = (double) counts[1] / SIMULATIONS * 100;
        double rainyPercent = (double) counts[2] / SIMULATIONS * 100;
        double stormyPercent = (double) counts[3] / SIMULATIONS * 100;
        System.out.printf("Sunny:  %,d days (%.2f%%) - Target: 40%%\n", counts[0], sunnyPercent);
        System.out.printf("Cloudy: %,d days (%.2f%%) - Target: 30%%\n", counts[1], cloudyPercent);
        System.out.printf("Rainy:  %,d days (%.2f%%) - Target: 20%%\n", counts[2], rainyPercent);
        System.out.printf("Stormy: %,d days (%.2f%%) - Target: 10%%\n", counts[3], stormyPercent);

    }


    // SCENARIO 4:

    public static void runScenario4() {

        Random rand = new Random();

        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        System.out.println("\nGenerated Array (30 elements):");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nPeak Results");
        System.out.println("Peak values found:");

        int peakCount = 0;
        int tallestPeak = -1;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(" - Value: " + arr[i] + " (at index " + i + ")");
                peakCount++;
                if (arr[i] > tallestPeak) {
                    tallestPeak = arr[i];
                }
            }
        }

        System.out.println("\nTotal number of peaks: " + peakCount);

        if (tallestPeak == -1) {
            System.out.println("Value of the tallest peak: (No peaks found)");
        } else {
            System.out.println("Value of the tallest peak: " + tallestPeak);
        }
    }


    // BONUS QUESTION:

    public static void runBonus() {

        Random rand = new Random();

        final int STUDENTS = 5;
        final int QUIZZES = 4;
        int[][] scores = new int[STUDENTS][QUIZZES];

        for (int i = 0; i < STUDENTS; i++) {
            for (int j = 0; j < QUIZZES; j++) {
                scores[i][j] = rand.nextInt(101);
            }
        }

        System.out.println("\nScore Table (Students x Quizzes):");
        System.out.print("         ");
        for (int j = 0; j < QUIZZES; j++) {
            System.out.printf("Quiz %-3d", j);
        }
        System.out.println("\n");
        for (int i = 0; i < STUDENTS; i++) {
            System.out.printf("Student %d: ", i);
            for (int j = 0; j < QUIZZES; j++) {
                System.out.printf("%-7d ", scores[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nStudent Averages (Rows)");
        for (int i = 0; i < STUDENTS; i++) {
            int studentSum = 0;
            for (int j = 0; j < QUIZZES; j++) {
                studentSum += scores[i][j];
            }
            double studentAvg = (double) studentSum / QUIZZES;
            System.out.printf("Student %d Average: %.2f\n", i, studentAvg);
        }

        System.out.println("\nQuiz Averages (Columns)");
        for (int j = 0; j < QUIZZES; j++) {
            int quizSum = 0;
            for (int i = 0; i < STUDENTS; i++) {
                quizSum += scores[i][j];
            }
            double quizAvg = (double) quizSum / STUDENTS;
            System.out.printf("Quiz %d Average: %.2f\n", j, quizAvg);
        }

        int highestScore = -1;
        int highStudentIdx = -1;
        int highQuizIdx = -1;

        for (int i = 0; i < STUDENTS; i++) {
            for (int j = 0; j < QUIZZES; j++) {
                if (scores[i][j] > highestScore) {
                    highestScore = scores[i][j];
                    highStudentIdx = i;
                    highQuizIdx = j;
                }
            }
        }

        System.out.println("\nHighest Score");
        System.out.println("Value: " + highestScore);
        System.out.println("Location: (studentIndex=" + highStudentIdx + ", quizIndex=" + highQuizIdx + ")");
    }
}



// GİTHUB HESABI: melda00