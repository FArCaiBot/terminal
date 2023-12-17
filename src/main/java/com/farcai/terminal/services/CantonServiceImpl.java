package com.farcai.terminal.services;

import com.farcai.terminal.projection.interfacebased.closed.CantonClosedView;
import com.farcai.terminal.repository.CantonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CantonServiceImpl implements CantonService {

    @Autowired
    private CantonRepository cantonRepository;
    @Override
    public List<CantonClosedView> getCantonByIdProvincia(Integer idProvincia) {
        return cantonRepository.findAllByProvinciaIdProvincia(idProvincia);
    }
}
