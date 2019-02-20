# TMPS_LabN2
### Java version 8 update 201 (Build 1.8.0_201-b09)
* Adapter, Bridge, Facade, Flyweight, Proxy.*
___
It is a laboratory work by number 2, where 5 template have been used.
The conception of the project:
We have a VERY simplified game structure. For saving resources we used Flyweight pattern for trees. Its helps us to save resources. At structural point any tree consists of parameters which repeats every time, so we can save resources by just having a referenece to object having those parameters.


We create a type of tree, and after it we create a tree with parameters where one of them is reference to out tree type.
```
 TreeType sakuraType = new TreeType(String name, String color);
 Tree sakura = new Tree(int x, int y, int z, int angleX, int angleY, int size, TreeType typeOfTree);
```
Example:
```
 TreeType sakuraType = new TreeType("Sakura", "Pink");
 Tree sakura = new Tree(34, 50, -3, 12, 3, 1, sakuraType);
```

