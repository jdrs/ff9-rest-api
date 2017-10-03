package com.github.jdrs.ff9.dao;

import java.util.List;
import com.github.jdrs.ff9.entity.Character;

public interface ICharacterDao {
    public List<Character> getAllCharacters();
    public Character getCharacter(String id);
    public Character addCharacter(Character character);
}
