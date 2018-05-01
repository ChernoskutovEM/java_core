package ru.geekbrains.java2.lesson1.l1.homework.competitors;

public class Team {
    private String title;
    private Competitor[] competitors;

    public Team(String title, Competitor... competitors){
        this.title = title;
        this.competitors = competitors;

    }

    public Competitor[] getCompetitors() {
        return competitors;
    }
    public void showResult(){
        System.out.println(title + " ");
        for(Competitor c : competitors){
            if(c.isOnDistance()){
                c.showResult();
            }
        }
    }
}
