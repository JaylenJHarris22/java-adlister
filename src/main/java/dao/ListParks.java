package dao;

import models.NationalPark;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListParks implements NationalParkDao{
    private List<NationalPark> parks = new ArrayList<>();

    public ListParks(){
        insert( new NationalPark(1L, "Badlands", "South Dakota", LocalDate.parse("1978-11-10"), "Badlands National Park contains one of the world’s richest fossil beds, permitting scientists to study the evolution of mammal species such as the horse, rhino and saber-toothed cat. From tiny shrews to 2,000-pound bison, the Badlands is home to many species of mammals, reptiles, amphibians, birds and butterflies."));
        insert( new NationalPark(2L, "Glacier", "Montana", LocalDate.parse("1910-05-11"), "Glacier National Park is a 1,583-sq.-mi. wilderness area in Montana's Rocky Mountains, with glacier-carved peaks and valleys running to the Canadian border. It's crossed by the mountainous Going-to-the-Sun Road. Among more than 700 miles of hiking trails, it has a route to photogenic Hidden Lake."));
        insert( new NationalPark(3L, "Sequoia", "California", LocalDate.parse("1890-09-25"), "Sequoia National Park is adjacent to Kings Canyon National Park in California's southern Sierra Nevada mountains. It's known for its huge sequoia trees, notably the General Sherman Tree dominating the Giant Forest. The underground Crystal Cave features streams and striking rock formations. Moro Rock is a granite dome offering sweeping park views. Nearby is the Tunnel Tree, a toppled tree cut to accommodate the road."));
    }

    @Override
    public List<NationalPark> all() {
        return this.parks;
    }

    @Override
    public void insert(NationalPark nationalPark) {
        this.parks.add(nationalPark);
    }

    @Override
    public void delete(long parkId) {
        this.parks.remove(((int) parkId) - 1);
    }
}
