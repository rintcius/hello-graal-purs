# Hello Graal Purs

A little POC in Scala that runs the JavaScript that PureScript generates from GraalVM.

## PureScript

Tested with the JavaScript that is generated from:

```
$ mkdir mypurs
$ cd mypurs
$ spago init 
$ spago run
[info] Build succeeded.
🍝
```

## Run from Scala

See [Hello.scala](src/main/scala/example/Hello.scala) for the code.

```
$ sbt run
[info] running example.Hello 
evaluate: .spago/run.js
🍝
evaluate: require('../output/Main').main()
🍝
```
