Zeby skomiplowac:
`javac -d bin src/*.java`

Zeby uruchomic poszczegolny system:
`java Main`

Testy (Zamien path/to/ z odpowiednia lokacja junit):
```
javac -cp .;path/to/junit.jar -d bin test/*.java
java -cp .;path/to/junit.jar;bin org.junit.runner.JUnitCore ChunkProcessorTest
```


