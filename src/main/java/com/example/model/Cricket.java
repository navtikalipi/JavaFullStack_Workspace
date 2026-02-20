package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Cricket {
    private int teamId;
    private int noOfPlayers;
    private String teamName;


}
