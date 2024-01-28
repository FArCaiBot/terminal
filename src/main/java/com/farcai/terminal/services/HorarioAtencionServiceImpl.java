package com.farcai.terminal.services;

import com.farcai.terminal.Exception.ResourceNotFoundException;
import com.farcai.terminal.entity.Dia;
import com.farcai.terminal.entity.HorarioAtencion;
import com.farcai.terminal.entity.HorarioAtencionPK;
import com.farcai.terminal.entity.Operadora;
import com.farcai.terminal.projection.classbased.HorarioInputDto;
import com.farcai.terminal.repository.HorarioAtencionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioAtencionServiceImpl implements HorarioAtencionService {

    @Autowired
    private HorarioAtencionRepository horarioRepository;

    @Autowired
    private OperadoraService operadoraService;

    @Autowired
    private DiaService diaService;


    @Override
    public HorarioAtencion guardar(HorarioInputDto horarioAtencion) {
        Operadora operadora = operadoraService.obtenerPorId(horarioAtencion.getIdOperadora());
        Dia dia = diaService.obtenerPorId(horarioAtencion.getIdDia());

        return horarioRepository.save(new HorarioAtencion(operadora, dia,
                horarioAtencion.getHoraApertura(),
                horarioAtencion.getHoraCierre()));
    }

    @Override
    public String eliminarHorario(Integer idOperadora, Integer idDia) {
        HorarioAtencionPK horarioDB = new HorarioAtencionPK(
                operadoraService.obtenerPorId(idOperadora),
                diaService.obtenerPorId(idDia));
        if (!horarioRepository.existsById(horarioDB)) {
            throw new ResourceNotFoundException("Horario", "id", idOperadora.toString());
        }
        horarioRepository.deleteById(horarioDB);
        return "Eliminado con éxito";
    }
}
