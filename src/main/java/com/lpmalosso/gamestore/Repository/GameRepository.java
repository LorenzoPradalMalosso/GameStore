package com.lpmalosso.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.lpmalosso.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game,Integer>{
    
}
