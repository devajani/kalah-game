package com.self.kalahgame.data;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
public class Pit {
    private Integer id;

    public void setId(Integer id) {
        if (id > 14 && id <= 0) {
            log.error("Valid pit id range is 1 to 14");
            throw new RuntimeException("Pit Initialization exception");
        }
        this.id = id;
    }
}
