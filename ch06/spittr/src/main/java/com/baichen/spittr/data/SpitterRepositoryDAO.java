package com.baichen.spittr.data;

import com.baichen.spittr.Spitter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SpitterRepositoryDAO implements SpitterRepository {
    private List<Spitter> spitters = new ArrayList<>();

    @Override
    public Spitter save(Spitter spitter) {
        spitters.add(spitter);
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        for (Spitter spitter : spitters) {
            if (spitter.getUsername().equals(username)) {
                return spitter;
            }
        }
        return new Spitter("The User Does Not Exist!", null, null, null);
    }
}