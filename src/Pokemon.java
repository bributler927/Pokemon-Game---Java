public class Pokemon {
    private String name;
    private String type1;
    private String type2;
    private int hp;
    private int attack;
    private int defense;

    //gets and sets name of pokemon
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //gets and sets primary type
    public String getType1() {
        return type1;
    }
    public void setType1(String type1) {
        this.type1 = type1;
    }

    //gets and sets secondary type
    public String getType2() {
        return type2;
    }
    public void setType2(String type2) {
        this.type2 = type2;
    }

    //gets and sets HP
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    //gets and sets attack stat
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }

    //gets and sets defense stat
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    @Override
    public String toString()  {
        return "\nPokemon = " + getName() + ", " + getHp();
    }
}
