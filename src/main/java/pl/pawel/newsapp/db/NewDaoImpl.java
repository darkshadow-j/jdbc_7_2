package pl.pawel.newsapp.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.pawel.newsapp.apiclient.NewsAPI;
import pl.pawel.newsapp.model.News;
import pl.pawel.newsapp.model.Result;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class NewDaoImpl implements NewsDAO {

    JdbcTemplate jdbcTemplate;
    @Autowired
    NewsAPI newsAPI;

    @Autowired
    public NewDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void updateNews() {
        News news = newsAPI.getNews();
        String sql = "INSERT INTO news value (?, ?, ?)";
        for (Result rs : news.getResults()) {
            try {
                jdbcTemplate.update(sql, rs.getId(), rs.getTitle(), rs.getUrl());
            } catch (DataIntegrityViolationException e) {
                System.out.println("News istnieje");
            }
        }

    }

    @Override
    public List<Result> getAllNews() {
        List<Result> newsList = new ArrayList<>();
        String sql = "select * from news";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        maps.stream().forEach(p -> newsList.add(new Result(Long.parseLong(String.valueOf(p.get("id"))), String.valueOf(p.get("url")), String.valueOf(p.get("title")))));
        return newsList;
    }

    @Override
    public void updateNews(Result result) {

        String sql = "UPDATE news SET title=? where id=?";
        jdbcTemplate.update(sql, result.getTitle(), result.getId());

    }
}
