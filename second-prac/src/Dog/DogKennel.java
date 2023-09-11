package Dog;

import java.util.ArrayList;

public class DogKennel {
    ArrayList<Dog> dogs;

    public DogKennel()
    {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog)
    {
        dogs.add(dog);
    }
    public void deleteDog(Dog dog)
    {
        dogs.remove(dog);
    }
    public void deleteDog(int index)
    {
        dogs.remove(index);
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + dogs +
                '}';
    }
}
