package vargas.angel.movieDatabase.models;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Container(containerName = "movies", ru = "400")
public class Movie {
    @Id
    @GeneratedValue
    @PartitionKey
    private String id;

    private String name;
    private String description;
    private int calification;


    public Movie() {
    }


    public Movie(String name, String description, int calification) {
        this.name = name;
        this.description = description;
        this.calification = calification;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }

    @Override
    public String toString() {
        return this.name + " " + this.description + " " + this.calification;
    }
}