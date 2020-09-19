package com.self.kalahgame.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Game {
    private Long id;
    private List<Pit> pitList;
}
