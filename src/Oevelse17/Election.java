package Oevelse17;
import java.util.ArrayList;
import java.util.List;

public class Election {


    private ArrayList<Candidate> candidates;

    public Election() {
        candidates = new ArrayList<>();
    }

    public int getTotalVotes() {
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getNumberOfVotes();
        }
        return totalVotes;
    }

    public List<Candidate> getCandidatesFromParty(String party) {
        List<Candidate> partyCandidates = new ArrayList<>();
        for (Candidate candidate : candidates) {
            if (candidate.getParty().equals(party)) {
                partyCandidates.add(candidate);
            }
        }
        return partyCandidates;
    }


    public static void main(String[] args) {

        Candidate LiseHeriette = new Candidate("Lise Henriette","To The Left",32);
        Candidate TroelHandberg = new Candidate("Troel Handberg","Stram Kurs",0);
        Candidate FinnPølseskind = new Candidate("Finn Pølseskind","Ærligfolket",509);


        System.out.println(());
    }
}
