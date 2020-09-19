package com.self.kalahgame.data;

import com.self.kalahgame.service.GameFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;

class GameFactoryTest {
    @InjectMocks
    GameFactory gameFactory;

    @BeforeEach
    void setUp(){
        gameFactory = new GameFactory();
    }

    @Test
    void when_create_game_then_game_created(){
        Game game = gameFactory.create();
        assertThat(game.getId()).isNotNull();
        assertThat(game.getPitList()).isNotEmpty();
        assertThat(game.getPitList().size()).isEqualTo(14);
    }
}
