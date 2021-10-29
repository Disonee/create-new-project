package ru_sapteh;

import ru_sapteh.dao.Dao;
import ru_sapteh.dao.impl.AutoDaolml;
import ru_sapteh.model.Auto;
import ru_sapteh.util.Connector;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main (String[]args) throws SQLException {
        Connection connection = Connector.getInstance();
        Dao<Auto, Integer> autoDao = new AutoDaolml(connection);

        System.out.println(autoDao.findById(1));

        autoDao.findAll().forEach(System.out::println);

        autoDao.save(new Auto("Oka", "Lada", "Sedan", "Fuel"));

        Auto autoUpdater = autoDao.findById(1);

        autoUpdater.setModel("chevrolet");
        autoUpdater.setMark("Komaro");
        autoUpdater.setBody_type("Sedan");
        autoUpdater.setType_gasoline("Fuel");

        autoDao.update(autoUpdater);

        autoDao.deleteById(7);

        Connector.close (connection);


    }
}
