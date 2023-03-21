public class Character {
    protected String name;
    protected String title;
    protected String element;
    protected String association;

    public Character(String isName, String isTitle, String isElement, String isAssociation){
        this.name = isName;
        this.title = isTitle;
        this.element = isElement;
        this.association = isAssociation;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getElement() {
        return this.element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getAssociation() {
        return this.association;
    }

    public void setAssociation(String association) {
        this.association = association;
    }

}
