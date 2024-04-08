# JavaMail Tester

## build

```shell
# Linux/macOS/WSL
$ cd javamail-test/src
$ javac -cp "../lib/mail.jar:." jp/atolycs/mSendTest.java

# Windows
$ cd javamail-test/src
$ javac -cp "../lib/mail.jar;." jp/atolycs/mSendTest.java
```

## Run
```shell

# macOS/Linux/WSL
$ java -cp "../lib/mail.jar:." jp.atolycs.mSendTest

# Windows
$ java -cp "../lib/mail.jar;." jp.atolycs.mSendTest

```


## Move dist classpath
```shell

# Linux/macOS

$ mkdir -p ./dist/jp/atolycs
$ ./build.sh
$ cp src/jp/atolycs/*.class ./dist/jp/atolycs
$ cp -r src/res ./dist


# Windows

$ mkdir ./dist/jp/atolycs
$ .\build.bat
$ copy src/jp/atolycs/*.class ./dist/jp/atolycs
$ copy src/res ./dist

```
