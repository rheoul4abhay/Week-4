package MapInterface.votingSystem;

import java.util.*;

public class VotingSystem {
    public Map<String, Integer> voteMap = new HashMap<>();
    public Map<String, Integer> orderedVoteMap = new LinkedHashMap<>();
    public Map<String, Integer> sortedVoteMap = new TreeMap<>();

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderedVoteMap.put(candidate, orderedVoteMap.getOrDefault(candidate, 0) + 1);
        sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayVotes() {
        System.out.println("Votes (Unordered): " + voteMap);
    }

    public void displayVotesInOrder() {
        System.out.println("Votes (Ordered by Cast Time): " + orderedVoteMap);
    }

    public void displayVotesSorted() {
        System.out.println("Votes (Sorted by Candidate Name): " + sortedVoteMap);
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");

        system.displayVotes();
        system.displayVotesInOrder();
        system.displayVotesSorted();
    }
}