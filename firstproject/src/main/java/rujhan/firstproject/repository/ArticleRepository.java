package rujhan.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import rujhan.firstproject.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
