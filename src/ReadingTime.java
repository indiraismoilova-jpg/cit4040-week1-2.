public class ReadingTime {
    public static void main(String[] args) {
        System.out.println("100 pages -> " + readingTime(100) + " min");
        System.out.println("500 pages -> " + readingTime(500) + " min");
        System.out.println("800 pages -> " + readingTime(800) + " min");
    }
    // A book of exactly 500 pages gets no fatigue adjustment because the rule applies only to books over 500 pages.
    static int readingTime(int pages) {
        int minutes = pages * 2;

        if (pages > 500) {
            minutes = minutes + minutes / 10;
        }

        return minutes;
    }
}
