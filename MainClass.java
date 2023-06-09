package lessson2.Homework2;

public class MainClass {
    public static void main(String[] args) {
        Eat[] eats = {
                new Cat("Percik", 10, 100),
                new Cat("Matroskin", 20, 250),
                new Cat("Charli", 56, 350),
                new Cat("Vasy", 10, 50)
        };

        Fooood[] foooods = {
                new Water(50),
                new Whiskas(50),
                new Water(150),
                new Whiskas(200),
                new Water(200),
                new Whiskas(20),
                new Water(450),
                new Whiskas(300)

        };

        for (Eat eat : eats){
            for (Fooood fooood : foooods){
                if (fooood instanceof Whiskas){
                    if (!eat.satiety(fooood.getWeight()))
                        break;
                }
                else if (fooood instanceof Water){
                    if (!eat.drink( fooood.getVolume()))
                        break;
                }
            }
        }
    }
}