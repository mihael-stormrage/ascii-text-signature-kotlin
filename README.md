# ASCII Text Signature
ASCII name tag generator

That's a project I've done while learning on [JetBrains Academy][hyperskill]

```sh
Enter name and surname: Ian One
Enter person's status: VIP
888888888888888888888888888888888888888888888888888888888888888888888888888888888
88  ooooo                                   .oooooo.                           88
88  `888'                                  d8P'  `Y8b                          88
88   888   .oooo.   ooo. .oo.             888      888 ooo. .oo.    .ooooo.    88
88   888  `P  )88b  `888P"Y88b            888      888 `888P"Y88b  d88' `88b   88
88   888   .oP"888   888   888            888      888  888   888  888ooo888   88
88   888  d8(  888   888   888            `88b    d88'  888   888  888    .o   88
88  o888o `Y888""8o o888o o888o            `Y8bood8P'  o888o o888o `Y8bod8P'   88
88                                                                             88
88                                                                             88
88                                                                             88
88                                _  _ _ ___                                   88
88                                |  | | |__]                                  88
88                                 \/  | |                                     88
888888888888888888888888888888888888888888888888888888888888888888888888888888888
```

## Requirements
- Download [JDK][openjdk-14] and extract
- Add JDK `/bin` directory to your PATH

## Usage
- Download [release]
- Run where you placed `signature.jar`:
```sh
java -jar signature.jar
```
- Or you can run Kotlin class (see Build)
- Run in `/signature` parent directory:
```sh
kotlin signature.MainKt
```

## Build
- Install [Kotlin compiler][kotlinc], same as JDK (see requirements)
- Run the following from project directory


- To build artifact:
```sh
kotlinc src/signature/Main.kt -include-runtime -d out/artifacts/signature.jar
```
- To build Kotlin class:
```sh
kotlinc src/signature/Main.kt -d out/production/classes
```

[openjdk-14]: http://jdk.java.net/14/
[kotlinc]: https://github.com/JetBrains/kotlin/releases/latest
[hyperskill]: https://hyperskill.org/projects/71
[release]: https://github.com/mihael-stormrage/ascii-text-signature-kotlin/releases
