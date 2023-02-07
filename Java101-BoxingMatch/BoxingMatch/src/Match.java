import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;
    int totalpunchf1;
    int totalpunchf2;
    Match(Fighter f1,Fighter f2, int maxWeight,int minWeight){
        this.f1= f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }
    void run() {
            if (isWeight()) {
                fight(this.f1, this.f2);
            } else {
                System.out.println("sikletler uyuşmuyor!");
            }
        }


    void fight(Fighter fghtr1,Fighter fghtr2 ) {
        Random rnd = new Random();
        while (true) {
            int rndsayi = rnd.nextInt(2);
            if (rndsayi == 1) {
                if (this.f1.health==0 || this.f2.health==0){
                    break;
                }
                this.totalpunchf2++;
                System.out.println("=========================");
                System.out.println(this.f2.name + " yumruk attı...");
                this.f1.health -= this.f2.damage;
                System.out.println(this.f1.name + " canı = " + this.f1.health);
            } else {
                if (this.f2.health==0||this.f1.health==0){
                    break;
                }
                this.totalpunchf1++;
                System.out.println("=========================");
                System.out.println(this.f1.name + " yumruk attı...");
                this.f2.health -= this.f1.damage;
                System.out.println(this.f2.name + " canı = " + this.f2.health);
            }
        }
    }

    boolean isWeight() {
        return ((this.f1.weight<=maxWeight && this.f1.weight>=minWeight)&&(this.f2.weight<=maxWeight&&this.f2.weight>=minWeight));
    }

}
