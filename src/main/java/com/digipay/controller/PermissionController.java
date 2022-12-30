package com.digipay.controller;

import com.digipay.model.entity.Permission;
import com.digipay.service.PermissionService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.List;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface PermissionController {
    @WebMethod
    void savePermissionInfo(@WebParam(name = "title") String title);

    @WebMethod
    List<Permission> displayPermission();

    @WebMethod
    void updatePermission(@WebParam(name = "id") Long id, @WebParam(name = "name") String name);

    @WebMethod
    void removePermission(@WebParam(name = "id") Long id);
}
