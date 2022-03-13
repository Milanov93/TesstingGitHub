package DefineAnInterfacePerson;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<Rebel> rebels = new ArrayList<>();
        List<Citizen> citizens = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            if (data.length == 4){
              citizens.add(  new Citizen(data[0],Integer.parseInt(data[1]),data[2],data[3] ));

            continue;
            }else if (data.length == 3){

                rebels.add(new Rebel(data[0],Integer.parseInt(data[1]),data[2] ));
                continue;
            }else {

                continue;
            }


        }
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String name = command;

            citizens.stream()
                    .filter(citizen -> citizen.getName().equals(name))
                    .findFirst()
                    .ifPresent(Citizen::buyFood);

            rebels.stream()
                    .filter(rebel -> rebel.getName().equals(name))
                    .findFirst()
                    .ifPresent(Rebel::buyFood);

            command = scanner.nextLine();

        }
        int i = citizens.stream()
                .map(Citizen::getFood).reduce(0, Integer::sum)+
                rebels.stream()
                        .map(Rebel::getFood).reduce(0, Integer::sum);

        System.out.println(i);


    }
}
