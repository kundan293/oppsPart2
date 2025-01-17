
abstract class Person {
    abstract void eat();
    abstract void exercise();
}
class Athelate extends Person {
    @Override
    void eat() {
        System.out.println(" Athelate: Athelate person eat ");
    }

    @Override
    void exercise() {
        System.out.println("Athelate person  can Do Exercise");
    }
}
    class LazyPerson extends Person{

        @Override
        void eat() {
            System.out.println(" LazyPerson : can eat ");
        }

        @Override
        void exercise() {
            System.out.println(" LAzy person  never do Exercise ");
        }
    }

