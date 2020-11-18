
public class Penguin extends Animal {
    // here Penguin inherits species and sound, and can now be overwritten to fit a
    // penguin

    // these methods are overridden here
    public void AnimalSpecies() {
        {
            System.out.println("This is a penguin.");
        }
    }

    public void SpeciesNoise() {
        System.out.println("Penguins growl.");
    }

    // here the penguin gets its own class for swimming
    public void PenguinSwims() {
        System.out.println("The penguin can swim fast!");
    }

}
