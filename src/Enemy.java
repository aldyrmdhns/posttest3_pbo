public class Enemy extends Character{
    private String grade;
    private String category;

    public Enemy(String isName, String isTitle, String isElement, String isAssociation, String isGrade, String isCategory){
        super(isName, isTitle, isElement, isAssociation);
        this.grade = isGrade;
        this.category = isCategory;
    }

    public void Display(){
        System.out.println("=====================================");
        System.out.println("| Name          : " + this.name);
        System.out.println("| Title         : " + this.title);
        System.out.println("| Element       : " + this.element);
        System.out.println("| Association   : " + this.association);
        System.out.println("| Grade : " + this.grade);
        System.out.println("| Category   : " + this.category);
        System.out.println("=====================================");
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
