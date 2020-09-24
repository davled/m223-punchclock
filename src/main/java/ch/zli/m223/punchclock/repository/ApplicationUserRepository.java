package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface to the db over the Jpa
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
    }

