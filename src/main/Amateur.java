package main;

public class Amateur extends Participant{


    public Amateur(String nom, int score) {
        super(nom, score);
    }

    @Override
    public String toString() {
        return "Amateur{" +
         "Nom = " + getNom() + '\n' +
                ",Score" + getScore() +
                 "\n"+'}' ;
    }
}

