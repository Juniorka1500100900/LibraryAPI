package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.Title;
import com.kodilla.kodillalibrary.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService {
    private final TitleRepository titleRepository;

    @Autowired
    public TitleService(TitleRepository titleRepository) {
        this.titleRepository = titleRepository;
    }

    public List<Title> getAllTitles() {
        return (List<Title>) titleRepository.findAll();
    }

    public Title getTitleById(Long id) {
        return titleRepository.findById(id).orElse(null);
    }

    public Title addTitle(Title title) {
        return titleRepository.save(title);
    }

    public Title updateTitle(Long id, Title title) {
        if (titleRepository.existsById(id)) {
            title.setId(id);
            return titleRepository.save(title);
        }
        return null;
    }

    public void deleteTitle(Long id) {
        titleRepository.deleteById(id);
    }
}