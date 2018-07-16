package org.academiadecodigo.bootcamp.model.model.services;

import org.academiadecodigo.bootcamp.model.model.model.TravelsModel;
import java.util.List;

public interface TravelsService {


    TravelsModel get(String destination);

    void remove (String destination);

    List<TravelsModel> list();

    void add(TravelsModel travelsModel);
}
