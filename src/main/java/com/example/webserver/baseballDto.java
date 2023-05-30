package com.example.webserver;

import lombok.Data;

@Data
public class baseballDto {

    private int idx;
    private String team;

    private String image;
    private String slogan;

    private String member;



    public baseballDto(int idx, String team,String image,String slogan, String member){
        this.idx=idx;
        this.team=team;
        this.image=image;
        this.slogan=slogan;
        this.member=member;

    }


    @Override
    public String toString() {
        return "baseballDto{" +
                "idx=" + idx +
                ", team='" + team + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

}
