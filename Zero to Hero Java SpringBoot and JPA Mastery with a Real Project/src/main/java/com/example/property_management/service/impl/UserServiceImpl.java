package com.example.property_management.service.impl;

import com.example.property_management.entity.AddressEntity;
import com.example.property_management.repository.AddressRepository;
import com.example.property_management.repository.UserRepository;
import com.example.property_management.converter.UserConverter;
import com.example.property_management.dto.UserDTO;
import com.example.property_management.entity.UserEntity;
import com.example.property_management.exception.BusinessException;
import com.example.property_management.exception.ErrorModel;
import com.example.property_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter userConverter;
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public UserDTO register(UserDTO userDTO) {
        Optional<UserEntity> optionalUserEntity = userRepository.findByOwnerEmail(userDTO.getOwnerEmail());
        if (optionalUserEntity.isPresent()) {
            List<ErrorModel> errors = new ArrayList<>();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setCode("EMAIL_ALREADY_EXISTS");
            errorModel.setMessage("Email already exists");
            errors.add(errorModel);

            throw new BusinessException(errors);
        }
        UserEntity userEntity = userConverter.convertDTOToEntity(userDTO);
        userEntity = userRepository.save(userEntity);

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setHouseNo(userDTO.getHouseNo());
        addressEntity.setStreet(userDTO.getStreet());
        addressEntity.setPostalCode(userDTO.getPostalCode());
        addressEntity.setCity(userDTO.getCity());
        addressEntity.setState(userDTO.getState());
        addressEntity.setCountry(userDTO.getCountry());
        addressEntity.setUserEntity(userEntity);

        addressRepository.save(addressEntity);
        return userConverter.convertEntityToDTO(userEntity);
    }

    @Override
    public UserDTO login(String email, String password) {
        UserDTO userDTO;
        Optional<UserEntity> optionalUserEntity = userRepository.findByOwnerEmailAndPassword(email, password);
        if (optionalUserEntity.isPresent()) {
            userDTO = userConverter.convertEntityToDTO(optionalUserEntity.get());
        } else {
            List<ErrorModel> errorModels = new ArrayList<>();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setCode("INVALID_LOGIN");
            errorModel.setMessage("Invalid email or password");
            errorModels.add(errorModel);

            throw new BusinessException(errorModels);
        }
        return userDTO;
    }
}
