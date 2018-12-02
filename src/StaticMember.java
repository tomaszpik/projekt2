public class StaticMember {
    public static void main(String[] args) {

        FamillyMEmber dad = new FamillyMEmber();
        dad.name = "Piotr";
        dad.age =32;

        FamillyMEmber mam = new FamillyMEmber();
        dad.name = "Anna";
        dad.age =31;

        FamillyMEmber kid = new FamillyMEmber();
        dad.name = "Zosia";
        dad.age =3;


        show(mam);
        FamillyMEmber.surname ="Kowalski";
        show(dad);
        show(kid);
        show(mam);

    }

    static void show(FamillyMEmber famillyMEmber){
        System.out.print(famillyMEmber.name);
        System.out.print("  ");
        System.out.print(famillyMEmber.surname);
        System.out.print("  ");
        System.out.print(famillyMEmber.age);
        System.out.println("  lat/a ");

    }
}

class FamillyMEmber{
    static String surname = "Nowak";
    String name;
    int age;

}
