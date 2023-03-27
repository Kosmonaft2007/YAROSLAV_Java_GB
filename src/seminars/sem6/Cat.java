package sem6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
) архивом выставки котов
 */
public class Cat {
    private String name;
    private String breed;
    private String color;
    private LocalDate birthDate;
    private List<Award> awards;
    private String owner;

    public Cat(String name, String breed, String color, LocalDate birthDate, String owner) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.birthDate = birthDate;
        this.owner = owner;
        this.awards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", birthDate=" + birthDate +
                ", awards=" + awards +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (!Objects.equals(name, cat.name)) return false;
        if (!Objects.equals(breed, cat.breed)) return false;
        if (!Objects.equals(color, cat.color)) return false;
        if (!Objects.equals(birthDate, cat.birthDate)) return false;
        if (!Objects.equals(awards, cat.awards)) return false;
        return Objects.equals(owner, cat.owner);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (awards != null ? awards.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }

    public void addAward(Award award) {
        awards.add(award);
    }


}
