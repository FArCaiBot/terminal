package com.farcai.terminal.services;

import com.farcai.terminal.projection.interfacebased.closed.ParroquiaClosedView;
import com.farcai.terminal.repository.ParroquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParroquiaServiceImpl implements ParroquiaService {

    @Autowired
    private ParroquiaRepository parroquiaRepository;
    @Override
    public List<ParroquiaClosedView> getParroquiaByIdCanton(Integer idCanton) {
        return parroquiaRepository.findAllByCantonIdCanton(idCanton);
    }
}
