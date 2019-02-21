# TMPS_LabN2
### Java version 8 update 201 (Build 1.8.0_201-b09)
* Adapter, Bridge, Facade, Flyweight, Proxy.
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

TreeType oakType = new TreeType("Oak", "Green");
Tree oak = new Tree(56, 34, 76, 1, 4, 4, oakType);
```
The best pattern for NPC in project is Bridge becouse we will have posibilities to extend it the way we need and in the same time keep the compatibility between them and components in project which works with Npc data type.

We have Npc data type which has name, hp, and 3D position (x,y,z), method attack which does 0 dmg and checkHP method.

Also we create 2 new type of classes: Mech and Kaiju extended from class Npc.
```
Mecha mecha01 = new Mecha("Eva01", "Mecha_3d", 15, 15, 0, 100, 14, 3);
Kaiju angel05 = new Kaiju("Ramiel", "Eva01_3d", 55, 155, 0, 350, 45, 2);
```
![alt text](https://i.imgur.com/upyWiKk.png "")

They have methods for cheking their HP status and attack which can get NPC type or Tree. For Npc variant - damage to the chosen Npc, for Tree its getting status "destroyed"
```
checkHPstatus();
```