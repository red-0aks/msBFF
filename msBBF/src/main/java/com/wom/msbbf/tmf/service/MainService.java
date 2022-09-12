package com.wom.msbbf.tmf.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

	public String getComuna() {
		return "codigo que invoca al endpoint TMF de la comuna";
	}
	
	 public UserDTO findByIdUsuario(Integer id, Integer usuarioConsulta, Boolean esConsulta) throws SiecaException {
	        log.debug("Request to findById id : {}", id);
	        HttpHeaders headers = new HttpHeaders();
	        ResponseEntity<UserDTO> findAll = restTemplate.exchange(String.format("%s%s", url, getByIdpath + id),
	                HttpMethod.GET, new HttpEntity<>(headers), new ParameterizedTypeReference<UserDTO>() {
	                });
	        setTelefonoMascaraUser(findAll.getBody());
	        
	        http://local:8080/geographicAddressValidation/getComuna
	        	


	       if (esConsulta) {
	            this.adicionalService.validarAccesoDatos(FUNCIONALIDAD_CODIGO, findAll.getBody().getUsuarioCrea(),
	                    usuarioConsulta);
	        }



	       return findAll.getBody();
	    }
}
