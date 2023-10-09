public class CountLetters {
    public static void main(String[] args) {
        final int TOTAL = 100;
        char[] letters = getRandomLetters(TOTAL);
        System.out.println("Random chars:");
        printLetters(letters);
        int[] counts = countLetters(letters);
        System.out.println("Count display:");
        displayCount(counts);
    }

    public static char[] getRandomLetters(int total) {
        char[] letters = new char[total];
        for (int i = 0; i < total; i++) {
            letters[i] = RandomCharacters.getRandomLowerCaseLetter(); // we have already built this from prev chapter
        }
        return letters;
    }

    public static void printLetters(char[] list) {
        for(char letter : list)
            System.out.print(letter);
        System.out.println();
    }

    public static int[] countLetters(char[] letters) {
        int[] counts = new int[26];
        for(char letter : letters){
            int index = letter - 'a';
            counts[index] += 1;
        }
        return counts;
    }

    public static void displayCount(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) (i+'a') + " occurs " + counts[i] + " times");
            }
        }
    }
}
