package org.mochica.AppDelivery.Service;

import org.mochica.AppDelivery.DTO.RegisterDTO;

import java.util.List;

public interface UserService {

    List<RegisterDTO> list();

    Boolean add(RegisterDTO registerDTO);
    Boolean update(Long id, RegisterDTO registerDTO);
    Boolean delete(Long id, RegisterDTO registerDTO);



}
