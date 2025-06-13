package partC.Task_2;


public class StringPerformanceComparison {

    public static String measureStringConcatTime() {
        long start = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 1_000_000; i++) {
            result += "a";
        }

        long end = System.currentTimeMillis();
        return "Время работы (String): " + (end - start) + " мс";
    }

    public static String measureStringBuilderTime() {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("a");
        }

        String result = sb.toString();

        long end = System.currentTimeMillis();
        return "Время работы (StringBuilder): " + (end - start) + " мс";
    }
}

