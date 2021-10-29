package ru_sapteh.dao;

import java.sql.SQLException;
import java.util.List;

public interface Dao <Entity, Key> {
    Entity findById (Key key) throws SQLException;
    List<Entity> findAll() throws SQLException;
    void save (Entity entity);
    void update(Entity entity);
    void deleteById(Key key);
}
