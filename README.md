Java Dagger Dependency Inject Demo
=====================

Dagger是一个编译期解决Dependency Injection的库，通过一些编译插件生成相应的源代码供使用。

相比guice，它可以提前发现错误，debug时也能定位到源代码。

但是，在Maven+Java+Idea中使用体验不佳，因为
1. pom.xml中配置比较麻烦（还需要指定生成的源代码目录，好在Idea可以识别）
1. 生成代码时必须手动运行相应的maven命令（比如`clean`, `compile`)，才能生效。

Run `Hello.java` in your IDE.