import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class BabyPopularity {
    public static void main(String[] args) {
        ArrayList<BabyRanking>[] rankingYear = new ArrayList[10];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter year: ");
            int year = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter gender: ");
            char gender = scanner.nextLine().charAt(0);
            if(rankingYear[year - 2001] != null) {
                System.out.println("Year " + year + " cached already");
                printBaby(rankingYear[year - 2001], name, gender);
            } else {
                rankingYear[year - 2001] = new ArrayList<>();
                try {
                    URL url = new URL("http://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt");
                    Scanner fileReader = new Scanner(url.openStream());
                    while (fileReader.hasNext()) {
                        int rank = fileReader.nextInt();
                        String babyName = fileReader.next();
                        int usage = fileReader.nextInt();
                        rankingYear[year - 2001].add(new BabyRanking(rank, babyName, 'M', usage));
                        babyName = fileReader.next();
                        usage = fileReader.nextInt();
                        rankingYear[year - 2001].add(new BabyRanking(rank, babyName, 'F', usage));
                    }
                    fileReader.close();
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                printBaby(rankingYear[year - 2001], name, gender);
            }
        }
    }

    private static void printBaby(ArrayList<BabyRanking> babyRanking, String name, char gender) {
        for(BabyRanking baby : babyRanking) {
            if(baby.name.equals(name) && baby.gender == gender) {
                System.out.println("Baby " + name + " with gender "
                        + (gender == 'M' ? "male" : "female") + " ranked " + baby.rank + " usage " + baby.usage);
                return;
            }
        }
        System.out.println("Name not found");
    }
}

class BabyRanking {
    int rank;
    String name;
    char gender;
    int usage;

    public BabyRanking(int rank, String name, char gender, int usage) {
        this.rank = rank;
        this.name = name;
        this.gender = gender;
        this.usage = usage;
    }
}