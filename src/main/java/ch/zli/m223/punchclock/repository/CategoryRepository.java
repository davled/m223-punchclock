package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface to the db over the Jpa
public interface CategoryRepository extends JpaRepository <Category, Long> {
}
