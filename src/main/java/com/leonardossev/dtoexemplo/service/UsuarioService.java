package com.leonardossev.dtoexemplo.service;

import com.leonardossev.dtoexemplo.model.dto.UsuarioDTO;
import com.leonardossev.dtoexemplo.model.entity.UsuarioEntity;
import com.leonardossev.dtoexemplo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioDTO salvarUsuario(UsuarioEntity usuario) {
        var usuarioSalvo = this.usuarioRepository.save(usuario);

        return usuarioSalvo.obterUsuarioDTO();
    }
}
