# TMPS_LabN1
### Java version 8 update 201 (Build 1.8.0_201-b09)
*Simple Factory, Abstract Factory, Builder, Singleton, Prototype.*
___
It is a laboratory work by number 1, where 5 template have been used.
The conception of the project:
We have a singleton (An interface which creates only ones class, in other cases, returns pointer to existing one already)
Abastact Factory class created from interface creates object which extends Vehicle from interface.
For creation of vehicle we need parts (Glass, Body, Wheels, and others), they can be created by Builder template:
```
FactoryName.createPartName();
```
If Factory has enoght parts it can create vehicle and uses one type of each part.
```
Vehicle vehicle = FactoryName.createVehicle( String nameOfVehicle );
```
After vehicle was created you can set parameters for it (String name, Double price)
```
vehicle.name = "some name";
vehicle.price = 9999999.99;
```

You can clone vehicle which you like, with the same params.

```
Vehicle vehicleClone = vehicle.clone();
```

Simple Factory creates in project Shop Logic. This means that, you have main class Shop which you extend with new class
and add your functionality to existing one. In this project Shops sells vehicles created by Factories, getting money and sest
to vehicles Null.

![Visualisaton](https://i.ibb.co/hVW3BsL/Help.jpg)
