package pl.witek.springdata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.witek.springdata.domain.PlantItem;

public interface ItemRepository extends MongoRepository<PlantItem, String> {
    /*
    @Query("{name:'?0'}")
    PlantItem findPlantItemBy(String name);

    @Query(value ="{category:'?0'}", fields="{'name': 1, 'quantity': 1}")
    List<PlantItem> findAllBy(String category);

    public long count();

     */

}
