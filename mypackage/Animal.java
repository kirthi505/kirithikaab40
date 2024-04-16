package mypackage;

class Animal {

  void sound() {
    System.out.println("Animal is making a sound");
  }
}

class Dog extends Animal {

  @Override
  void sound() {
    System.out.println("Dog is barking");
  }

  public static void main(String[] args) {
    Animal a = new Dog(); 
    a.sound(); 
  }
}