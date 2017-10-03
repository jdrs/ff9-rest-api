package com.github.jdrs.ff9.service;

import com.github.jdrs.ff9.dao.ICharacterDao;
import com.github.jdrs.ff9.entity.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements ICharacterService {

    @Autowired
    private ICharacterDao characterDao;

    @Override
    public Character getCharacter(String id) {
        return characterDao.getCharacter(id);
    }

    @Override
    public List<Character> getAllCharacters() {
        return characterDao.getAllCharacters();
    }

    @Override
    public Character addCharacter(Character character) {
        return characterDao.addCharacter(character);
    }
}
