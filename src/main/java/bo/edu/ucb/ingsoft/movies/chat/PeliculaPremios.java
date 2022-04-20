//import bo.edu.ucb.ingsoft.movies.bl.ShowPeliculasPremios;
//import bo.edu.ucb.ingsoft.movies.chat.AbstractProcess;
//import bo.edu.ucb.ingsoft.movies.chat.MenuProcessImpl;
//import bo.edu.ucb.ingsoft.movies.chat.MoviesLongPollingBot;
//import bo.edu.ucb.ingsoft.movies.dto.PremiosList;
//import org.telegram.telegrambots.meta.api.objects.Update;
//
//import java.util.List;
//
//public class PeliculaPremios extends AbstractProcess  {
//
//
//    public PeliculaPremios() {
//        this.setName("Consultar premios oscares");
//        this.setDefault(false);
//        this.setExpires(false);
//        this.setStartDate(System.currentTimeMillis()/1000);
//        //this.setUserData(new HashMap<>());
//        this.setStatus("STARTED");
//    }
//
//
//
//    @Override
//    public AbstractProcess handle(Update update, MoviesLongPollingBot bot) {
//        Long chatId = update.getMessage().getChatId();
//        ShowPeliculasPremios showPeliculasPremios = new ShowPeliculasPremios();
//        List<PremiosList> permissionList = showPeliculasPremios.findLast10PermissionsByChatId(chatId);
//        StringBuffer sb = new StringBuffer();
//        sb.append("Esta es la lista de premios:\r\n\r\n " ).append(permissionList.size());
//        sb.append("PRESIONA CUALQUIER TECLA PARA VOLVER\r\n\r\n " );
//        for(PremiosList permission: permissionList) {
//            sb.append(permission.toString()).append("\n\r");
//        }
//        sendStringBuffer(bot, chatId, sb);
//        return new MenuProcessImpl();
//    }
//
//    @Override
//    public AbstractProcess onError() {
//        return null;
//    }
//
//    @Override
//    public AbstractProcess onSuccess() {
//        return null;
//    }
//
//    @Override
//    public AbstractProcess onTimeout() {
//        return null;
//    }
//
//
//
//
//
//
//
//
//}