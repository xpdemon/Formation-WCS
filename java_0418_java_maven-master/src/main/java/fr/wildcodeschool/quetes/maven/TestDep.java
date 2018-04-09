package fr.wildcodeschool.quetes.maven;

import org.apache.commons.text.similarity.LevenshteinDistance;

public class TestDep {

    public static void main(String... args) {
        String s1 = "Wild Code School";
        String s2 = "Wild Wild West";

        System.out.printf("The distance between %s and %s is %d", s1, s2,
                LevenshteinDistance.getDefaultInstance().apply(s1, s2));
        System.out.println();
    }
}
