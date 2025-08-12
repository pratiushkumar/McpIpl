package com.patty.schedule_ipl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Match {
private int Matchnumber;
private int MatchDay;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
private LocalDate date;
    private String Day;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
    private LocalDate starttime;

    private String HomeTeam;
    private String AwayTeam;
//    private String Top4;
//    private String bottom6;
    private String venue;
    private String matchType;

}
