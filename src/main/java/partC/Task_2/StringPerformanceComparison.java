package partC.Task_2;

public class StringPerformanceComparison {

    public static long measureStringConcatTime() {
        long start = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 1_000_000; i++) {
            result += "a";
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long measureStringBuilderTime() {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("a");
        }

        String result = sb.toString();

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static String displayComparison(long stringTime, long stringBuilderTime) {
        return "Execution time (String): " + stringTime + " ms\n" +
                "Execution time (StringBuilder): " + stringBuilderTime + " ms";
    }
    public static void main(String[] args) {
        long time1 = measureStringConcatTime();
        long time2 = measureStringBuilderTime();
        String result = displayComparison(time1, time2);
    }
}

