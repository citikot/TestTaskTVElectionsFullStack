package academy.tochkavhoda.elections.dao;

import academy.tochkavhoda.elections.model.Voter;
import academy.tochkavhoda.elections.server.ServerResponse;

public interface VoterDao {
    ServerResponse insert(Voter voter);
    ServerResponse update(Voter voter);
    ServerResponse get(Voter voter);

}
