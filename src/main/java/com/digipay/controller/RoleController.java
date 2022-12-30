package com.digipay.controller;

import com.digipay.model.entity.Role;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.List;
@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface RoleController {
    @WebMethod
    void saveRoleInfo(@WebParam(name = "roleTitle") String roleTitle, @WebParam(name = "permissionId") String[] permissionId);
    @WebMethod
    List<Role> displayUserRole();
    @WebMethod
    void updateUserRole(@WebParam(name="id") Long id, @WebParam(name = "name") String name);
    @WebMethod
    void removeUserRole(@WebParam(name = "id") Long id);
}
