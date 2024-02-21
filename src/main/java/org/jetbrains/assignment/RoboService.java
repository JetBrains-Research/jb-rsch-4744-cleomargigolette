package org.jetbrains.assignment;

import org.jetbrains.assignment.dto.LocationDTO;
import org.jetbrains.assignment.dto.MoveDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoboService {

    private List<MoveDTO> moves = new ArrayList<>();

    private Integer x = 0;
    private Integer y = 0;

    public List<MoveDTO> locations(List<LocationDTO> locations) {

        List<MoveDTO> movesTemp = new ArrayList<>();

        movesTemp.add(new MoveDTO(x, y));

        locations.forEach(item -> {
            System.out.println("x" + x);
            System.out.println("y" + y);
            switch (item.getDirection()) {
                case "NORTH":
                    System.out.println("North");
                    y += item.getSteps();
                case "SOUTH":
                    System.out.println("South");
                    y -= item.getSteps();
                case "WEST":
                    System.out.println("West");
                    x -= item.getSteps();
                case "EAST":
                    System.out.println("East");
                    x += item.getSteps();
            }

            movesTemp.add(new MoveDTO(x, y));

        });

        moves.addAll(movesTemp);

        return movesTemp;
    }

    public List<LocationDTO> moves(List<MoveDTO> moves) {



       return null;
    }
}
