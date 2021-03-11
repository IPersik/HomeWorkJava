package home_work_8;

public class Main {

    public static void main(String[] args) {

        Party[] party = {
                new Human("Олег", 600, 1),
                new Cat("Китти", 300, 1),
                new Robot("Ноль", 2000, 5)
        };

        Let[] lets = {
                new Treadmill(100),
                new Wall(1),
                new Treadmill(400),
                new Wall(4),
        };


        for(Party member : party){
            System.out.println(member.getName() + " приступает к испытанию");
            boolean win = true;
            for (Let let: lets){
                System.out.println("Он пробует преодолеть " + let);

                if(let.runAway(member.getMaxDistance()) || let.jumpOver(member.getMaxHeight())){
                    System.out.println("Он преодолевает препятствие успешно");
                }else {
                    win = false;
                    System.out.println("Препятствие оказалось слишком сложным");
                    break;
                }
            }

            if (win)System.out.println(member.getName() + " справился с заданием" + "\n");
            else System.out.println(member.getName() + " проигал" + "\n");
        }
    }
}
