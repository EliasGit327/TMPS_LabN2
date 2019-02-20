import Rest.Adapter;
import Rest.Facade;
import Rest.Flyweight.*;
import Rest.Bridge.*;
import Rest.Proxy;

public class Main {

    public static void main(String[] args) {

        // Flyweight
        TreeType sakuraType = new TreeType("Sakura", "Pink");

        Tree sakura = new Tree(34, 50, -3, 12, 3, 1, sakuraType);
        sakura.check();

        System.out.println();

        TreeType oakType = new TreeType("Oak", "Green");

        Tree oak = new Tree(56, 34, 76, 1, 4, 4, oakType);
        oak.check();

        System.out.println();

        Mecha mecha01 = new Mecha("Eva01", "Eva01_3d", 15, 15, 0, 100, 14, 3);
        mecha01.checkHPstatus();


        Kaiju angel05 = new Kaiju("Ramiel", "Eva01_3d", 55, 155, 0, 350, 45, 2);
        angel05.checkHPstatus();

        angel05.attack(oak);


        if (oak.isDestroyed)
            System.out.println("Oak is destroyed");

        mecha01.attack(angel05);
        angel05.checkHPstatus();


        Adapter.NPCInfo.printNPCInfo( Adapter.getData( angel05 ) );

        Facade.Save save = Facade.SaveGame.createSaveFile();

        Facade.LoadGame.loadFromSaveFile(save);

        System.out.println("________________________\n");

        Proxy.ProxyMod.loadToServerSave(save);
        Proxy.ProxyMod.turnOnOffServer();

        Proxy.ProxyMod.loadToServerSave(save);

    }

}