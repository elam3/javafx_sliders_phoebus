# Playing With JavaFX

## Sliders

* Added two sliders:
  * Slider on top will decrement/increment on F3/F4.
  * Slider on bottom will decrement/increment on F7/F8.

## Requirements

```
$ java -version
java version "11.0.1" 2018-10-16 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.1+13-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.1+13-LTS, mixed mode)

$ javac -version
javac 11.0.1

$ # Compiling
$ ## Example PATH_TO_FX
$ ## PATH_TO_FX=/opt/javafx-sdk-11.0.1/lib
$ javac --module-path $PATH_TO_FX --add-modules=javafx.controls HelloSlider.java
$ java --module-path $PATH_TO_FX --add-modules=javafx.controls HelloSlider
```
