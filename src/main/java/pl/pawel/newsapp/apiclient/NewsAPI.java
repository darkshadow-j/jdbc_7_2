package pl.pawel.newsapp.apiclient;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.pawel.newsapp.model.News;

@Controller
public class NewsAPI {


    public News getNews() {
        RestTemplate restTemplate = new RestTemplate();
        News news = restTemplate.getForObject("https://api.nytimes.com/svc/mostpopular/v2/shared/1/facebook.json?api-key=u2DI1B7riuOhMvSA8u0aMy2M7NjZ3Z4g", News.class);
        return news;
    }
}


