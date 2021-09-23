package br.com.mloose.agendavoting.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SchedulesDTO implements Serializable {

    private Long id;
    private String title;
    private String description;

}
