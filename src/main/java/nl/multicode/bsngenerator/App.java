package nl.multicode.bsngenerator;

import java.util.Set;


public class App {
    public static void main(String[] args) {
        Integer aantal = Integer.valueOf(args[0]);
        BsnGenerator bsnGenerator = new BsnGenerator();

        Set<String> bsnSet = bsnGenerator.generateRandomBsnNummers(aantal);

        for (String bsn : bsnSet) {
            System.out.println(bsn);
        }
    }
}