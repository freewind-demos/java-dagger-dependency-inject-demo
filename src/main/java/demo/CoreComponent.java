package demo;

import dagger.Component;

@Component
public interface CoreComponent {
  void inject(Core core);
}
