package bo.edu.ucb.ingsoft.movies.bl;

import bo.edu.ucb.ingsoft.movies.dto.ActorsList;
import java.util.ArrayList;
import java.util.List;

public class ShowActors {

    public ShowActors() {
    }

    public List<ActorsList> findLast10PermissionsByChatId(Long chatId) {
        List<ActorsList> result = new ArrayList<>();
        result.add(new ActorsList("1. Will", "Smith"));
        result.add(new ActorsList("2. John", "Krasinsky"));
        result.add(new ActorsList("3. Ewan", "McGregor"));
        result.add(new ActorsList("4. Mark", "Hamill"));
        return result;
    }
}
