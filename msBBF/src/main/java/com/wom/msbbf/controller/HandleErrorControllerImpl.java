package com.wom.msbbf.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HandleErrorControllerImpl {
//	@Autowired
//	private ControlErrorService controlErrorService;
//
//	@Autowired
//	private AdicionalService adicionalService;
//	
//	private static Logger logger = LoggerFactory.getLogger(HandleErrorControllerImpl.class);
//
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(Exception.class)
//	public ResponseDTO handleValidationExceptions(Exception ex) {
//		ResponseDTO responseDTO = new ResponseDTO();
//		MensajesErrorDTO mensajeError = adicionalService.getMensajeError(ConstantMsg.CODE_500);
//		responseDTO.getError().setCodError(mensajeError.getCodigoError());
//		responseDTO.getError().setMessError(mensajeError.getMensajeError());
//		responseDTO.getError().setUuidError(generateUUID(ex));
//		return responseDTO;
//	}
//
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(HttpMessageNotReadableException.class)
//	public ResponseDTO handleJSONError(HttpMessageNotReadableException ex) {
//		ResponseDTO responseDTO = new ResponseDTO();
//		MensajesErrorDTO mensajeError = adicionalService.getMensajeError(ConstantMsg.CODE_400J, Arrays.asList(ex.getMessage()));
//		responseDTO.getError().setCodError(mensajeError.getCodigoError());
//		responseDTO.getError().setMessError(mensajeError.getMensajeError());
//		responseDTO.getError().setUuidError(generateUUID(ex));
//		return responseDTO;
//	}
//
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(SiecaException.class)
//	public ResponseDTO handleCustomValidationExceptionsSieca(SiecaException ex) {
//		ResponseDTO responseDTO = new ResponseDTO();
//		responseDTO.getError().setCodError(ex.getCodError());
//		responseDTO.getError().setMessError(ex.getMessage());
//		responseDTO.getError().setUuidError(generateUUID(ex));
//		return responseDTO;
//	}
//	
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseDTO handleValidationExceptions(MethodArgumentNotValidException ex) {
//		ResponseDTO responseDTO = controlErrorService.getErrorValidation(ex.getBindingResult()); 
//		responseDTO.getError().setUuidError(generateUUID(ex));
//		return responseDTO;
//	}
//
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(BindException.class)
//	public ResponseDTO handleValidationExceptions(BindException ex) {
//		ResponseDTO responseDTO = controlErrorService.getErrorValidation(ex.getBindingResult()); 
//		responseDTO.getError().setUuidError(generateUUID(ex));
//		return responseDTO;
//	}
//	
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(MissingRequestHeaderException.class)
//	public ResponseDTO handleValidationExceptions(MissingRequestHeaderException ex) {
//		ResponseDTO responseDTO = new ResponseDTO();
//		MensajesErrorDTO mensajeError = adicionalService.getMensajeError(ConstantMsg.CODE_400O, Arrays.asList(ex.getHeaderName()));
//		responseDTO.getError().setCodError(mensajeError.getCodigoError());
//		responseDTO.getError().setMessError(mensajeError.getMensajeError());
//		responseDTO.getError().setUuidError(generateUUID(ex));
//		return responseDTO;
//	}
//	
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
//	public ResponseDTO handleValidationExceptions(MethodArgumentTypeMismatchException ex) {
//		ResponseDTO responseDTO = new ResponseDTO();
//		MensajesErrorDTO mensajeError = adicionalService.getMensajeError(ConstantMsg.CODE_400F, Arrays.asList(ex.getName()));
//		responseDTO.getError().setCodError(mensajeError.getCodigoError());
//		responseDTO.getError().setMessError(mensajeError.getMensajeError());
//		responseDTO.getError().setUuidError(generateUUID(ex));
//		return responseDTO;
//	}
//	
//	public String generateUUID(Object exception) {
//		String uuidError = java.util.UUID.randomUUID().toString();
//		logger.info(uuidError, exception);
//		return uuidError;
//	}
}
