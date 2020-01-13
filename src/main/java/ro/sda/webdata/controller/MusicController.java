package ro.sda.webdata.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.sda.webdata.persistence.music.MusicEntity;
import ro.sda.webdata.service.music.MusicService;

import java.util.List;
import java.util.StringJoiner;

@Controller
@RequestMapping("music")
public class MusicController {
    private final MusicService musicService;

@Autowired
    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @PostMapping("save")
    @ResponseBody
    public String save(@RequestBody String name){
        musicService.save(name);
        return "Saved";
    }

    @GetMapping("all")
    @ResponseBody
    public String findAll(){
        List<MusicEntity> melodies = musicService.findAll();
        StringJoiner joiner = new StringJoiner(",");

        for (MusicEntity music : melodies){
            joiner.add(music.getName());
        }
        return joiner.toString();
    }
}
