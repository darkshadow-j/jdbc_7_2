package pl.pawel.newsapp.db;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UpdateDB {

        NewsDAO newsDAO;

    public UpdateDB(NewsDAO newsDAO) {
        this.newsDAO = newsDAO;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void UpdateNews(){
        newsDAO.updateNews();
    }
}
