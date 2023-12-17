package com.farcai.terminal.services;

import com.farcai.terminal.entity.Parroquia;
import com.farcai.terminal.projection.interfacebased.closed.ParroquiaClosedView;

import java.util.List;

public interface ParroquiaService {
    List<ParroquiaClosedView> getParroquiaByIdCanton(Integer idCanton);
}
