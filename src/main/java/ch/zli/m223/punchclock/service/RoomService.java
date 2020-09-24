package ch.zli.m223.punchclock.service;


import ch.zli.m223.punchclock.domain.Room;
import ch.zli.m223.punchclock.repository.RoomRepository;
import org.jvnet.hk2.annotations.Service;

import java.util.List;

@Service
public class RoomService {


    private RoomRepository roomRepository;


    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    //Just for running it
    public RoomService() {

    }


    public Room createRoom(Room room) {
        return roomRepository.saveAndFlush(room);
    }

    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    public void deleteRoom(long id) { roomRepository.deleteById(id); }

    public Room updateRoom(Room room) {
        return roomRepository.save(room);
    }

}
