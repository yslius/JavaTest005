package example;

public class Animal {
  private String name;
  private int age;
  private boolean hungry;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;

    System.out.println("コンストラクター:Animal(String name, int age)が呼び出された");
    System.out.println("  引数：name=" + name + ", age=" + age);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setHungry(boolean hungry) {
    this.hungry = hungry;
  }

  public boolean isHungry() {
    return hungry;
  }

  protected void printMessage(String message) {
    System.out.println(name + "> " + message);
  }

  public void introduceMyself(){
    printMessage("名前は" + getName() + "です、" + getAge() + "歳です。");
  }
}
