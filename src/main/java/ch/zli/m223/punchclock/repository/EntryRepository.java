package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface to the db over the Jpa
public interface EntryRepository extends JpaRepository<Entry, Long> {
}
