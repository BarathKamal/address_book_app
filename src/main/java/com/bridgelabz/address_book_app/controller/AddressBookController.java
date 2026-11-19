package com.bridgelabz.address_book_app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

// uc2: Create a REST Controller to demonstrate various HTTP methods
@RestController
@RequestMapping("/api/addressbook")
public class AddressBookController {

    // Returns all address book records
    @GetMapping
    public ResponseEntity<Map<String, String>> getAllAddressBooks() {
        return ResponseEntity.ok(
                Map.of("message", "GET request successful")
        );
    }

    // Returns an address book record by ID
    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getAddressBookById(
            @PathVariable int id) {

        return ResponseEntity.ok(
                Map.of(
                        "message", "GET by ID request successful",
                        "id", id
                )
        );
    }

    // Accepts a POST request with JSON data
    @PostMapping
    public ResponseEntity<Map<String, Object>> createAddressBook(
            @RequestBody Map<String, Object> request) {

        return ResponseEntity.status(HttpStatus.CREATED).body(
                Map.of(
                        "message", "POST request successful",
                        "data", request
                )
        );
    }

    // Accepts a PUT request to update a record by ID
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> updateAddressBook(
            @PathVariable int id,
            @RequestBody Map<String, Object> request) {

        return ResponseEntity.ok(
                Map.of(
                        "message", "PUT request successful",
                        "id", id,
                        "updatedData", request
                )
        );
    }

    // Accepts a DELETE request by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deleteAddressBook(
            @PathVariable int id) {

        return ResponseEntity.ok(
                Map.of(
                        "message", "DELETE request successful",
                        "id", id
                )
        );
    }
}

