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
npc.checkHPstatus();
npc.attack(tree);
npc.attack(npc);
```

I had a method printNPCInfo, but it gets String List, but its too uncomfortable to create a variable a put there data every time manualy, so for this problem Adapter pattern has been chosed.

Method getData gets params from Npc and returns String List so we could use it in printNPCInfo.
```
NPCInfo.printNPCInfo( Adapter.getData( npc ) );
```
![alt text](https://i.imgur.com/LBOMIjJ.png "")

For Facade pattern in program were created a lot of classes with parameters which forms a Save system. For creating Save object we need send World, Npc, Trees, History object, which has their own needs for creation (time, map, data for example). But user dont have access to this part of program, and can use only 2 methods, createSaveFile and loadFromSaveFile.
```
Save save = Facade.SaveGame.createSaveFile();
LoadGame.loadFromSaveFile(save);
```
Also program has an "implementation" for Cloud save upload/download by Proxy pattern. Program has 2 classes: Server and ProxyMod. We have access only to proxyMod which gaves possibility to ask Proxy to load or download save from/to Server. Proxy getting Save object and trying to access serverm, if operation succeeded Server tells it to Proxy, and ProxyMod does the same to the user.
```
ProxyMod.loadToServerSave(save);
```
