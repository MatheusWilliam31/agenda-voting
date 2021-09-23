package br.com.mloose.agendavoting.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "VOTES")
public class Votes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NEGATIVE_VOTES")
    private int negativeVotes;

    @Column(name = "POSITIVE_VOTES")
    private int positiveVotes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ASSOCIATE_ID", nullable = false)
    private Associates associate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCHEDULE_ID", nullable = false)
    private Schedules schedule;

}
