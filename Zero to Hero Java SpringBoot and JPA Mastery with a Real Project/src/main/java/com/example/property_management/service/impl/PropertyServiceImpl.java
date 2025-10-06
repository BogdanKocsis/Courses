package com.example.property_management.service.impl;

import com.example.property_management.entity.UserEntity;
import com.example.property_management.exception.BusinessException;
import com.example.property_management.exception.ErrorModel;
import com.example.property_management.repository.PropertyRepository;
import com.example.property_management.converter.PropertyConverter;
import com.example.property_management.dto.PropertyDTO;
import com.example.property_management.entity.PropertyEntity;
import com.example.property_management.repository.UserRepository;
import com.example.property_management.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private PropertyConverter propertyConverter;
    @Autowired
    private UserRepository userRepository;

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        PropertyEntity propertyEntity = propertyConverter.convertDTOToEntity(propertyDTO);
        Optional<UserEntity> optionalUserEntity = userRepository.findById(propertyDTO.getUserID());
        if (optionalUserEntity.isPresent()) {
            propertyEntity.setUserEntity(optionalUserEntity.get());
            propertyEntity = propertyRepository.save(propertyEntity);
            propertyDTO = propertyConverter.convertEntityToDTO(propertyEntity);
        } else {
            List<ErrorModel> errorModelList = new ArrayList<>();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setCode("USER_ID_NOT_EXIST");
            errorModel.setMessage("User does not exist");
            errorModelList.add(errorModel);
            throw new BusinessException(errorModelList);
        }
        return propertyDTO;
    }

    @Override
    public List<PropertyDTO> getAllProperties() {
        List<PropertyEntity> listOfProperties = (List<PropertyEntity>) propertyRepository.findAll();
        List<PropertyDTO> propertyDTOList = new ArrayList<>();
        for (PropertyEntity propertyEntity : listOfProperties) {
            PropertyDTO propertyDTO = propertyConverter.convertEntityToDTO(propertyEntity);
            propertyDTOList.add(propertyDTO);
        }
        return propertyDTOList;
    }


    @Override
    public List<PropertyDTO> getAllPropertiesForUser(Long userId) {
        List<PropertyEntity> listOfProperties = propertyRepository.findAllByUserEntityId(userId);
        List<PropertyDTO> propertyDTOList = new ArrayList<>();
        for (PropertyEntity propertyEntity : listOfProperties) {
            PropertyDTO propertyDTO = propertyConverter.convertEntityToDTO(propertyEntity);
            propertyDTOList.add(propertyDTO);
        }
        return propertyDTOList;
    }

    @Override
    public PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId) {
        Optional<PropertyEntity> optionalEntity = propertyRepository.findById(propertyId);
        PropertyDTO propertyDTOUpdated = null;

        if (optionalEntity.isPresent()) {
            PropertyEntity propertyEntity = optionalEntity.get(); //data from database
            propertyEntity.setTitle(propertyDTO.getTitle());
            propertyEntity.setDescription(propertyDTO.getDescription());
            propertyEntity.setPrice(propertyDTO.getPrice());
            propertyEntity.setAddress(propertyDTO.getAddress());
            propertyDTOUpdated = propertyConverter.convertEntityToDTO(propertyEntity);
            propertyRepository.save(propertyEntity);
        }
        return propertyDTOUpdated;
    }

    @Override
    public PropertyDTO updatePropertyDescription(PropertyDTO propertyDTO, Long propertyId) {
        Optional<PropertyEntity> optionalEntity = propertyRepository.findById(propertyId);
        PropertyDTO propertyDTOUpdated = null;

        if (optionalEntity.isPresent()) {
            PropertyEntity propertyEntity = optionalEntity.get(); //data from database
            propertyEntity.setDescription(propertyDTO.getDescription());
            propertyDTOUpdated = propertyConverter.convertEntityToDTO(propertyEntity);
            propertyRepository.save(propertyEntity);
        }
        return propertyDTOUpdated;
    }

    @Override
    public PropertyDTO updatePropertyPrice(PropertyDTO propertyDTO, Long propertyId) {
        Optional<PropertyEntity> optionalEntity = propertyRepository.findById(propertyId);
        PropertyDTO propertyDTOUpdated = null;

        if (optionalEntity.isPresent()) {
            PropertyEntity propertyEntity = optionalEntity.get(); //data from database
            propertyEntity.setPrice(propertyDTO.getPrice());
            propertyDTOUpdated = propertyConverter.convertEntityToDTO(propertyEntity);
            propertyRepository.save(propertyEntity);
        }
        return propertyDTOUpdated;
    }

    @Override
    public void deleteProperty(Long propertyId) {
        propertyRepository.deleteById(propertyId);
    }
}
