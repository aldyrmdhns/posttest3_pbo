public class Hero extends Character{
    private int rarity;
    private String constellation;
    private String description;

    public Hero(String isName, String isTitle, String isElement, String isAssociation, int isRarity, String isConstellation, String isDescription){
        super(isName, isTitle, isElement, isAssociation);
        this.rarity = isRarity;
        this.constellation = isConstellation;
        this.description = isDescription;
    }

    public void Display(){
        System.out.println("=====================================");
        System.out.println("| Name          : " + this.name);
        System.out.println("| Title         : " + this.title);
        System.out.println("| Element       : " + this.element);
        System.out.println("| Association   : " + this.association);
        System.out.println("| Rarity        : " + this.rarity);
        System.out.println("| Constellation : " + this.constellation);
        System.out.println("| Description   : " + this.description);
        System.out.println("=====================================");
    }

    public int getRarity() {
        return this.rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public String getConstellation() {
        return this.constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
