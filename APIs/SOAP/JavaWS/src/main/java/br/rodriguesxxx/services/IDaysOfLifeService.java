package br.rodriguesxxx.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

import java.util.Date;

@WebService
@SOAPBinding (style = Style.RPC)
public interface IDaysOfLifeService {

    //    public Integer calculate(Date dateOfBirth);
    @WebMethod
    public String calculate(String year, String month, String day);

}
