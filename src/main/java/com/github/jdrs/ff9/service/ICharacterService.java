package com.github.jdrs.ff9.service;

import com.github.jdrs.ff9.entity.Character;

import java.util.List;

public interface ICharacterService {
    public List<Character> getAllCharacters();
    public Character getCharacter(String id);
    public Character addCharacter(Character character);
}
