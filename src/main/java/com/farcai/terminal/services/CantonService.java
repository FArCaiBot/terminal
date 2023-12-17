package com.farcai.terminal.services;

import com.farcai.terminal.projection.interfacebased.closed.CantonClosedView;

import java.util.List;

public interface CantonService {
    List<CantonClosedView> getCantonByIdProvincia(Integer idProvincia);
}
