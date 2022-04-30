package example;

public class ExtendsAndImplimentsSampleApp {
    public static void main(String[] args) {
        Pet tama = new Cat("タマ", 3);

        tama.eat();
        tama.introduceMyself();

        Pet pochi = new Dog("ポチ", 5);

        pochi.introduceMyself();
        pochi.eat();
    }
}
