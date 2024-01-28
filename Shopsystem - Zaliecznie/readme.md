Aby skompilować system Sklepu:
```
javac -d bin src/*.java
```

Testy (Nie zapomnij skompilowac glowny system):
```
javac -cp bin -d bin test/ShopTest.java
java -cp bin shop.ShopTest
```