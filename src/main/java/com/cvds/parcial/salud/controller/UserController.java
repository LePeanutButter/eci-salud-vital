package com.cvds.parcial.salud.controller;

import com.cvds.parcial.salud.dto.MedicalAppointmentDTO;
import com.cvds.parcial.salud.model.MedicalAppointment;
import com.cvds.parcial.salud.service.DoctorService;
import com.cvds.parcial.salud.service.MedicalAppointmentService;
import com.cvds.parcial.salud.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    DoctorService doctorService;
    @Autowired
    UserService userService;
    @Autowired
    MedicalAppointmentService medicalAppointmentService;

    @GetMapping(value = "/appointment")
    @Operation(summary = "Gets appointments")
    @ApiResponse(responseCode = "200", description = "Appointments gotten successfully")
    public ResponseEntity<List<MedicalAppointment>> getMedicalAppointments() {
        List<MedicalAppointment> medicalAppointments = medicalAppointmentService.getMedicalAppointments();
        return ResponseEntity.ok(medicalAppointments);
    }

    @GetMapping(value = "/appointment")
    @Operation(summary = "Gets appointment by id")
    public ResponseEntity<MedicalAppointment> getMedicalAppointmentById(@RequestParam String id) {
        MedicalAppointment medicalAppointment = medicalAppointmentService.getMedicalAppointmentById(id);
        return ResponseEntity.ok(medicalAppointment);
    }

    @PostMapping(value = "/appointment")
    @Operation(summary = "Posts appointment")
    public ResponseEntity<String> postMedicalAppointment(@RequestBody MedicalAppointmentDTO medicalAppointmentDTO) {
        medicalAppointmentService.createMedicalAppointment(medicalAppointmentDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(value = "/appointment")
    @Operation(summary = "Updates appointment")
    public ResponseEntity<String> putMedicalAppointment(
            @RequestParam String id ,
            @RequestBody MedicalAppointmentDTO medicalAppointmentDTO
    ) {
        medicalAppointmentService.updateMedicalAppointment(id, medicalAppointmentDTO);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping(value = "/appointment")
    @Operation(summary = "Deletes appointment")
    public ResponseEntity<Void> deleteMedicalAppointment(@RequestParam String id) {
        medicalAppointmentService.deleteMedicalAppointment(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
