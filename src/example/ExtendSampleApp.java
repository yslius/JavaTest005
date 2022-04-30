package example;

public class ExtendSampleApp {
    public static void main(String[] args) {
        Cat tama = new Cat("タマ", 3);

        tama.eat();
        tama.introduceMyself();
        tama.setAge(4);
        tama.introduceMyself();

        Dog pochi = new Dog("ポチ", 5); // Dogクラスをインスタンス化

        pochi.eat(); // eat()メソッドを呼び出し
        pochi.introduceMyself(); // introduceMyself()メソッドを呼び出し
    }
}