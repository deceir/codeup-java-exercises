public class ServerNameGenerator {


    public static String[] adjectives = {"better", "calm", "clever", "defiant", "difficult", "gifted", "graceful", "open", "pleasant", "perfect", "misty", "proud", "shiny", "stormy", "splendid"};
    public static String[] nouns = {"art", "map", "way", "system", "ability", "story", "fact", "data", "variety", "security", "policy"};


    public static int randomNumber(int maximum) {
        return (int)(Math.random() * maximum) + 0;
    }

    public static String generateName() {
        int adjRandom = randomNumber(adjectives.length);
        int nounRandom = randomNumber(nouns.length);
        return adjectives[adjRandom] + "-" + nouns[nounRandom];
    }

    public static void main(String[] args) {

        System.out.println(generateName());

    }
}
