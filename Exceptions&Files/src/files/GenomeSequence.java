package files;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class GenomeSequence {
    private static final Random random = new Random();
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("App usage is GenomeSequence adenineNr thymineNr cytosineNr guanineNr");
            System.exit(1);
        }
        File file = new File(TestFileClass.CWD + "/data/genomeSeq.txt");
        int adenine = Integer.parseInt(args[0]);
        int thymine = Integer.parseInt(args[1]);
        int cytosine = Integer.parseInt(args[2]);
        int guanine = Integer.parseInt(args[3]);
        int adenineNr = 0;
        int thymineNr = 0;
        int cytosineNr = 0;
        int guanineNr = 0;
        boolean askForNucleoBases;
        char randomNucleoBase;
        try (PrintWriter printWriter = new PrintWriter(file)) {
            while (adenineNr < adenine || thymineNr < thymine || cytosineNr < cytosine || guanineNr < guanine) {
                askForNucleoBases = true;
                do {
                    randomNucleoBase = getRandomNucleoBase();
                    if (randomNucleoBase == 'A' && adenineNr < adenine) {
                        adenineNr++;
                        askForNucleoBases = false;
                    } else if (randomNucleoBase == 'T' && thymineNr < thymine) {
                        thymineNr++;
                        askForNucleoBases = false;
                    } else if (randomNucleoBase == 'C' && cytosineNr < cytosine) {
                        cytosineNr++;
                        askForNucleoBases = false;
                    } else if (randomNucleoBase == 'G' && guanineNr < guanine) {
                        guanineNr++;
                        askForNucleoBases = false;
                    }
                } while (askForNucleoBases);
                printWriter.print(randomNucleoBase);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (Scanner scanner = new Scanner(file)) {
            String sequence = scanner.nextLine();
            for (int i = 0; i < sequence.length(); i++) {
                switch (sequence.charAt(i)) {
                    case 'A' -> adenine--;
                    case 'T' -> thymine--;
                    case 'G' -> guanine--;
                    case 'C' -> cytosine--;
                }
            }
            if (adenine == 0 && thymine == 0 && guanine == 0 && cytosine == 0)
                System.out.printf("You successfully created a random sequence of %d A, %d T, %d G and %d C%n",
                                                adenineNr, thymineNr, guanineNr, cytosineNr);
            else
                System.out.println("You sequence is not correct!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static char getRandomNucleoBase() {
        return switch (random.nextInt(4)) {
            case 0 -> 'A';
            case 1 -> 'T';
            case 2 -> 'C';
            default -> 'G';
        };
    }
}
