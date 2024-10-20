package org.mochica.AppDelivery.Service.Impl;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.WriteResult;
import org.mochica.AppDelivery.DTO.RegisterDTO;
import org.mochica.AppDelivery.Firebase.FBInitialize;
import org.mochica.AppDelivery.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Service
public class UsuarioServiceImpl implements UserService {
    @Autowired
    private FBInitialize fbInitialize;

    @Override
    public List<RegisterDTO> list() {
        return List.of();
    }

    @Override
    public Boolean add(RegisterDTO registerDTO) {
        Map<String, Object> docData = new HashMap<>();
        docData.put("email", registerDTO.getEmail());
        docData.put("password", registerDTO.getPassword());
        docData.put("name", registerDTO.getName());
        docData.put("phone", registerDTO.getPhone());

        CollectionReference users = fbInitialize.getFirestore().collection("users");
        ApiFuture<WriteResult> writeResultApiFuture = users.document().create(docData);

        try{
            if(null != writeResultApiFuture.get()){
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
            return Boolean.FALSE;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean update(Long id, RegisterDTO registerDTO) {
        return null;
    }

    @Override
    public Boolean delete(Long id, RegisterDTO registerDTO) {
        return null;
    }
}
