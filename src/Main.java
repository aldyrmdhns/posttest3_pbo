//Import Library
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(isr);
    static ArrayList<Hero> dataHero = new ArrayList<>(){
        {
            add(new Hero("Kamisato Ayaka", "Frostlake Heron", "Cryo", "Inazuma", 5, "Grus Nivis", "The Elegant Daughter of the Yashiro Commission's Kamisato Clan"));
            add(new Hero("Ningguang", "Eclipsing Star", "Geo", "Liyue", 4, "Opus Aequilibrium", "Tianquan of the liyue qixing"));
            add(new Hero("Jean", "Dandelion Knight", "Anemo", "Mondstat", 5, "Leo Minor", "The Acting Grand Master of MOndstat's Knights of Favonius"));
        }
    };

    static ArrayList<Enemy> dataEnemy = new ArrayList<>(){
        {
            add(new Enemy("Azdaha", "Sealed Lord of Vishaps", "Geo", "World", "Boss", "Dragon"));
            add(new Enemy("Mirror Maiden", "Mirror Envoy", "Cryo", "Fatui", "Elite", "Humanoid"));
            add(new Enemy("Maguu Kenki", "Doll of Calamity", "Anemo & Cryo", "???", "Boss", "Automaton"));
        }
    };

    static ArrayList<Weapon> dataWeapon = new ArrayList<>(){
        {
            add(new Weapon("Mistsplitter Reforged", 5, "Sword", "Mistsplitter's Edge", 47.54));
            add(new Weapon("Memory of Dust", 5, "Catalyst", "Golden Majesty", 45.94));
            add(new Weapon("Elegy for The End", 5, "Bow", "The Parting Refrain", 45.94));
        }
    };

    public static void main(String[] args) throws NumberFormatException, IOException{
        Boolean loop = true;
        int choose = 0;

        while(loop){
            while (true) {
                try {
                    ClearScreen();
                    System.out.println("|=================================|");
                    System.out.println("|          GENSHIN IMPACT         |");
                    System.out.println("|        CHARACTER & WEAPON       |");
                    System.out.println("|=================================|");
                    System.out.println("|  [1]  Display Character         |");
                    System.out.println("|  [2]  Display Weapon            |");
                    System.out.println("|=================================|");
                    System.out.println("|  [3]  Add Character             |");
                    System.out.println("|  [4]  Add Weapon                |");
                    System.out.println("|=================================|");
                    System.out.println("|  [5]  Edit Character            |");
                    System.out.println("|  [6]  Edit Weapon               |");
                    System.out.println("|=================================|");
                    System.out.println("|  [7]  Delete Character          |");
                    System.out.println("|  [8]  Delete Weapon             |");
                    System.out.println("|=================================|");
                    System.out.println("|  [0]  Exit                     |");
                    System.out.println("|=================================|");
                    System.out.print("   >> ");
                    choose = Integer.parseInt(input.readLine());
                    break;
                } catch (Exception e) {
                    ClearScreen();
                    System.out.println(" Masukan Input dengan Benar ! ! !");
                    System.out.println("  Tekan Enter Untuk Kembali");
                    input.readLine();
                }
            }
    
            switch (choose) {
                case 1: ClearScreen(); isDisplayChar(); break;
                case 2: ClearScreen(); isDisplayWeapon(); break;
                case 3: ClearScreen(); isAddChar(); break;
                case 4: ClearScreen(); isAddWeapon(); break;
                case 5: ClearScreen(); isUpdateChar(); break;
                case 6: ClearScreen(); isUpdateWeapon(); break;
                case 7: ClearScreen(); isDeleteChar(); break;
                case 8: ClearScreen(); isDeleteWeapon(); break;
                case 0:
                    ClearScreen();
                    System.out.println(" Adios Amigos~");
                    loop = false;
                    break;
                default:
                    ClearScreen();
                    System.out.println("- Inputan Salah -");
                    input.readLine();
                    break;
            }
        }
    }

    //CRUD Method/Function
    //Read
    static void isDisplayChar() throws IOException{
        int choose;
        int dataHeroSize = dataHero.size();
        int dataEnemySize = dataEnemy.size();
        System.out.println("=====================================");
        System.out.println("  [1] Hero Character");
        System.out.println("  [2] Hostile Character");
        System.out.println("=====================================");
        System.out.print("  >> "); choose = Integer.parseInt(input.readLine());
        System.out.println("=====================================");
        ClearScreen();
        
        if (choose == 1) {
            if (dataHeroSize == 0) {
                System.out.println(" Data Pesanan Masih Kosong ");
            } else{
                for (int i = 0; i < dataHeroSize; i++) {
                    System.out.println("=====================================");
                    System.out.println("| Name          : " + dataHero.get(i).getName());
                    System.out.println("| Title         : " + dataHero.get(i).getTitle());
                    System.out.println("| Element       : " + dataHero.get(i).getElement());
                    System.out.println("| Association   : " + dataHero.get(i).getAssociation());
                    System.out.println("| Rarity        : " + dataHero.get(i).getRarity());
                    System.out.println("| Constellation : " + dataHero.get(i).getConstellation());
                    System.out.println("| Description   : " + dataHero.get(i).getDescription());
                    System.out.println("=====================================");
                    // pesan.get(i).isDisplay(); System.out.println();
                }
            }
        } else if (choose == 2) {
            if (dataEnemySize == 0) {
                System.out.println(" Data Pesanan Masih Kosong ");
            } else{
                for (int i = 0; i < dataEnemySize; i++) {
                    System.out.println("=====================================");
                    System.out.println("| Name          : " + dataEnemy.get(i).getName());
                    System.out.println("| Title         : " + dataEnemy.get(i).getTitle());
                    System.out.println("| Element       : " + dataEnemy.get(i).getElement());
                    System.out.println("| Association   : " + dataEnemy.get(i).getAssociation());
                    System.out.println("| Grade         : " + dataEnemy.get(i).getGrade());
                    System.out.println("| Category      : " + dataEnemy.get(i).getCategory());
                    System.out.println("=====================================");
                    // pesan.get(i).isDisplay(); System.out.println();
                }
            }
        }
        System.out.println(" Press [ENTER] to Continue"); input.readLine();
    }

    static void isDisplayWeapon() throws IOException{
        int dataWeaponSize = dataWeapon.size();
        if (dataWeaponSize == 0) {
            System.out.println(" Data Pesanan Masih Kosong ");
        } else{
            for (int i = 0; i < dataWeaponSize; i++) {
                System.out.println("=====================================");
                System.out.println("| Name          : " + dataWeapon.get(i).getName());
                System.out.println("| Rarity        : " + dataWeapon.get(i).getRarity());
                System.out.println("| Family        : " + dataWeapon.get(i).getFamily());
                System.out.println("| Affix         : " + dataWeapon.get(i).getAffix());
                System.out.println("| Base Attack   : " + dataWeapon.get(i).getBaseAttack());
                System.out.println("=====================================");
                // pesan.get(i).isDisplay(); System.out.println();
            }
            System.out.println(" Press [ENTER] to Continue"); input.readLine();
        }
    }

    //Create
    static void isAddChar() throws NumberFormatException, IOException{
        String heroName, heroTitle, heroElement, heroAssociation, heroConstellation, heroDescription;
        String enemyName, enemyTitle, enemyElement, enemyAssociation, enemyGrade, enemyCategory;
        int heroRarity, choose;
        boolean isInArray = true;
        ClearScreen();

        System.out.println("================================================================");
        System.out.println("|               Which Character You Want to Add                |");
        System.out.println("================================================================");
        System.out.println("|  [1]  Hero ");
        System.out.println("|  [2]  Enemy ");
        System.out.println("================================================================");
        System.out.print("  >> "); choose = Integer.parseInt(input.readLine());
        System.out.println("================================================================");
        ClearScreen();

        if (choose == 1) {
            while (true) {
                try {
                    System.out.println("================================================================");
                    System.out.println("|                       Insert Your Hero                       |");
                    System.out.println("================================================================");
                    System.out.print(" Hero Name           : "); heroName = input.readLine();
                    System.out.print(" Hero Title          : "); heroTitle = input.readLine();
                    System.out.print(" Hero Element        : "); heroElement = input.readLine();
                    System.out.print(" Hero Association    : "); heroAssociation = input.readLine();
                    System.out.print(" Hero Rarity         : "); heroRarity = Integer.parseInt(input.readLine());
                    System.out.print(" Hero Constellation  : "); heroConstellation = input.readLine();
                    System.out.print(" Hero Description    : "); heroDescription = input.readLine();
                    break;    
                } catch (Exception e) {
                    ClearScreen();
                    System.out.println(" There's Wrong Input, please Do it Again");
                    System.out.println("  Press [ENTER] to continue");
                    input.readLine();
                    ClearScreen();
                }
            }
            System.out.println("================================================================");
            
            for (int i = 0; i < dataHero.size(); i++) {
                if (dataHero.get(i).getName().equals(heroName)) {
                    System.out.println(" - Your Character's already in the database !!! ");
                    System.out.println("  Press [ENTER] to continue"); input.readLine();
                    isInArray = false;
                }
            }
    
            if (isInArray) {
                Hero addHero = new Hero(heroName, heroTitle, heroElement, heroAssociation, heroRarity, heroConstellation, heroDescription);
                dataHero.add(addHero);
                System.out.println("                Successfully Added Your Character               ");
                System.out.println("================================================================");
                System.out.println("  Press [ENTER] to continue");
                input.readLine();
            }
        } else if (choose == 2){
            while (true) {
                try {
                    System.out.println("================================================================");
                    System.out.println("|                      Insert Your Enemy                       |");
                    System.out.println("================================================================");
                    System.out.print(" Enemy Name           : "); enemyName = input.readLine();
                    System.out.print(" Enemy Title          : "); enemyTitle = input.readLine();
                    System.out.print(" Enemy Element        : "); enemyElement = input.readLine();
                    System.out.print(" Enemy Association    : "); enemyAssociation = input.readLine();
                    System.out.print(" Enemy Grade          : "); enemyGrade = input.readLine();
                    System.out.print(" Enemy Category       : "); enemyCategory = input.readLine();
                    break;    
                } catch (Exception e) {
                    ClearScreen();
                    System.out.println(" There's Wrong Input, please Do it Again");
                    System.out.println("  Press [ENTER] to continue");
                    input.readLine();
                    ClearScreen();
                }
            }
            System.out.println("================================================================");
            
            for (int i = 0; i < dataEnemy.size(); i++) {
                if (dataEnemy.get(i).getName().equals(enemyName)) {
                    System.out.println(" - Your Character's already in the database !!! ");
                    System.out.println("  Press [ENTER] to continue"); input.readLine();
                    isInArray = false;
                }
            }
    
            if (isInArray) {
                Enemy addEnemy = new Enemy(enemyName, enemyTitle, enemyElement, enemyAssociation, enemyGrade, enemyCategory);
                dataEnemy.add(addEnemy);
                System.out.println("                Successfully Added Your Character               ");
                System.out.println("================================================================");
                System.out.println("  Press [ENTER] to continue");
                input.readLine();
            }
        }
    }

    static void isAddWeapon() throws NumberFormatException, IOException{
        String name, family, affix;
        int rarity;
        Double baseAttack;
        boolean isInArray = true;
        ClearScreen();

        while (true) {
            try {
                System.out.println("================================================================");
                System.out.println("|                       Insert Your Weapon                     |");
                System.out.println("================================================================");
                System.out.print(" Weapon Name          : "); name = input.readLine();
                System.out.print(" Weapon Rarity        : "); rarity = Integer.parseInt(input.readLine());
                System.out.print(" Weapon Family        : "); family = input.readLine();
                System.out.print(" Weapon Affix         : "); affix = input.readLine();
                System.out.print(" Weapon Base Attack   : "); baseAttack = Double.parseDouble(input.readLine());
                break;    
            } catch (Exception e) {
                ClearScreen();
                System.out.println(" There's Wrong Input, please Do it Again");
                System.out.println("  Press [ENTER] to continue");
                input.readLine();
                ClearScreen();
            }
        }
        System.out.println("================================================================");
        
        for (int i = 0; i < dataWeapon.size(); i++) {
            if (dataWeapon.get(i).getName().equals(name)) {
                System.out.println(" - Your Weapon's already in the database !!! ");
                System.out.println("  Press [ENTER] to continue"); input.readLine();
                isInArray = false;
            }
        }

        if (isInArray) {
            Weapon addWeapon = new Weapon(name, rarity, family, affix, baseAttack);
            dataWeapon.add(addWeapon);
            System.out.println("                Successfully Added Your Weapon                 ");
            System.out.println("================================================================");
            System.out.println("  Press [ENTER] to continue");
            input.readLine();
        }
    }

    //Update
    static void isUpdateChar() throws NumberFormatException ,IOException{
        String findName;
        int choose;
        ClearScreen();

        System.out.println("================================================================");
        System.out.println("|              Which Character You Want to Update              |");
        System.out.println("================================================================");
        System.out.println("|  [1]  Hero ");
        System.out.println("|  [2]  Enemy ");
        System.out.println("================================================================");
        System.out.print("  >> "); choose = Integer.parseInt(input.readLine());
        System.out.println("================================================================");
        ClearScreen();

        if (choose == 1) {
            int dataHeroSize = dataHero.size();
            if (dataHeroSize == 0) {
                System.out.println(" Your Database's Empty! ");
            } else{
                System.out.println("================================================================");
                System.out.println("|                          Hero's List                         |");
                System.out.println("================================================================");
                for (int i = 0; i < dataHero.size(); i++) {
                    System.out.println(i+1 + ". " + dataHero.get(i).getName());
                }
                System.out.println("================================================================");
                System.out.print("  Insert your Hero's Name : "); findName = input.readLine();
                System.out.println("================================================================");
                for (Hero hero : dataHero) {
                    if (hero.getName().equals(findName)) {
                        System.out.println("================================================================");
                        System.out.println("|                       Update Your Hero                       |");
                        System.out.println("================================================================");
                        System.out.print(" Hero Name           : "); hero.setName(input.readLine());
                        System.out.print(" Hero Title          : "); hero.setTitle(input.readLine());
                        System.out.print(" Hero Element        : "); hero.setElement(input.readLine());
                        System.out.print(" Hero Association    : "); hero.setAssociation(input.readLine());
                        System.out.print(" Hero Rarity         : "); hero.setRarity(Integer.parseInt(input.readLine()));
                        System.out.print(" Hero Constellation  : "); hero.setConstellation(input.readLine());
                        System.out.print(" Hero Description    : "); hero.setDescription(input.readLine());
                        System.out.println("================================================================");
                        System.out.println(" Successfully Update Your Hero!!! Press [ENTER] to Continue"); input.readLine();
                        System.out.println("================================================================");
                    }
                }
            }
        } else if(choose == 2){
            int dataEnemySize = dataEnemy.size();
            if (dataEnemySize == 0) {
                System.out.println(" Your Database's Empty! ");
            } else{
                System.out.println("================================================================");
                System.out.println("|                         Enemy's List                         |");
                System.out.println("================================================================");
                for (int i = 0; i < dataEnemy.size(); i++) {
                    System.out.println(i+1 + ". " + dataEnemy.get(i).getName());
                }
                System.out.println("================================================================");
                System.out.print("  Insert your Enemy's Name : "); findName = input.readLine();
                System.out.println("================================================================");
                for (Enemy enemy : dataEnemy) {
                    if (enemy.getName().equals(findName)) {
                        System.out.println("================================================================");
                        System.out.println("|                       Update Your Enemy                       |");
                        System.out.println("================================================================");
                        System.out.print(" Enemy Name           : "); enemy.setName(input.readLine());
                        System.out.print(" Enemy Title          : "); enemy.setTitle(input.readLine());
                        System.out.print(" Enemy Element        : "); enemy.setElement(input.readLine());
                        System.out.print(" Enemy Association    : "); enemy.setAssociation(input.readLine());
                        System.out.print(" Enemy Grade          : "); enemy.setGrade(input.readLine());
                        System.out.print(" Enemy Category       : "); enemy.setCategory(input.readLine());
                        System.out.println("================================================================");
                        System.out.println(" Successfully Update Your Enemy!!! Press [ENTER] to Continue"); input.readLine();
                        System.out.println("================================================================");
                    }
                }
            }
        }
    }

    static void isUpdateWeapon() throws NumberFormatException, IOException{
        String findName;
        ClearScreen();

        System.out.println("================================================================");
        System.out.println("|                        Weapon's List                         |");
        System.out.println("================================================================");
        for (int i = 0; i < dataWeapon.size(); i++) {
            System.out.println(i+1 + ". " + dataWeapon.get(i).getName());
        }
        System.out.println("================================================================");
        System.out.print("  Insert Your Weapon Name: "); findName = input.readLine();
        System.out.println("================================================================");
        for (Weapon weapon : dataWeapon) {
            if (weapon.getName().equals(findName)) {
                System.out.println("================================================================");
                System.out.println("|                       Update Your Weapon                     |");
                System.out.println("================================================================");
                System.out.print(" Weapon Name          : "); weapon.setName(input.readLine());
                System.out.print(" Weapon Rarity        : "); weapon.setRarity(Integer.parseInt(input.readLine()));
                System.out.print(" Weapon Family        : "); weapon.setFamily(input.readLine());
                System.out.print(" Weapon Affix         : "); weapon.setAffix(input.readLine());
                System.out.print(" Weapon Base Attack   : ");  weapon.setBaseAttack(Double.parseDouble(input.readLine()));
                System.out.println("================================================================");
                System.out.println(" Successfully Update Your Weapon!!! Press [ENTER] to Continue"); input.readLine();
                System.out.println("================================================================");
            }
        }
    }
    
    //Delete
    static void isDeleteChar() throws NumberFormatException, IOException{
        String findName;
        String yes = "y", no = "n";
        int choose;
        ClearScreen();

        System.out.println("================================================================");
        System.out.println("|              Which Character You Want to Delete              |");
        System.out.println("================================================================");
        System.out.println("|  [1]  Hero ");
        System.out.println("|  [2]  Enemy ");
        System.out.println("================================================================");
        System.out.print("  >> "); choose = Integer.parseInt(input.readLine());
        System.out.println("================================================================");
        ClearScreen();

        if (choose == 1) {
            if (dataHero.size() == 0) {
                System.out.println(" Your Database's Empty! ");
            } else{
                System.out.println("================================================================");
                System.out.println("|                          Hero's List                         |");
                System.out.println("================================================================");
                for (int i = 0; i < dataHero.size(); i++) {
                    System.out.println(i+1 + ". " + dataHero.get(i).getName());
                }
                System.out.println("================================================================");
                System.out.print("  Insert Your Hero's Name : "); findName = input.readLine();
                System.out.println("================================================================");
                for (int i = 0; i < dataHero.size(); i++) {
                    if (dataHero.get(i).getName().equals(findName)) {
                        dataHero.get(i).Display();
                        while (true) {
                            System.out.println(" Do You Really Want to delete this Data? [y/n]"); String acc = input.readLine();
                            if (acc.equals(yes)) {
                                dataHero.remove(i);
                                System.out.println("Successfully Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else if(acc.equals(no)){
                                System.out.println("Your data's not Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else{
                                System.out.println("Cannot Read your Input");
                                System.out.println("  Press [ENTER] to Continue");
                                input.readLine();
                            }
                        }
                    }
                }
                input.readLine();
            }
        } else if(choose == 2){
            if (dataHero.size() == 0) {
                System.out.println(" Your Database's Empty! ");
            } else {
                System.out.println("================================================================");
                System.out.println("|                         Enemy's List                         |");
                System.out.println("================================================================");
                for (int i = 0; i < dataEnemy.size(); i++) {
                    System.out.println(i+1 + ". " + dataEnemy.get(i).getName());
                }
                System.out.println("================================================================");
                System.out.print("  Insert Your Enemy's Name : "); findName = input.readLine();
                System.out.println("================================================================");
                for (int i = 0; i < dataEnemy.size(); i++) {
                    if (dataEnemy.get(i).getName().equals(findName)) {
                        dataEnemy.get(i).Display();
                        while (true) {
                            System.out.println(" Do You Really Want to delete this Data? [y/n]"); String acc = input.readLine();
                            if (acc.equals(yes)) {
                                dataEnemy.remove(i);
                                System.out.println("Successfully Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else if(acc.equals(no)){
                                System.out.println("Your data's not Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else{
                                System.out.println("Cannot Read your Input");
                                System.out.println("  Press [ENTER] to Continue");
                                input.readLine();
                            }
                        }
                    }
                }
                input.readLine();
            }
        }
    }

    static void isDeleteWeapon() throws NumberFormatException, IOException{
        String findName;
        String yes = "y", no = "n";

        if (dataWeapon.size() == 0) {
            System.out.println(" Your Database's Empty! ");
        } else{
            System.out.println("================================================================");
            System.out.println("|                        Weapon's List                         |");
            System.out.println("================================================================");
            for (int i = 0; i < dataWeapon.size(); i++) {
                System.out.println(i+1 + ". " + dataWeapon.get(i).getName());
            }
            System.out.println("================================================================");
            System.out.print("  Insert Your Weapon's Name : "); findName = input.readLine();
            System.out.println("================================================================");       
            for (int i = 0; i < dataWeapon.size(); i++) {
                if (dataWeapon.get(i).getName().equals(findName)) {
                    dataWeapon.get(i).Display();
                        while (true) {
                            System.out.flush();
                            System.out.println(" Do You Really Want to delete this Data? [y/n]"); String acc = input.readLine();
                            System.out.flush();
                            if (acc.equals(yes)) {
                                dataWeapon.remove(i);
                                System.out.println("Successfully Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else if(acc.equals(no)){
                                System.out.println("Your data's not Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else{
                                System.out.println("Cannot Read your Input");
                                System.out.println("  Press [ENTER] to Continue");
                                input.readLine();
                            }
                        }
                }
            }
            input.readLine();
        }
    }

    //Some Other Methods/Function
    public static void ClearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else{
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("Gagal Membersihkan");
        }
    }
}