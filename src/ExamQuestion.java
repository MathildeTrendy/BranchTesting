//  1. Lav en klasse: ExamQuestion med attributterne number og grade

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class ExamQuestion {

    private int number;
    private char grade;


// 2. Tilføj en metode der sætter grade random til enten A, B, C, D, E eller F.

    public char randomGrade() {
        Random random = new Random(); //laver Random objekt, da den datatype indeholder formlen for at sætte noget til random
        char result = (char) ('A' + random.nextInt(6));
        return result;
    }
/* 3. Implementer funktionalitet til at oprette en liste af 14 nummererede (fra 1 til 14) examquestions –
      hver med en tilfældig karakter. Udskriv listen til skærmen og til en fil “questions.txt”. */







    public static void main(String[] args) {
        ExamQuestion examQuestion = new ExamQuestion();
        System.out.println(examQuestion.randomGrade());

        ArrayList<String> numberedSentences = new ArrayList<>();
        Random rand = new Random();
        String[] sentences = {
                "Hej Simone.",
                "Simone, Hej?",
                "Der var du jo, Simone!",
                "Davs, Simone.",
                "Halløj Simone.",
                "Hvon' skærn' Simone?",
                "Mojn Simone.",
                "Hva' så, Simone?",
                "Halli hallo, Simone,",
                "Goddag, Simone,",
                "Hejsa, Simone.",
                "Dav Simone,",
                "Kommer du tit her, Simone?",
                "Hej smukke Simone."
        };
        for (int i = 0; i < sentences.length; i++) {
            char randomChar = (char)(rand.nextInt(6) + 'a');
            numberedSentences.add((i+1) + ". " + sentences[i] + " " + randomChar);
        }

        System.out.println(numberedSentences);
        PrintStream printStream = new PrintStream(System.out);
    }
}



