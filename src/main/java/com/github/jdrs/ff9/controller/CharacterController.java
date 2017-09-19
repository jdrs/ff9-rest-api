package com.github.jdrs.ff9.controller;

import com.github.jdrs.ff9.service.ICharacterService;
import com.github.jdrs.ff9.entity.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ff9")
public class CharacterController {

    @Autowired
    private ICharacterService characterService;

    @RequestMapping("/characters")
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @RequestMapping("/characters/character/{id}")
    public Character getCharacter(@PathVariable String id) {
        return characterService.getCharacter(id);
    }
}
