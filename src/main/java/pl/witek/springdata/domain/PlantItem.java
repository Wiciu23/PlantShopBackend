package pl.witek.springdata.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
public class PlantItem {
    @Id
    private String id;

    private String name;
    private String category;
    private int quantity;
    private int prize;

    public PlantItem(String id, String name, String category, int quantity, int prize){
        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getPrize() {
        return prize;
    }


}
