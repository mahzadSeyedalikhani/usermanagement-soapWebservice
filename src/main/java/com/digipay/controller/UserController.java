package com.digipay.controller;

import com.digipay.model.entity.User;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.List;
@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface UserController {

    @WebMethod
    void saveUserInfo(@WebParam(name = "userName") String username, @WebParam(name = "nationalCode")String nationalCode, @WebParam(name = "roleId") String[] roleId);
    @WebMethod
    List<User> displayUser();
    @WebMethod
    void updateUser(@WebParam(name = "id")Long id, @WebParam(name = "name")String name);
    @WebMethod
    void removeUser(@WebParam(name = "id")Long id);

    @WebMethod
    User getUserByNid(@WebParam(name = "nationalCode") String nid);

}
