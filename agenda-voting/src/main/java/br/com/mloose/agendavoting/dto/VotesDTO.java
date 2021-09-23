package br.com.mloose.agendavoting.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class VotesDTO implements Serializable {

    private Long id;
    private int negativeVotes;
    private int positiveVotes;
    private AssociatesDTO associate;
    private SchedulesDTO schedule;

}
