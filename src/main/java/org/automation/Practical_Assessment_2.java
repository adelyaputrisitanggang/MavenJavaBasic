package org.automation;

import java.util.InputMismatchException;
import java.util.Scanner;

// Kelas dasar Season
abstract class Season {
    protected String name;

    // Konstruktor
    public Season(String name) {
        this.name = name;
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract void describeSeason();
}

// Subkelas Spring
class Spring extends Season {
    public Spring() {
        super("Musim Semi");
    }

    @Override
    public void describeSeason() {
        System.out.println("Musim Semi adalah musim pembaruan, dengan bunga yang mekar dan suhu yang menghangat.");
    }
}

// Subkelas Summer
class Summer extends Season {
    public Summer() {
        super("Musim Panas");
    }

    @Override
    public void describeSeason() {
        System.out.println("Musim Panas ditandai dengan suhu yang panas dan hari yang lebih panjang.");
    }
}

// Subkelas Autumn
class Autumn extends Season {
    public Autumn() {
        super("Musim Gugur");
    }

    @Override
    public void describeSeason() {
        System.out.println("Musim Gugur dikenal dengan daun yang gugur dan suhu yang lebih dingin.");
    }
}

// Subkelas Winter
class Winter extends Season {
    public Winter() {
        super("Musim Dingin");
    }

    @Override
    public void describeSeason() {
        System.out.println("Musim Dingin ditandai dengan cuaca dingin dan seringkali salju.");
    }
}

public class Practical_Assessment_2 {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Selamat datang di Program Deskripsi Musim!");
        System.out.println("Pilih musim:");
        System.out.println("1. Musim Semi");
        System.out.println("2. Musim Panas");
        System.out.println("3. Musim Gugur");
        System.out.println("4. Musim Dingin");
        System.out.println("5. Keluar");
    }

    public void createSeason(int choice) {
        Season season = null;
        switch (choice) {
            case 1:
                season = new Spring();
                break;
            case 2:
                season = new Summer();
                break;
            case 3:
                season = new Autumn();
                break;
            case 4:
                season = new Winter();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Input tidak valid");
                return;
        }
        if (season != null) {
            season.describeSeason();
        }
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.println("Masukkan pilihan anda: ");
            try {
                int choice = scanner.nextInt();
                createSeason(choice);
                System.out.println();
            } catch (InputMismatchException ime) {
                System.out.println("Silakan masukkan angka yang valid.");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        Practical_Assessment_2 description = new Practical_Assessment_2();
        description.run();
    }
}
