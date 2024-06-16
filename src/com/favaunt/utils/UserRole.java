/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.favaunt.utils;

/**
 *
 * @author deepratnaawale
 */
public enum UserRole {

    UNKNOWN(""), RECEPTIONIST("Receptionist"), NURSE("Nurse"), ADMIN("Admin"), DOCTOR("Doctor");

    public String value;

    UserRole(final String value) {
        this.value = value;
    }

    public static UserRole getUserRole(final String value) {
        final UserRole[] userRoles = UserRole.values();

        for (final UserRole userRole : userRoles) {
            if (userRole.value.equalsIgnoreCase(value)) {
                return userRole;
            }
        }

        return UNKNOWN;
    }

}
