package com.baichen.spittr.data;

import com.baichen.spittr.Spitter;

public interface SpitterRepository {
    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}
