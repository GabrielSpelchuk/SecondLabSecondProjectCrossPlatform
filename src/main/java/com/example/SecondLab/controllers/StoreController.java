package com.example.SecondLab.controllers;

import com.example.SecondLab.models.Store;
import com.example.SecondLab.repository.StoreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StoreController {

    private final StoreRepository storeRepository;

    public StoreController(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @GetMapping("/stores")
    public String getStores(Model model) {
        List<Store> stores = (List<Store>) storeRepository.findAll();
        model.addAttribute("stores", stores);
        return "stores";
    }
}
