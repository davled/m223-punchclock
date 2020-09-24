package ch.zli.m223.punchclock.controller;


import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.Room;
import ch.zli.m223.punchclock.service.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    private RoomService roomService;

    public RoomController(RoomService roomService) {this.roomService = roomService;};

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Room> getAllRooms() {
        return roomService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Room createRoom(@Valid @RequestBody Room room) {
        return roomService.createRoom(room);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEntry(@PathVariable long id) {
        roomService.deleteRoom(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Room updateEntry(@Valid @RequestBody Room room, @PathVariable String id) {
        return roomService.updateRoom(room);
    }
}
