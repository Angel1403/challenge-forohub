package com.angelv.forohub.domain.topico.service;

import com.angelv.forohub.domain.topico.*;
import com.angelv.forohub.infra.errors.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoService {

    @Autowired
    TopicoRepository topicoRepository;


    public DatosRespuestaTopico registrarTopico(DatosRegistroTopico datosRegistroTopico) {
        var topico = topicoRepository.save(new Topico(datosRegistroTopico));
        return new DatosRespuestaTopico(topico);
    }

    public DatosRespuestaTopico retornaDatosTopico(Long id) {
        validarExistenciaBd(id);
        Topico topico = topicoRepository.getReferenceById(id);
        return new DatosRespuestaTopico(topico);
    }

    private void validarExistenciaBd(Long id) {
        if (!topicoRepository.findById(id).isPresent()) {
            throw new ValidacionDeIntegridad("No fue encontrado ningún tópico con ese id");
        }
    }

    public DatosRespuestaTopico actualizarTopico(Long id, DatosActualizarTopico datosActualizarTopico) {
        validarExistenciaBd(id);
        Topico topico = topicoRepository.getReferenceById(id);
        topico.actualizarDatos(datosActualizarTopico);
        return new DatosRespuestaTopico(topico);
    }

    public void eliminarTopico(Long id) {
        validarExistenciaBd(id);
        topicoRepository.deleteById(id);
    }
}
