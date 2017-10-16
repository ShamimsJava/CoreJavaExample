## Example-01

```java
public class Output {

    public static void main(String args[]) {
          double a, b, c;
          a = 3.0 / 0;
          b = 0 / 4.0;
          c = 0 / 0.0;
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);
      }
  }
```

## Example-02

```java
public class Output {

    public static void main(String args[]) {
        double a, b, c;
        a = 3.0 / 0;
        b = 0 / 4.0;
        c = 0 / 0.0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
```

## Example-03

```java
public class Increment {

    public static void main(String args[]) {
        int g = 3;
        System.out.print(++g * 8);
    }
}
```

## Example-04

```java
public class Area {

    public static void main(String args[]) {
        double r, pi, a;
        r = 9.8;
        pi = 3.14;
        a = pi * r * r;
        System.out.println(a);
    }
}
```

## Example-05

```java
public class AsciiCode {

    public static void main(String args[]) {
        char var1 = 'A';
        char var2 = 'a';
        System.out.println((int) var1 + " " + (int) var2);
    }
}
```

## Example-06

```java
public class Array_output {

    public static void main(String args[]) {
        char array_variable[] = new char[10];
        for (int i = 0; i < 10; ++i) {
            array_variable[i] = 'i';
            System.out.print(array_variable[i] + " ");
            i++;
        }
    }
}
```

## Example-07

```java
public class MainClass {

    public static void main(String args[]) {
        char a = 'A';
        a++;
        System.out.print((int) a);
    }
}
```

## Example-08

```java
public class MainClass {

    public static void main(String args[]) {
        boolean var1 = true;
        boolean var2 = false;
        if (var1) {
            System.out.println(var1);
        } else {
            System.out.println(var2);
        }
    }
}
```

## Example-09

```java
public class BooleanOperators {

    public static void main(String args[]) {
        boolean var1 = true;
        boolean var2 = false;
        System.out.println((var2 & var2));
    }
}
```

## Example-10

```java
public class Evaluate {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        int d[] = a;
        int sum = 0;
        for (int j = 0; j < 3; ++j) {
            sum += (a[j] * d[j + 1]) + (a[j + 1] * d[j]);
        }
        System.out.println(sum);
    }
}
```

## Example-11

```java
public class ArrayOutput {

    public static void main(String args[]) {
        int array_variable[] = new int[10];
        for (int i = 0; i < 10; ++i) {
            array_variable[i] = i / 2;
            array_variable[i]++;
            System.out.print(array_variable[i] + " ");
            i++;
        }
    }
}
```

## Example-12

```java
public class VariableScope {

    public static void main(String args[]) {
        int x;
        x = 5;
        {
            int y = 6;
            System.out.print(x + " " + y);
        }
        // System.out.println(x + " " + y); // Compilation error
    }
}
```

## Example-13

```java
public class DynamicInitialization {

    public static void main(String args[]) {
        double a, b;
        a = 3.0;
        b = 4.0;
        double c = Math.sqrt(a * a + b * b);
        System.out.println(c);
    }
}
```

## Example-14

```java
public class CharIncrement {

    public static void main(String args[]) {
        char c1 = 'D';
        char c2 = 84;
        c2++;
        c1++;
        System.out.println(c1 + " " + c2);
    }
}
```

## Example-15

```java
public class Conversion {

    public static void main(String args[]) {
        double a = 295.04;
        int b = 300;
        byte c = (byte) a;
        byte d = (byte) b;
        System.out.println(c + " " + d);
    }
}
```

## Example-16

```java
class A {

    final public int calculate(int a, int b) {
        return 1;
    }
}

class B extends A {

//    @Override
//    public int calculate(int a, int b) { // compilation error
//        return 2;
//    }
}

public class Output {

    public static void main(String args[]) {
        B object = new B();
        // System.out.print("b is " + b.calculate(0, 1)); // compilation error
    }
}
```

## Example-17

```java
public class MainArguments {

    public static void main(String[] args) {
        String[][] argument = new String[2][2];
        int x;
        argument[0] = args;
        x = argument[0].length;
        for (int y = 0; y < x; y++) {
            System.out.print(" " + argument[0][y]);
        }
    }
}
```

## Example-18

```java
public class C {

    public void main(String[] args) {
        System.out.println("Hello" + args[0]);
    }
}
// Runtime error
```

## Example-19

```java
public class ArrayOutput {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr);
    }
}
```

## Example-20

```java
public class ArrayOutput {

    public static void main(String args[]) {
        int array_variable[] = new int[10];
        for (int i = 0; i < 10; ++i) {
            array_variable[i] = i;
            System.out.print(array_variable[i] + " ");
            i++;
        }
    }
}
```

## Example-21

```java
public class MultidimentionArray {

    public static void main(String args[]) {
        int arr[][] = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                arr[i][j] = j + 1;
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                sum += arr[i][j];
            }
        }
        System.out.print(sum);
    }
}
```

## Example-22

```java
public class Evaluate {

    public static void main(String args[]) {
        int arr[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 6;
        n = arr[arr[n] / 2];
        System.out.println(arr[n] / 2);
    }
}
```

## Example-23

```java
public class ArrayOutput {

    public static void main(String args[]) {
        char array_variable[] = new char[10];
        for (int i = 0; i < 10; ++i) {
            array_variable[i] = 'i';
            System.out.print(array_variable[i] + "");
        }
    }
}
```

## Example-24

```java
public class ArrayOutput {

    public static void main(String args[]) {
        int array_variable[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                sum = sum + array_variable[i][j];
            }
        }
        System.out.print(sum / 5);
    }
}
```

