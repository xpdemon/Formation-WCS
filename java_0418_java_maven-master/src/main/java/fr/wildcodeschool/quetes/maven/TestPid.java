package fr.wildcodeschool.quetes.maven;

public class TestPid {

    public static void main(String... args) {
        System.out.println("PID du programme: " + ProcessHandle.current().pid());
    }
}
