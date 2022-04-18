package bo.edu.ucb.ingsoft.movies.bl;

import bo.edu.ucb.ingsoft.movies.dto.PermissionDto;

import java.util.ArrayList;
import java.util.List;

public class PermissionBl {

    public PermissionBl() {
    }

    public List<PermissionDto> findLast10PermissionsByChatId(Long chatId) {
        List<PermissionDto> result = new ArrayList<>();
        result.add(new PermissionDto("Will", "Smith"));
        result.add(new PermissionDto("John", "Krasinsky"));
        result.add(new PermissionDto("Billy", "Murray"));
        result.add(new PermissionDto("Ewan", "McGregor"));
        result.add(new PermissionDto("Robbie", "Williams"));
        result.add(new PermissionDto("Silvester", "Stalone"));
        result.add(new PermissionDto("Samuel", "Jackson"));
        result.add(new PermissionDto("Mark", "Hamill"));
        return result;
    }
}
