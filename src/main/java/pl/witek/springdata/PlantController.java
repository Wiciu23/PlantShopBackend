package pl.witek.springdata;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.witek.springdata.domain.PlantItem;
import pl.witek.springdata.repository.PlantService;

import java.util.List;

@RestController
@RequestMapping("/api/plants")
public class PlantController {

    @Autowired
    private PlantService plantService;

    @GetMapping
    public List<PlantItem> findAll(){
        return plantService.findAll();
    }

    @GetMapping("/{id}")
    public PlantItem findById(@PathVariable String id){
        return plantService.findById(id);
    }

    @PostMapping
    public PlantItem create(@RequestBody PlantItem toDo){
        return plantService.save(toDo);
    }

    @PutMapping
    public PlantItem update(@RequestBody PlantItem toDo){
        return plantService.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        plantService.deleteById(id);
    }

}