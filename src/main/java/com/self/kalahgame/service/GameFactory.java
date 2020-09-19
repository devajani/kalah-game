package com.self.kalahgame.service;

import com.self.kalahgame.data.Game;
import com.self.kalahgame.data.Pit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameFactory {
    public Game create() {
        List<Pit> pits = new ArrayList<>(14);
        pits.add(Pit.builder().id(1).build());
        pits.add(Pit.builder().id(2).build());
        pits.add(Pit.builder().id(3).build());
        pits.add(Pit.builder().id(4).build());
        pits.add(Pit.builder().id(5).build());
        pits.add(Pit.builder().id(6).build());
        pits.add(Pit.builder().id(7).build());
        pits.add(Pit.builder().id(8).build());
        pits.add(Pit.builder().id(9).build());
        pits.add(Pit.builder().id(10).build());
        pits.add(Pit.builder().id(11).build());
        pits.add(Pit.builder().id(12).build());
        pits.add(Pit.builder().id(13).build());
        pits.add(Pit.builder().id(14).build());
        return Game.builder().id(1L).pitList(pits).build();
    }
}
