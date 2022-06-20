package pl.witek.springdata.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.witek.springdata.domain.PlantItem;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PlantService {

    @Autowired
    ItemRepository itemRepository;

    public List<PlantItem> findAll(){
        return itemRepository.findAll();
    }

    public PlantItem findById(String id){
        return itemRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public PlantItem save(PlantItem plant){
        return itemRepository.save(plant);
    }

    public void deleteById(String id){
        itemRepository.deleteById(id);
    }
}
