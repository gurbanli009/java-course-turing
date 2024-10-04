package az.edu.turing.module01.lesson2;

public class Player {
    private int id;
    private String name;
    private int age;
    private int score;
    private boolean isFemale;

    public Player(int id, String name, int age, int score, boolean isFemale) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.isFemale = isFemale;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", isFemale=" + isFemale +
                '}';
    }
}
