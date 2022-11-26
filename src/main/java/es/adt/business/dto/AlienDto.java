package es.adt.business.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class AlienDto {

    private int count;
    private List<String> names;

}
