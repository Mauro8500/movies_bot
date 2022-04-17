package bo.edu.ucb.ingsoft.movies.bl;

import bo.edu.ucb.ingsoft.movies.dao.PermissionDao;
import bo.edu.ucb.ingsoft.movies.dto.PermissionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionBl {

    private PermissionDao permissionDao;

    @Autowired
    public PermissionBl(PermissionDao permissionDao) {
        this.permissionDao = permissionDao;
    }

    public List<PermissionDto> findLast10PermissionsByChatId(Long chatId) {
        return permissionDao.findAllPermissionByBotChatId(chatId+"");
    }
}