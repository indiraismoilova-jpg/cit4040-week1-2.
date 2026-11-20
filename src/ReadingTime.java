public class ReadingTime {
    public static void main(String[] args) {
        System.out.println("100 pages -> " + readingTime(100) + " min");
        System.out.println("500 pages -> " + readingTime(500) + " min");
        System.out.println("800 pages -> " + readingTime(800) + " min");
    }

    static int readingTime(int pages) {
        return pages * 2;
    }
}
