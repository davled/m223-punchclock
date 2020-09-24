package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface to the db over the Jpa
public interface RoomRepository extends JpaRepository <Room, Long> {
}
