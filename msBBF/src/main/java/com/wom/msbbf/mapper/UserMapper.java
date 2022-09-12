package com.everis.msusers.be.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.everis.msusers.be.dto.UserBusRegisterDTO;
import com.everis.msusers.be.dto.UserDTO;
import com.everis.msusers.be.dto.UserRegisterRequestDTO;
import com.everis.msusers.be.dto.UserRespDTO;

@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	UserDTO userRequestDTOToUserDTO(UserRegisterRequestDTO userRegisterDTO);
	
	UserDTO userToUserRespDTO(UserRespDTO userRestDTO);
	
	UserDTO userBusRegisterDTOToUserDTO(UserBusRegisterDTO userBusRegisterDTO);
	
}
