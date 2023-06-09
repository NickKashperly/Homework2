package lessson2.Homework2;

public interface Eat {
    String getName();

    int getAppetite();

    int getDrunk();

    default boolean satiety(int weight) {
        if (weight >= getAppetite()) {
            System.out.printf("%s съел и наелся, он хотел съесть %s гр., в миске было %d гр\n ", getName(), getAppetite(), weight);
            return true;
        } else {
            System.out.printf("%s не удалось наесться  %d гр, он хотел бы съесть %d гр. \n", getName(), weight, getAppetite());
            return false;
        }
    }

    default boolean drink(int volume) {
        if (volume >= getDrunk()) {
            System.out.printf("%s напился, он хотел выпить %d мл, в миске было %d мл.\n ", getName(), getDrunk(), volume);
            return true;
        } else {
            System.out.printf("%s не удалось напиться %d мл, он хотел бы выпить %d мл.\n", getName(), volume, getDrunk());
            return false;
        }
    }
}