package dao;

import models.NationalPark;

import java.util.List;

public interface NationalParkDao {
    List<NationalPark> all();
    void insert(NationalPark nationalPark);

    void delete(long parkId);
}
