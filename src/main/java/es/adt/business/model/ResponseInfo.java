package es.adt.business.model;

import lombok.*;

@Getter
@Setter
@ToString
public class ResponseInfo {

    private int count;
    private int pages;
    private String next;
    private String prev;

}
