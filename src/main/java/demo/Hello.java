package demo;

public class Hello {

  public static void main(String[] args) {
    Core core = new Core();
    DaggerCoreComponent.create().inject(core);
    core.hello("dagger");
  }

}
