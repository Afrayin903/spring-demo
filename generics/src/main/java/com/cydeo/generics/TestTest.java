package com.cydeo.generics;

public class TestTest {
    public static void main(String[] args) {
        FooballPlayer joe = new FooballPlayer("joe");
        BasebalPlayer pat = new BasebalPlayer("Pat");
        SoccerPlayer salah = new SoccerPlayer("Salah");

        Team <SoccerPlayer>liverpool = new Team<>("Liverpool");
        liverpool.addPlayer(salah);
        System.out.println(liverpool.numPlayers());

    }
}
