package com.secuho.springstudy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AnnouncementController {

    Announcement Anno = new Announcement();
    private final AnnouncementRepository AnnoRepo;

    @GetMapping("/anno")
    String announce(Model model) {
        List<Announcement> result = AnnoRepo.findAll();
        System.out.println(result);
        System.out.println(Anno.toString());
        model.addAttribute("announces", result);
        // model.addAttribute("date", "5월");
        return "announce.html";
    }
}
