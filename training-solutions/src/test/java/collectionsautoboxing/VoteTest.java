package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    @Test
    void getResult() {
        Vote v = new Vote();
        Map<String,VoteResult> votes = new HashMap<>();
        votes.put("A",VoteResult.NO);
        votes.put("B",VoteResult.YES);
        votes.put("V",VoteResult.ABSTAIN);
        votes.put("C",VoteResult.ABSTAIN);
        votes.put("G",VoteResult.NO);
        votes.put("F",VoteResult.YES);
        votes.put("J",VoteResult.NO);
        votes.put("K",VoteResult.ABSTAIN);
        votes.put("L",VoteResult.YES);
        votes.put("I",VoteResult.NO);
        votes.put("Z",VoteResult.YES);

        assertEquals(4,v.getResult(votes).get(VoteResult.YES));
        assertEquals(4,v.getResult(votes).get(VoteResult.NO));
        assertEquals(3,v.getResult(votes).get(VoteResult.ABSTAIN));


    }
}