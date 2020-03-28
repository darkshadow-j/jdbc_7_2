package pl.pawel.newsapp.db;

import pl.pawel.newsapp.model.News;
import pl.pawel.newsapp.model.Result;

import java.util.List;

public interface NewsDAO {

    public void updateNews();
    public List<Result> getAllNews();
    public void updateNews(Result result);
}
