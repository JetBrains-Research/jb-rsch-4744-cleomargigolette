package org.jetbrains.assignment.controller;

import org.jetbrains.assignment.RoboService;
import org.jetbrains.assignment.dto.LocationDTO;
import org.jetbrains.assignment.dto.MoveDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoboController {

    private final RoboService roboService;

    public RoboController(RoboService roboService) {
        this.roboService = roboService;
    }

    @PostMapping("/locations")
    public ResponseEntity<List<MoveDTO>> location(@RequestBody List<LocationDTO> listReq) {

        List<MoveDTO> moveDTOS = this.roboService.locations(listReq);

        return ResponseEntity.ok(moveDTOS);
    }

    @PostMapping("/moves")
    public ResponseEntity<List<LocationDTO>> moves(@RequestBody List<MoveDTO> listReq) {


        return ResponseEntity.ok(null);
    }

}
