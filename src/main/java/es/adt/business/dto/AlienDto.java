package es.adt.business.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AlienDto {

    private int count;
    private List<String> names;

}
