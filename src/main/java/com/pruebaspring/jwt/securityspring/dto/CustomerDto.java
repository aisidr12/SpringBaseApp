package com.pruebaspring.jwt.securityspring.dto;

public record CustomerDto(Long cedula,String fullName, String email, String numeroMovil,Integer Active,String password) {
}
