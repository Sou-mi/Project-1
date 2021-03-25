package com.Soumi;
class Movie
{
    private String name;
    public Movie(String name)
    {
        this.name=name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie
{
    public Jaws()
    {
        super("Jaws");
    }
    public String plot()
    {
        return "A Shark eats lot of people";
    }

}
class independenceDay extends Movie{
    public independenceDay()
    {
        super("Independence Day");
    }
    public String plot()
    {
        return "Aliens attempt to take ovcer the world planet";
    }
}
class MazeRunner extends Movie{
    public MazeRunner()
    {
        super("Maze Runner");
    }
    public String plot(){
        return "Kids try and escape a maze";
    }
}
class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the Universe";
    }
}
class Forgetable extends Movie{
    public Forgetable(String name) {
        super(name);
    }
    //no plot method
}
public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie("Hotel Transalvania");
        System.out.println("The movie name is "+movie.getName());
        System.out.println("the plot is "+movie.plot());
        System.out.println("After calling the child classes-----");
        Jaws movie1=new Jaws();
        System.out.println(movie1.getName());
        System.out.println(movie1.plot());
        Forgetable movie2=new Forgetable("Forgetable");
        System.out.println(movie2.getName()+"\n"+movie2.plot());






	for(int i=1;i<11;i++) {
        Movie movieRand = randomMovie();
        System.out.println("Movie # "+i+" : "+ movieRand.getName()+"\n"+
                             "Plot : "+movieRand.plot()+ "\n");
    }
    }
    public static Movie randomMovie(){
        int randomNumber=(int)(Math.random()*5)+1;
        System.out.println("random number generated is "+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new independenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable("Forgateable");
            default:
                return new Forgetable("Forgetable");
        }

    }
}
