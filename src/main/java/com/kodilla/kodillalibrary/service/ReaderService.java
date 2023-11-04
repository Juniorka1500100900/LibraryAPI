package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.Reader;
import com.kodilla.kodillalibrary.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {
    private final ReaderRepository readerRepository;

    @Autowired
    public ReaderService(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    public List<Reader> getAllReaders() {
        return (List<Reader>) readerRepository.findAll();
    }

    public Reader getReaderById(Long id) {
        return readerRepository.findById(id).orElse(null);
    }

    public Reader addReader(Reader reader) {
        return readerRepository.save(reader);
    }

    public Reader updateReader(Long id, Reader reader) {
        if (readerRepository.existsById(id)) {
            reader.setId(id);
            return readerRepository.save(reader);
        }
        return null;
    }

    public void deleteReader(Long id) {
        readerRepository.deleteById(id);
    }

    public List<Reader> findAllReaders() {
        return null;
    }

    public Reader findReaderById(Long readerId) {
        return null;
    }
}