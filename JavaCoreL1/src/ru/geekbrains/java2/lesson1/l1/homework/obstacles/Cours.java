package ru.geekbrains.java2.lesson1.l1.homework.obstacles;

import ru.geekbrains.java2.lesson1.l1.homework.competitors.Competitor;
import ru.geekbrains.java2.lesson1.l1.homework.competitors.Team;

public class Cours {
    private Obstacle[] obstacles;

    public Cours(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for (Competitor c : team.getCompetitors()) {
            for (Obstacle o : obstacles){
                o.doIt(c);
            }
        }
    }
}
