package es.adt.business.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
public class Response {

    private ResponseInfo info;
    private List<Character> results;

}
