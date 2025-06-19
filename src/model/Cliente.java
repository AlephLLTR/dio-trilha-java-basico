package model;

import java.math.BigDecimal;

public class Cliente {

    private Integer clienteId;
    private String agenciaId;
    private String clienteNome;
    private BigDecimal saldo;

    public Cliente() {
    }

    public Cliente(Integer clienteId, String agenciaId, String clienteNome, BigDecimal saldo) {
        this.clienteId = clienteId;
        this.agenciaId = agenciaId;
        this.clienteNome = clienteNome;
        this.saldo = saldo;
    }

    public Integer getclienteId() {
        return clienteId;
    }

    public void setclienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getAgenciaId() {
        return agenciaId;
    }

    public void setAgenciaId(String agenciaId) {
        this.agenciaId = agenciaId;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String cliente) {
        this.clienteNome = cliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}