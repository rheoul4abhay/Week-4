package MapInterfaceTests;

import MapInterface.votingSystem.VotingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class VotingSystemTest {
    private VotingSystem system;

    @BeforeEach
    void setUp() {
        system = new VotingSystem();
    }

    @Test
    void testCastVote() {
        system.castVote("Alice");
        assertTrue(system.voteMap.containsKey("Alice"));
        assertEquals(1, system.voteMap.get("Alice"));
    }

    @Test
    void testMultipleVotes() {
        system.castVote("Alice");
        system.castVote("Alice");
        system.castVote("Bob");
        assertEquals(2, system.voteMap.get("Alice"));
        assertEquals(1, system.voteMap.get("Bob"));
    }

    @Test
    void testVoteOrder() {
        system.castVote("Charlie");
        system.castVote("Alice");
        system.castVote("Bob");

        List<String> expectedOrder = Arrays.asList("Charlie", "Alice", "Bob");
        assertEquals(expectedOrder, new ArrayList<>(system.orderedVoteMap.keySet()));
    }

    @Test
    void testSortedVotes() {
        system.castVote("Charlie");
        system.castVote("Alice");
        system.castVote("Bob");

        List<String> expectedSortedOrder = Arrays.asList("Alice", "Bob", "Charlie");
        assertEquals(expectedSortedOrder, new ArrayList<>(system.sortedVoteMap.keySet()));
    }
}