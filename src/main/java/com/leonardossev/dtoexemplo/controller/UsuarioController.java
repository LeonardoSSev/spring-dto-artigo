package com.leonardossev.dtoexemplo.controller;

import com.leonardossev.dtoexemplo.model.dto.UsuarioDTO;
import com.leonardossev.dtoexemplo.model.entity.UsuarioEntity;
import com.leonardossev.dtoexemplo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDTO> salvarUsuario(final @RequestBody UsuarioEntity usuario) {
        return new ResponseEntity<UsuarioDTO>(this.usuarioService.salvarUsuario(usuario), HttpStatus.CREATED);
    }

}
