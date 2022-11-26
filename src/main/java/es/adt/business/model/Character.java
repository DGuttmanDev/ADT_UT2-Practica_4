package es.adt.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
public class Character {


    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private CharacterOrigin origin;
    private CharacterLocation location;
    private String image;
    private List<String> episode;
    private String url;
    private String created;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Character{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", Episodes count: ").append(episode.size()).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", species='").append(species).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", origin=").append(origin);
        sb.append(", location=").append(location);
        sb.append(", image='").append(image).append('\'');
        sb.append(", episode=").append(episode);
        sb.append(", url='").append(url).append('\'');
        sb.append(", created='").append(created).append('\'');
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }
}
