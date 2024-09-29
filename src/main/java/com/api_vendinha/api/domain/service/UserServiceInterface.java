package com.api_vendinha.api.domain.service;

import com.api_vendinha.api.domain.dtos.request.UserRequestDto;
import com.api_vendinha.api.domain.dtos.response.UserResponseDto;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;
import java.util.List;

/**
 * Interface que define os serviços relacionados a usuários.
 *
 * Esta interface fornece um contrato para a implementação dos serviços de usuários,
 * especificando os métodos que devem ser fornecidos pelas classes que a implementam.
 */
public interface UserServiceInterface {

    /**
     * Salva um novo usuário ou atualiza um usuário existente.
     *
     * @param userRequestDto DTO que contém os dados do usuário a ser salvo ou atualizado.
     * @return DTO com as informações do usuário salvo, incluindo o ID gerado e outros detalhes.
     */
    UserResponseDto save(UserRequestDto userRequestDto);

    UserResponseDto atualizar(Long id, UserRequestDto userRequestDto);

    UserResponseDto buscar(Long id);

    UserResponseDto desativar(Long id, UserRequestDto userRequestDto);

    UserResponseDto buscartodos(Long id, UserRequestDto userRequestDto);

    List<UserResponseDto> buscarTodos();

    UserResponseDto deletar(Long id, UserRequestDto userRequestDto);


    UserResponseDto deletar(Long id);
}
