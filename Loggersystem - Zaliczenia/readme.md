Aby skompilować system Logger:
```
javac -d bin src/*.java
```

Testy (Nie zapomnij skompilowac glowny system):
```
javac -cp bin -d bin test/LoggerSystemTest.java
java -cp bin LoggerSystemTest
```